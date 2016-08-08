package com.github.armanddu.intraepitech.data.pojos;

import com.squareup.moshi.Json;

/**
 * Created by armanddu on 06/08/16 for rest-epitech-client.
 */


public class Grade extends ModuleInfo {
    @Json(name = "titlemodule") public String moduleName;
    @Json(name = "codeacti") public String activityCode;
    public String title;
    public String date;
    @Json(name = "final_note") public double score;
    public String comment;
    @Json(name = "correcteur") public String examiner;
}
