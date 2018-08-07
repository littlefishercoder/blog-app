package com.yjn.blog.api;

import java.util.List;
import java.util.Map;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;

/**
 * Created by yangjianan on 2018/8/7.
 */
public interface ApiService {
    @GET(" ")
    Observable<ResponseBody> getBaiduData(@Header("Cache-Control") String cacheControl);

    @FormUrlEncoded
    @POST("login")
    Observable<ResponseBody> login(@FieldMap Map<String, String> postMap);

    @POST("dict/loadData")
    Call<ResponseBody> loadData(@Body Map postMap);

    @GET("user/reportGridMemberGisInfo")
    Flowable<ResponseBody> reportGridMemberGisInfo(@Body Map postMap);

    //事件上报 V2
    @Multipart
    @POST("event/reportEventV2")
    Observable<ResponseBody> addNewEventV2(@PartMap Map<String, RequestBody> postMap, @Part List<MultipartBody.Part> files);
}
