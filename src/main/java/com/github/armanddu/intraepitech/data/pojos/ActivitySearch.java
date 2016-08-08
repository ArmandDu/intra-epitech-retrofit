package com.github.armanddu.intraepitech.data.pojos;

import com.squareup.moshi.Json;

/**
 * Created by armanddu on 06/08/16 for rest-epitech-client.
 *
 */

/*

{

    "title_module": "String",
    "codemodule": "String",
    "scolaryear": "String",
    "codeinstance": "String",
    "code_location": "String",
    "begin_event": null,
    "end_event": null,
    "seats": null,
    "num_event": null,
    "type_acti": "String",
    "type_acti_code": "String",
    "codeacti": "String",
    "acti_title": "String",
    "num": "String",
    "begin_acti": "YYYY-MM-DD HH:mm:ss",
    "end_acti": "YYYY-MM-DD HH:mm:ss",
    "registered": int,
    "info_creneau": null,
    "project": "String",
    "rights": [
        "String"
    ]

}
 */

public class ActivitySearch extends ModuleInfo {

    @Json(name = "title_module") public String title;
    @Json(name = "code_location") public String locationCode;
    @Json(name = "end_event") public String endEvent;
    @Json(name = "seats") public String seats;
    @Json(name = "num_event") public String eventNumber;
    @Json(name = "codeacti") public String activityCode;
    @Json(name = "type_acti") public String activityType;
    @Json(name = "type_acti_code") public String activityCodeType;
    @Json(name = "acti_title") public String activityTitle;
    @Json(name = "num") public String number;
    @Json(name = "begin_acti") public String beginActivity;
    @Json(name = "registered") public int registered;
    @Json(name = "project") public String project;

}
