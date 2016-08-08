package com.github.armanddu.intraepitech.services;

import com.github.armanddu.intraepitech.data.responses.EpitechLoginResponse;
import retrofit2.Call;
import retrofit2.http.*;

/**
 * Created by armanddu on 04/08/16 for rest-epitech-client.
 *
 */
public interface EpitechAuthenticationService {

    @FormUrlEncoded
    @POST("/login")
    Call<EpitechLoginResponse> connect(@Field("login")String login, @Field("password") String password);

    @HEAD("/")
    Call<Void> isValid(@Query("access_token") String token);

}
