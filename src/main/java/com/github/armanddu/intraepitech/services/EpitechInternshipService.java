package com.github.armanddu.intraepitech.services;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

/**
 * Created by armanddu on 07/08/16 for rest-epitech-client.
 */
public interface EpitechInternshipService {
    @GET("/stage/load")
    Call<ResponseBody> searchInternships(@Query("start") String start, @Query("end") String end,
                                         @Query("access_token") String token);

    @FormUrlEncoded
    @POST("/details")
    Call<ResponseBody> getInternshipDetails(@Field("hash") String hash, @Query("access_token") String token);

    @FormUrlEncoded
    @POST("/validate")
    Call<ResponseBody> rateInternship(@Field("hash") String hash,
                                      @Field("desc_company") String companyDescription,
                                      @Field("desc_work_placement") String workDescription,
                                      @Field("desc_personal_feeling") String personalFeelingDescription,
                                      @Query("access_token") String token);
}
