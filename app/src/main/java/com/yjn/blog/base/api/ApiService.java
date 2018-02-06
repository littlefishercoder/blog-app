package com.yjn.blog.base.api;

import java.util.List;
import java.util.Map;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/**
 * @author yang.jianan
 * @date 2018/02/06 09:26.
 * Desc：Api Service
 */

public interface ApiService {
    @GET(" ")
    Observable<ResponseBody> getBaiduData(@Header("Cache-Control") String cacheControl);

    @GET("blog/Test")
    Observable<ResponseBody> getJFinalData(@Header("Cache-Control") String cacheControl);

    @POST(" ")
    Observable<ResponseBody> getIDcardInfo(@Query("app_id") String app_id, //
                                           @Query("image") String image,//
                                           @Query("card_type") int card_type,//
                                           @Query("session_id") String session_id,//
                                           @Query("border_check_flag") boolean border_check_flag);

    @POST("staff/login")
    Observable<ResponseBody> login(@Body Map postMap);

    @POST("dict/queryDict")
    Flowable<ResponseBody> queryDict(@Body Map postMap);

    @Multipart
    @POST("event/reportEventV2")
    Observable<ResponseBody> addNewEventV2(@PartMap Map<String, RequestBody> postMap, @Part List<MultipartBody.Part> files);


    @GET("api/blog/v1/posts/pager")
    Observable<ResponseBody> qryBlogList(@QueryMap Map<String, Object> postMap);
}
