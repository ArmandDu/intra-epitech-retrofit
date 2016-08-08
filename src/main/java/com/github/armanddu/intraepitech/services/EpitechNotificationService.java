package com.github.armanddu.intraepitech.services;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by armanddu on 06/08/16 for rest-epitech-client.
 */
public interface EpitechNotificationService {
    @GET("/user/notification/message")
    Call<ResponseBody> getMessages(@Query("access_token") String token);

    @GET("/user/notification/alert")
    Call<ResponseBody> getAlerts(@Query("access_token") String token);

    @GET("/user/notification/missed")
    Call<ResponseBody> getMissedActivities(@Query("access_token") String token);

    @GET("/user/notification/coming")
    @Deprecated
    Call<ResponseBody> getAppointments(@Query("access_token") String token);
}
