package com.yjn.blog.api;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.text.TextUtils;
import android.util.SparseArray;

import com.alibaba.fastjson.JSON;
import com.yjn.blog.Application;
import com.yjn.common.base.AppManager;
import com.yjn.common.util.NetWorkUtils;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.logging.HttpLoggingInterceptor;
import okio.Buffer;
import okio.BufferedSource;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by yangjianan on 2018/8/7.
 */
public class Api {
    //读超时长，单位：毫秒
    public static final int READ_TIME_OUT = 7676;
    //连接时长，单位：毫秒
    public static final int CONNECT_TIME_OUT = 7676;
    public Retrofit retrofit;
    public ApiService movieService;
    public OkHttpClient okHttpClient;
    private static SparseArray<Api> sRetrofitManager = new SparseArray<>(HostType.TYPE_COUNT);

    /*************************缓存设置*********************/
/*
   1. noCache 不使用缓存，全部走网络

    2. noStore 不使用缓存，也不存储缓存

    3. onlyIfCached 只使用缓存

    4. maxAge 设置最大失效时间，失效则不使用 需要服务器配合

    5. maxStale 设置最大失效时间，失效则不使用 需要服务器配合 感觉这两个类似 还没怎么弄清楚，清楚的同学欢迎留言

    6. minFresh 设置有效时间，依旧如上

    7. FORCE_NETWORK 只走网络

    8. FORCE_CACHE 只走缓存*/

    /**
     * 设缓存有效期为两天
     */
    private static final long CACHE_STALE_SEC = 60 * 60 * 24 * 2;
    /**
     * 查询缓存的Cache-Control设置，为if-only-cache时只查询缓存而不会请求服务器，max-stale可以配合设置缓存失效时间
     * max-stale 指示客户机可以接收超出超时期间的响应消息。如果指定max-stale消息的值，那么客户机可接收超出超时期指定值之内的响应消息。
     */
    private static final String CACHE_CONTROL_CACHE = "only-if-cached, max-stale=" + CACHE_STALE_SEC;
    /**
     * 查询网络的Cache-Control设置，头部Cache-Control设为max-age=0
     * (假如请求了服务器并在a时刻返回响应结果，则在max-age规定的秒数内，浏览器将不会发送对应的请求到服务器，数据由缓存直接返回)时则不会使用缓存而请求服务器
     */
    private static final String CACHE_CONTROL_AGE = "max-age=0";


    //构造方法私有
    private Api(final int hostType) {
        //开启Log
        HttpLoggingInterceptor logInterceptor = new HttpLoggingInterceptor();
        logInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        //缓存
        File cacheFile = new File(Application.getAppContext().getCacheDir(), "cache");
        Cache cache = new Cache(cacheFile, 1024 * 1024 * 100); //100Mb
        //增加头部信息
        Interceptor headerInterceptor = new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request.Builder builder = chain.request().newBuilder();
//                        .addHeader("channel", HeaderConfig.channel)//
//                        .addHeader("deviceNo", HeaderConfig.getDeviceNo())//
//                        .addHeader("token", HeaderConfig.token);
                if (hostType == HostType.TYPE_LOGIN) {
//                    builder.addHeader("Content-Type", "multipart/form-data");
                    builder.addHeader("Content-Type", "application/x-www-form-urlencoded");
                } else {
                    builder.addHeader("Content-Type", "application/json");
                }
                return chain.proceed(builder.build());
            }
        };

        okHttpClient = new OkHttpClient.Builder()//
                .readTimeout(READ_TIME_OUT, TimeUnit.MILLISECONDS)//
                .connectTimeout(CONNECT_TIME_OUT, TimeUnit.MILLISECONDS)//
                .addInterceptor(mRewriteCacheControlInterceptor)//
                .addNetworkInterceptor(mRewriteCacheControlInterceptor)//
                .addInterceptor(headerInterceptor)//
                .addInterceptor(logInterceptor)//
                .addInterceptor(getIns())//
                .cache(cache)//
                .build();

//        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ").serializeNulls().create();
        retrofit = new Retrofit.Builder()//
                .client(okHttpClient)//
//                .addConverterFactory(GsonConverterFactory.create(gson))//
                .addConverterFactory(GsonConverterFactory.create())//
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())//
                .baseUrl(ApiConstants.getHost(hostType))//
                .build();
        movieService = retrofit.create(ApiService.class);
    }


    /**
     * @param hostType TEST_NUM：1 (测试的host)
     */
    public static ApiService getDefault(int hostType) {
        Api retrofitManager = sRetrofitManager.get(hostType);
        if (retrofitManager == null) {
            retrofitManager = new Api(hostType);
            sRetrofitManager.put(hostType, retrofitManager);
        }
        return retrofitManager.movieService;
    }


    /**
     * 根据网络状况获取缓存的策略
     */
    @NonNull
    public static String getCacheControl() {
        return NetWorkUtils.isNetConnected(Application.getAppContext()) ? CACHE_CONTROL_AGE : CACHE_CONTROL_CACHE;
    }

    /**
     * 云端响应头拦截器，用来配置缓存策略
     * Dangerous interceptor that rewrites the server's cache-control header.
     */
    private final Interceptor mRewriteCacheControlInterceptor = new Interceptor() {
        @Override
        public Response intercept(Chain chain) throws IOException {
            Request request = chain.request();
            String cacheControl = request.cacheControl().toString();
            if (!NetWorkUtils.isNetConnected(Application.getAppContext())) {
                request = request.newBuilder()//
                        .cacheControl(TextUtils.isEmpty(cacheControl) ? CacheControl.FORCE_NETWORK : CacheControl.FORCE_CACHE)//
                        .build();
            }
            Response originalResponse = chain.proceed(request);
            if (NetWorkUtils.isNetConnected(Application.getAppContext())) {
                //有网的时候读接口上的@Headers里的配置，你可以在这里进行统一的设置

                return originalResponse.newBuilder()//
                        .header("Cache-Control", cacheControl)//
                        .removeHeader("Pragma")//
                        .build();
            } else {
                return originalResponse.newBuilder()//
                        .header("Cache-Control", "public, only-if-cached, max-stale=" + CACHE_STALE_SEC)//
                        .removeHeader("Pragma")//
                        .build();
            }
        }
    };


    /**
     * @Description 网络拦截器
     **/
    private Interceptor getIns() {
        Interceptor interceptor = new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {


                Request request = chain.request();
                Response response = chain.proceed(request);

                ResponseBody responseBody = response.body();
                long contentLength = responseBody.contentLength();


                if (!bodyEncoded(response.headers())) {
                    BufferedSource source = responseBody.source();
                    source.request(Long.MAX_VALUE); // Buffer the entire body.
                    Buffer buffer = source.buffer();

                    Charset charset = UTF8;
                    MediaType contentType = responseBody.contentType();
                    if (contentType != null) {
                        try {
                            charset = contentType.charset(UTF8);
                        } catch (UnsupportedCharsetException e) {
                            return response;
                        }
                    }

                    if (!isPlaintext(buffer)) {
                        return response;
                    }

                    if (contentLength != 0) {
                        String result = buffer.clone().readString(charset);
                        // 单点登录
                        if (ApiConstants.SINGLE_LOGININ_RESTRICT_CODE.equals(JSON.parseObject(result).getString("code"))) {
                            final Activity curActivity = AppManager.getAppManager().currentActivity();
                            curActivity.runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    new AlertDialog.Builder(curActivity)
                                            .setTitle("提醒")
                                            .setMessage("您的账号在其他地方登陆。您将退出登录")
                                            .setPositiveButton("好的", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    //ActivityUtils.logout();
                                                }
                                            })
                                            .setCancelable(false)
                                            .create()
                                            .show();
                                }
                            });

                        }


                    }

                }
                return response;
            }
        };
        return interceptor;
    }


    private static final Charset UTF8 = Charset.forName("UTF-8");

    private boolean bodyEncoded(Headers headers) {
        String contentEncoding = headers.get("Content-Encoding");
        return contentEncoding != null && !contentEncoding.equalsIgnoreCase("identity");
    }

    static boolean isPlaintext(Buffer buffer) throws EOFException {
        try {
            Buffer prefix = new Buffer();
            long byteCount = buffer.size() < 64 ? buffer.size() : 64;
            buffer.copyTo(prefix, 0, byteCount);
            for (int i = 0; i < 16; i++) {
                if (prefix.exhausted()) {
                    break;
                }
                int codePoint = prefix.readUtf8CodePoint();
                if (Character.isISOControl(codePoint) && !Character.isWhitespace(codePoint)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException e) {
            return false;
        }
    }
}
