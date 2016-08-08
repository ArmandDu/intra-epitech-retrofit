package com.github.armanddu.heroku.intraepitech.service;

import retrofit.Callback;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

import com.github.armanddu.heroku.intraepitech.response.IntraInfo;
import com.github.armanddu.heroku.intraepitech.response.LoginResponse;

public interface AuthenticationService {

  @FormUrlEncoded
  @POST("/login")
  void connect(@Field("login") String login, @Field("password") String password,
      Callback<LoginResponse> callback);

  @FormUrlEncoded
  @POST("/infos")
  void getInfos(@Field("token") String token, Callback<IntraInfo> callback);

}
