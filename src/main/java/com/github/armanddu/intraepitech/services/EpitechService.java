package com.github.armanddu.intraepitech.services;

import com.github.armanddu.intraepitech.data.pojos.Dashboard;
import com.github.armanddu.intraepitech.data.pojos.Module;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

import java.util.Map;

/**
 * Created by armanddu on 05/08/16 for rest-epitech-client.
 *
 */
public interface EpitechService {

    @GET("/")
    Call<Dashboard> dashboard(@Query(encoded = true, value = "access_token") String token);

    @GET("/module/{scolaryear}/{codemodule}/{codeinstance}")
    Call<Module> getModule(@Path("scolaryear") String scholarYear,
                           @Path("codemodule") String moduleCode,
                           @Path("codeinstance") String instanceCode,
                           @Query("access_token") String token);


    @GET("/course/filter?&preload")
    Call<ResponseBody> getModules(@Query("access_token") String token);

    /**
     *
     * @param filters Map: <br />
     *               [<strong>location=</strong>]<br />
     *               [<strong>course=</strong>]<br />
     *               [<strong>scolaryear=</strong>]<br />
     * @param token String: access token
     * @return List of modules
     */
    @GET("/course/filter")
    Call<ResponseBody> searchModules(@QueryMap() Map<String, String> filters, @Query("access_token") String token);


    @GET("/conference")
    Call<ResponseBody> getConferences(@Query("access_token") String token);

    @GET("/conference")
    Call<ResponseBody> searchConferences(@Query("tag") String tag,
                                         @Query("access_token") String token);

    @GET("/e-learning")
    Call<ResponseBody> searchELEarning(@Query("access_token") String token);

}
