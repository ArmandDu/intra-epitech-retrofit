package com.github.armanddu.intraepitech.data.pojos;

import com.squareup.moshi.Json;

/**
 * Created by armanddu on 06/08/16 for rest-epitech-client.
 */

/*
    {
        "title": "String",
        "login": "String",
        "id_user": "String",
        "user_title": "String",
        "picture": "String",
        "id_team": null,
        "id_activite": "String",
        "id_acti_team": "String",
        "all_members": null,
        "status": null,
        "note": int,
        "comment": "String",
        "editable": boolean,
        "type": "String",
        "grader": null,
        "date": "YYYY-MM-DD HH:mm:ss"
    }

 */
public class ActivityGrade {
    public String title;
    public String login;
    @Json(name = "id_user") public String userId;
    @Json(name = "user_title") public String fullname;
    public String picture;
    @Json(name = "note") public double score;
    public String type;
    public String status;
    public String date;
    @Json(name = "id_activity") public String activityId;
}
