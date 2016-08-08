package com.github.armanddu.intraepitech.services;

import com.github.armanddu.intraepitech.data.pojos.PlanningEntry;
import com.github.armanddu.intraepitech.data.pojos.Schedule;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.List;

/**
 * Created by armanddu on 06/08/16 for rest-epitech-client.
 */
public interface EpitechPlanningService {
    @GET("/planning/my-schedules")
    Call<List<Schedule>> getMySchedules(@Query("access_token") String token);

    @GET("/planning/load")
    Call<List<PlanningEntry>> getMyPlanning(@Query("access_token") String token);
}
