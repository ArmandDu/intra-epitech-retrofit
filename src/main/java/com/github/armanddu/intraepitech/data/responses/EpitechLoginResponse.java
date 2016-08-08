package com.github.armanddu.intraepitech.data.responses;

import com.squareup.moshi.Json;

/**
 * Created by armanddu on 05/08/16 for rest-epitech-client.
 *
 */
public class EpitechLoginResponse {

    public String login;
    public String message;
    @Json(name = "access_token")
    public String accessToken;
}
