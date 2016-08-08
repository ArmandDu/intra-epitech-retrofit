package com.github.armanddu.intraepitech.data.pojos;

import com.squareup.moshi.Json;

import java.util.List;

/**
 * Created by armanddu on 06/08/16 for rest-epitech-client.
 *
 */
 /*
    {
        "nb_max_students_projet": null,
        "already_register": null,
        "user_status": null,
     }
     */
public class EventInfo extends ModuleInfo {
    public String code;
    @Json(name = "num_event") public String eventNumber;
    public String seats;
    public String title;
    public String description;
    @Json(name = "nb_inscrits") public String nbRegistered;
    public String begin;
    public String end;
    @Json(name = "id_activite") public String activityId;
    public String location;
    public String allow_token;
    public List<Instance> assistants;
}