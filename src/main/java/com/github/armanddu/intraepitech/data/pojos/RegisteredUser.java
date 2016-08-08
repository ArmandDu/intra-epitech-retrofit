package com.github.armanddu.intraepitech.data.pojos;

import com.squareup.moshi.Json;

/**
 * Created by armanddu on 06/08/16 for rest-epitech-client.

 */

/*
{
        "id": "String",
        "title": null,
        "code": "String",
        "final_note": "String",
        "repository": null,
        "project_title": "String",
        "closed": boolean,
        "master": {
            "login": "String",
            "date_ins": null,
            "date_modif": null,
            "status": "String",
            "picture": "String",
            "title": "String"
        },
        "members": []
    }
 */
public class RegisteredUser {
    public String id;
    public String title;
    @Json(name = "final_note") public double finalScore;
    @Json(name = "project_title") public String projectTitle;
    public boolean closed;
}
