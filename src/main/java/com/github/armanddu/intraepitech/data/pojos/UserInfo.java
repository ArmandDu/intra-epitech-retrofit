package com.github.armanddu.intraepitech.data.pojos;

import com.squareup.moshi.Json;

import java.util.List;

/**
 * Created by armanddu on 05/08/16 for rest-epitech-client.
 */

/*
{
        "referent_used": boolean,
        "picture_fun": null,
        "email_referent": null,
        "pass_referent": "String",
        "uid": id,
        "gid": id,
        "location": "String",
        "documents": "String",
        "userdocs": "String",
        "shell": "String",
        "netsoul": null,
        "close": boolean,
        "close_reason": null,
        "ctime": "YYYY-MM-DD HH:mm:ss",
        "mtime": "YYYY-MM-DD HH:mm:ss",
        "comment": null,
        "id_promo": "String",
        "id_history": "String",
        "course_code": "String",
        "semester_code": "String",
        "old_id_promo": "id,id,id,id,...",
        "old_id_location": "id,id,...",
        "rights": {},
        "invited": boolean,
        "decoded": int
}
 */
public class UserInfo {

    public String login;
    public String title;
    public String email;
    public int credits;
    public List<Gpa> gpa;
    public List<Group> groups;
    @Json(name = "internal_email")
    public String internalEmail;
    @Json(name = "lastname")
    public String lastName;
    @Json(name = "firstname")
    public String firstName;
    @Json(name = "promo")
    public int graduationYear;
    public int semester;
    @Json(name = "school_title")
    public String schoolName;
    @Json(name = "school_id")
    public String schoolId;
    @Json(name = "school_code")
    public String schoolCode;
    @Json(name = "studentyear")
    public int studentYear;
    public boolean admin;
    public boolean close;
    public String picture;

}
