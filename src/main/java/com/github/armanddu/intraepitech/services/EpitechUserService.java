package com.github.armanddu.intraepitech.services;

import com.github.armanddu.intraepitech.data.pojos.User;
import com.github.armanddu.intraepitech.data.pojos.UserGrade;
import com.github.armanddu.intraepitech.data.pojos.UserModuleSummary;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

import java.util.Map;

/**
 * Created by armanddu on 06/08/16 for rest-epitech-client.
 */
public interface EpitechUserService {
    @GET("/user")
    Call<User> me(@Query("access_token") String token);

    @GET("/user/{login}")
    Call<User> getUser(@Path("login") String login, @Query("access_token") String token);

    @GET("/user/!notes")
    Call<UserModuleSummary> getMyPastModules(@Query("access_token") String token);

    @GET("/user/!notes")
    Call<UserGrade> getMyGrades(@Query("access_token") String token);

    @GET("/user/filter/promo")
    Call<ResponseBody> searchPromotions(@Query("location") String location, @Query("year") String year,
                                        @Query("active") String active,
                                        @Query("access_token") String token);

    @GET("/user/filter/location")
    Call<ResponseBody> getLocations(@Query("access_token") String token);

    @GET("/user/filter/year")
    Call<ResponseBody> getYears(@Query("location") String location, @Query("active") String active, @Query("access_token") String token);

    @GET("/user/filter/prefered")
    Call<ResponseBody> getPreferredLocation(@Query("access_token") String token);

    @GET("/user/filter/user")
    Call<ResponseBody> searchUsers(@Query("location") String location, @Query("year") String year,
                                   @QueryMap() Map<String, String> filters,
                                   @Query("access_token") String token);

    @GET("/user/filter/user")
    Call<ResponseBody> searchUsers(@Query("search") String search,
                                   @Query("offset") int offset,
                                   @QueryMap() Map<String, String> filters,
                                   @Query("access_token") String token);

    @GET("/user/complete")
    Call<ResponseBody> completeUserSearch(@Query("search") String search,
                                          @Query("access_token") String token);
}
