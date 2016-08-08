package com.github.armanddu.intraepitech.data.pojos;

import com.squareup.moshi.Json;

/**
 * Created by armanddu on 05/08/16 for rest-epitech-client.
 */

/*
{
            "credits_min": "0",
            "credits_norm": "0",
            "credits_obj": "0",
            "nslog_min": "0",
            "nslog_norm": "0",
            "credits": "0",
            "grade": "String",
            "cycle": "String",
            "code_module": "String",
            "current_cycle": "String",
            "semester_code": "String",
            "semester_num": "String",
            "active_log": null
}
 */

public class CurrentInfo {

    @Json(name = "credits_min")
    public int creditsMin;
    @Json(name = "credits_norm")
    public int creditsAvg;
    @Json(name = "credits_obj")
    public int creditsObjective;
    @Json(name = "nslog_min")
    public int credits;

    public int minLog;
    @Json(name = "nslog_norm")
    public int avgLog;

    public String grade;
    public String cycle;
    @Json(name = "code_module")
    public String moduleCode;
    @Json(name = "current_cyle")
    public String currentCycle;
    @Json(name = "semester_code")
    public String semesterCode;
    @Json(name = "semester_num")
    public String semesterNum;

}
