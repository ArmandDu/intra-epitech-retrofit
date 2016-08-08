package com.github.armanddu.intraepitech.data.pojos;

import com.squareup.moshi.Json;

import java.util.List;

/**
 * Created by armanddu on 06/08/16 for rest-epitech-client.
 */

public class User {

    public String login;
    public String title;
    @Json(name = "internal_email") public String email;
    @Json(name = "lastname") public String lastName;
    @Json(name = "firstname") public String firstName;
    public String picture;
    public int promo;
    @Json(name = "scolaryear") public String scholarYear;
    public int semester;
    public String location;
    public String documents;
    public boolean close;
    @Json(name = "studentyear") public int studyYear;
    @Json(name = "course_code") public String courseCode;
    @Json(name = "semester_code") public String semesterCode;
    @Json(name = "school_id") public String schoolId;
    @Json(name = "school_code") public String schoolCode;
    @Json(name = "school_title") public String schoolTitle;
    public boolean admin;
    public boolean editable;
    public List<Group> groups;
    public int credits;
    public List<Gpa> gpa;
    public Spice spice;


}
