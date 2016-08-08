package com.github.armanddu.heroku.intraepitech.service;

import java.util.List;

import retrofit.Callback;
import retrofit.client.Response;
import retrofit.http.DELETE;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Query;

import com.github.armanddu.heroku.intraepitech.response.IntraSusie;

public interface SusieService {

  @GET("/susies")
  void getAll(@Query("token") String token, @Query("start") String start, @Query("end") String end,
      @Query("get") String type, Callback<List<IntraSusie>> callback);

  @GET("/susie")
  void getById(@Query("token") String token, @Query("id") int id, Callback<IntraSusie> callback);

  @FormUrlEncoded
  @POST("/susie")
  void subscribe(@Field("token") String token, @Field("id") int id, Callback<Response> callback);

  @FormUrlEncoded
  @DELETE("/susie")
  void unsubscribe(@Field("token") String token, @Field("id") int id, Callback<Response> callback);

}
