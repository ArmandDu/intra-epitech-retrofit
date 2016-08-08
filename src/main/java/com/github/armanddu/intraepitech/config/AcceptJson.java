package com.github.armanddu.intraepitech.config;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

/**
 * Created by armanddu on 04/08/16 for rest-epitech-client.
 *
 */
public class AcceptJson implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request origin = chain.request();
        Request request = origin.newBuilder()
                .header("Accept", "application/json")
                .build();
        return chain.proceed(request);
    }
}
