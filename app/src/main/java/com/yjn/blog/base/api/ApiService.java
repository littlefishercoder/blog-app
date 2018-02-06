package com.cct.gridproject_android.base.api;

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

/**
 * Created by QinZB on 2017/9/3.
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

    @POST("dict/loadData")
    Observable<ResponseBody> loadData(@Body Map postMap);

    @POST("build/queryBuildings")
    Observable<ResponseBody> queryBuildings(@Body Map postMap);

    @POST("build/queryRooms")
    Observable<ResponseBody> queryRooms(@Body Map postMap);

    @POST("company/queryCompanies")
    Observable<ResponseBody> queryCompanies(@Body Map postMap);

    @POST("org/queryOrgs")
    Observable<ResponseBody> queryOrgs(@Body Map postMap);

    @POST("dict/queryDict")
    Flowable<ResponseBody> queryDict(@Body Map postMap);

    @POST("grid/queryGrids")
    Flowable<ResponseBody> queryGrids(@Body Map postMap);

    @POST("part/queryParts")
    Flowable<ResponseBody> queryParts(@Body Map postMap);

    @POST("user/modifyPasswd")
    Flowable<ResponseBody> modifyPasswd(@Body Map postMap);

    @POST("user/queryAllOrgs")
    Flowable<ResponseBody> queryAllOrgs(@Body Map postMap);

    @POST("user/queryOrgStaff")
    Flowable<ResponseBody> queryOrgStaff(@Body Map postMap);

    @POST("org/queryOrg")
    Observable<ResponseBody> queryOrg(@Body Map postMap);

    @POST("org/editOrg")
    Observable<ResponseBody> editOrg(@Body Map postMap);

    @POST("part/queryPart")
    Flowable<ResponseBody> queryPart(@Body Map postMap);

    @POST("kbs/queryKbsDocs")
    Flowable<ResponseBody> queryKbsDocs(@Body Map postMap);

    @POST("part/addPart")
    Observable<ResponseBody> addPart(@Body Map postMap);

    @POST("part/editPart")
    Flowable<ResponseBody> editPart(@Body Map postMap);

    @POST("org/addOrg")
    Observable<ResponseBody> addOrg(@Body Map postMap);

    @POST("resident/queryResidentsInRoom")
    Observable<ResponseBody> queryResidentsInRoom(@Body Map postMap);

    @POST("resident/addResident")
    Observable<ResponseBody> addResident(@Body Map postMap);

    @POST("resident/queryResident")
    Observable<ResponseBody> queryResident(@Body Map postMap);

    @POST("resident/editResident")
    Observable<ResponseBody> editResident(@Body Map postMap);

    @POST("area/queryArea")
    Observable<ResponseBody> queryArea(@Body Map postMap);

    @POST("area/queryAreas")
    Observable<ResponseBody> queryAreas(@Body Map postMap);

    @POST("user/editUser")
    Flowable<ResponseBody> editUser(@Body Map postMap);

    @Multipart
    @POST("upload/image")
    Flowable<ResponseBody> uploadFile(@Part List<MultipartBody.Part> files);

    @POST("build/queryRoom")
    Observable<ResponseBody> queryRoom(@Body Map postMap);

    @POST("build/editRoom")
    Observable<ResponseBody> editRoom(@Body Map postMap);

    @POST("statistic/queryBuildingAndResident")
    Observable<ResponseBody> queryBuildingAndResident(@Body Map postMap);

    @POST("company/addCompany")
    Observable<ResponseBody> addCompany(@Body Map postMap);

    @POST("company/queryCompany")
    Observable<ResponseBody> queryCompany(@Body Map postMap);

    @POST("company/editCompany")
    Observable<ResponseBody> editCompany(@Body Map postMap);

    /*===========================================事件管理 start==================================================*/
    //事件列表
    @POST("event/queryOrgEvents")
    Observable<ResponseBody> qryAllEvents(@Body Map postMap);

    //事件详情
    @POST("event/queryEventDetail")
    Observable<ResponseBody> qryEventDetail(@Body Map postMap);

    //事件上报
    @POST("event/reportEvent")
    Observable<ResponseBody> addNewEvent(@Body Map postMap);

    //事件上报 V2
    @Multipart
    @POST("event/reportEventV2")
    Observable<ResponseBody> addNewEventV2(@PartMap Map<String, RequestBody> postMap, @Part List<MultipartBody.Part> files);

    //查询处理/反馈详情
    @POST("event/queryEventProcess")
    Observable<ResponseBody> queryEventProcessDetail(@Body Map postMap);

    //督办
    @POST("event/supervise")
    Observable<ResponseBody> supervise(@Body Map postMap);

    //事件处理
    @POST("event/processEvent")
    Observable<ResponseBody> dealEvents(@Body Map postMap);

    //事件处理 V2
    @Multipart
    @POST("event/processEventV2")
    Observable<ResponseBody> dealEventsV2(@PartMap Map<String, RequestBody> postMap, @Part List<MultipartBody.Part> files);

    //核查反馈
    @POST("event/checkFeedback")
    Observable<ResponseBody> checkFeedback(@Body Map postMap);
    //核查反馈 V2
    @Multipart
    @POST("event/checkFeedbackV2")
    Observable<ResponseBody> checkFeedbackV2(@PartMap Map<String, RequestBody> postMap, @Part List<MultipartBody.Part> files);

    //事件回退
    @POST("event/sendBack")
    Observable<ResponseBody> eventSendBack(@Body Map postMap);

    //事件转派
    @POST("event/rotate")
    Observable<ResponseBody> eventRotate(@Body Map postMap);

    //关联对象之居民列表
    @POST("resident/queryResidents")
    Observable<ResponseBody> queryRelatedObj(@Body Map postMap);

    //关联对象之房屋列表
    @POST("build/queryRoomsByArea")
    Observable<ResponseBody> queryRoomsByArea(@Body Map postMap);

    //关联对象之部件列表
    @POST("part/queryAreaParts")
    Observable<ResponseBody> queryAreaParts(@Body Map postMap);

    //查询区域下员工(事件转派时可使用该接口)
    @POST("user/queryAreaStaffs")
    Flowable<ResponseBody> queryAreaStaffs(@Body Map postMap);
    /*===========================================事件管理 end==================================================*/
}
