package com.github.armanddu.intraepitech.services;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

import java.util.Map;

/**
 * Created by armanddu on 06/08/16 for rest-epitech-client.
 */
public interface EpitechtTicketService {
    /**
     *
     * @param filters:<br />
     *               [<strong>status=</strong>new|feedback|acknowledged|resolved|closed] default is all
     *               [<strong>type=</strong>none|teaching-bachelor|teaching-master|international|technical|suggestion|internship|teaching-webac] default is all<br />
     *               [<strong>reported=</strong>login_x]<br />
     *               [<strong>assigned=</strong>login_x] if searching for "not assigned tickets, then use assigned=''<br />
     *               [<strong>monitored=</strong>login_x]
     * @param token:
     *             user's access token
     * @return List of Tickets
     */
    @GET("/ticket/get")
    Call<ResponseBody> getTickets(@QueryMap() Map<String, String> filters,
                                  @Query("access_token") String token);
}
