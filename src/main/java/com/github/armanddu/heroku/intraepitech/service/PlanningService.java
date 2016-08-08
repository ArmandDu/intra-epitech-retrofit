package com.github.armanddu.heroku.intraepitech.service;

import com.github.armanddu.heroku.intraepitech.response.IntraPlanningEntry;
import retrofit.Callback;
import retrofit.client.Response;
import retrofit.http.*;

import java.util.List;

public interface PlanningService {

  @GET("/planning")
  void getPlanning(@Query("token") String token, @Query("start") String start,
      @Query("end") String end, Callback<List<IntraPlanningEntry>> callback);

  @FormUrlEncoded
  @POST("/token")
  void postToken(@Field("token") String token, @Field("scolaryear") int scolarYear,
      @Field("codemodule") String moduleCode, @Field("codeinstance") String instanceCode,
      @Field("codeacti") String activityCode, @Field("tokencode") String tokenCode,
      Callback<Response> callback);

}
