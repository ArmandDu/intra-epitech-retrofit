package com.github.armanddu.intraepitech.services;

import com.github.armanddu.intraepitech.data.pojos.*;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

/**
 * Created by armanddu on 06/08/16 for rest-epitech-client.
 *
 */
public interface EpitechActivityService {

    @GET("/module/board")
    Call<List<ActivitySearch>> searchActivities(@Query("start") String start, @Query("end") String end,
                                                @Query("registered") int registered,
                                                @Query("access_token") String token);


    @GET("/module/{scolaryear}/{codemodule}/{codeinstance}/{codeacti}")
    Call<Activity> getActivity(@Path("scolaryear") String scholarYear,
                               @Path("codemodule") String moduleCode,
                               @Path("codeinstance") String instanceCode,
                               @Path("codeacti") String activityCode,
                               @Query("access_token") String token);

    @GET("/module/{scolaryear}/{codemodule}/{codeinstance}/{codeacti}/registered")
    Call<List<RegisteredUser>> getRegisteredUserForActivity(@Path("scolaryear") String scholarYear,
                                                            @Path("codemodule") String moduleCode,
                                                            @Path("codeinstance") String instanceCode,
                                                            @Path("codeacti") String activityCode,
                                                            @Query("access_token") String token);

    @GET("/module/{scolaryear}/{codemodule}/{codeinstance}/{codeacti}/rdv")
    Call<ResponseBody> getActivityMeetings(@Path("scolaryear") String scholarYear,
                                           @Path("codemodule") String moduleCode,
                                           @Path("codeinstance") String instanceCode,
                                           @Path("codeacti") String activityCode,
                                           @Query("access_token") String token);

    @GET("/module/{scolaryear}/{codemodule}/{codeinstance}/{codeacti}/project")
    Call<ResponseBody> getActivityProject(@Path("scolaryear") String scholarYear,
                                          @Path("codemodule") String moduleCode,
                                          @Path("codeinstance") String instanceCode,
                                          @Path("codeacti") String activityCode,
                                          @Query("access_token") String token);

    @GET("/module/{scolaryear}/{codemodule}/{codeinstance}/{codeacti}/project/file")
    Call<ResponseBody> getActivityProjectFile(@Path("scolaryear") String scholarYear,
                                              @Path("codemodule") String moduleCode,
                                              @Path("codeinstance") String instanceCode,
                                              @Path("codeacti") String activityCode,
                                              @Query("access_token") String token);


    @GET("/module/{scolaryear}/{codemodule}/{codeinstance}/{codeacti}/note")
    Call<List<ActivityGrade>> getRegisteredUsersGradeForActivity(@Path("scolaryear") String scholarYear,
                                                                 @Path("codemodule") String moduleCode,
                                                                 @Path("codeinstance") String instanceCode,
                                                                 @Path("codeacti") String activityCode,
                                                                 @Query("access_token") String token);

    @GET("/module/{scolaryear}/{codemodule}/{codeinstance}/{codeacti}/{codeevent}")
    Call<Event> getEvent(@Path("scolaryear") String scholarYear,
                         @Path("codemodule") String moduleCode,
                         @Path("codeinstance") String instanceCode,
                         @Path("codeacti") String activityCode,
                         @Path("codeevent") String eventCode,
                         @Query("access_token") String token);

    @POST("/module/{scolaryear}/{codemodule}/{codeinstance}/{codeacti}/{codeevent}/register")
    Call<ResponseBody> registerEvent(@Path("scolaryear") String scholarYear,
                                     @Path("codemodule") String moduleCode,
                                     @Path("codeinstance") String instanceCode,
                                     @Path("codeacti") String activityCode,
                                     @Path("codeevent") String eventCode,
                                     @Query("access_token") String token);

    @DELETE("/module/{scolaryear}/{codemodule}/{codeinstance}/{codeacti}/{codeevent}/unregister")
    Call<ResponseBody> unregisterEvent(@Path("scolaryear") String scholarYear,
                                       @Path("codemodule") String moduleCode,
                                       @Path("codeinstance") String instanceCode,
                                       @Path("codeacti") String activityCode,
                                       @Path("codeevent") String eventCode,
                                       @Query("access_token") String token);

    @FormUrlEncoded
    @POST("/module/{scolaryear}/{codemodule}/{codeinstance}/{codeacti}/{codeevent}/token")
    Call<ResponseBody> postToken(@Path("scolaryear") String scholarYear,
                                 @Path("codemodule") String moduleCode,
                                 @Path("codeinstance") String instanceCode,
                                 @Path("codeacti") String activityCode,
                                 @Path("codeevent") String eventCode,
                                 @Field("token") String eventToken,
                                 @Query("access_token") String token);

}
