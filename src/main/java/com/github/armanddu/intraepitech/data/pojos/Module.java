package com.github.armanddu.intraepitech.data.pojos;

import com.squareup.moshi.Json;

import java.util.List;

/**
 * Created by armanddu on 06/08/16 for rest-epitech-client.
 *
 */
/*
{

    "scolaryear_template": "String",
    "begin": "YYYY-MM-DD",
    "end_register": "YYYY-MM-DD",
    "end": "YYYY-MM-DD",
    "past": "String",
    "closed": "String",
    "opened": "String",
    "user_credits": "String",
    "flags": "String",
    "instance_flags": "String",
    "max_ins": null,
    "instance_location": "String",
    "hidden": "String",
    "old_acl_backup": null,
    "rights": null,
    "allow_register": int,
    "date_ins": "YYYY-MM-DD HH:mm:ss",
    "student_registered": int,
    "student_grade": "String",
    "student_credits": int,
    "color": "String",
    "student_flags": "String",
    "current_resp": boolean,

}
 */
public class Module extends ModuleInfo {

    public String title;
    public int semester;
    public String description;
    public int credits;
    @Json(name = "competence") public String skills;
    @Json(name = "activites") public List<Activity> activities;
    @Json(name = "resp") public List<Instance> teachers;
    @Json(name = "template_resp") public List<Instance> supervisors;
    @Json(name = "assistant") public List<Instance> assistants;


}
