package com.github.armanddu.heroku.intraepitech.service;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;

import com.github.armanddu.heroku.intraepitech.response.IntraUserResponse;

public interface UserService {

  @GET("/user/{username}?format=json")
  void getUser(@Path("username") String userName, Callback<IntraUserResponse> callback);

}
