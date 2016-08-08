package com.github.armanddu.intraepitech.data.pojos;

import com.squareup.moshi.Json;

/**
 * Created by armanddu on 06/08/16 for rest-epitech-client.
 *
 */

/*
{

    "codeacti": "String",
    "codeevent": "String",
    "semester": int,
    "instance_location": "String",
    "module_title": "String",
    "acti_title": "String",
    "acti_description": "String",
    "type_title": "String",
    "type_code": "String",
    "allowed_planning_start": "YYYY-MM-DD HH:mm:ss",
    "allowed_planning_end": "YYYY-MM-DD HH:mm:ss",
    "nb_hours": "HH:mm:ss",
    "nb_group": int,
    "has_exam_subject": boolean,
    "begin": "YYYY-MM-DD HH:mm:ss",
    "start": "YYYY-MM-DD HH:mm:ss",
    "end": "YYYY-MM-DD HH:mm:ss",
    "num_event": int,
    "title": null,
    "description": null,
    "nb_registered": int,
    "id_dir": "String",
    "room": {},
    "seats": null,
    "desc_webservice": "String",
    "name_bocal": "String"

}
 */

public class Event extends ModuleInfo {

    public String title;
    public String description;
    @Json(name = "module_title") public String moduleTitle;
    @Json(name = "acti_title") public String activityTitle;
    @Json(name = "acti_description") public String activityDescription;
    @Json(name = "codeacti") public String activityCode;
    @Json(name = "codeevent") public String eventCode;
    @Json(name = "type_title") public String eventType;
    @Json(name = "type_code") public String eventTypeCode;
    public Room room;
    public String seats;
    @Json(name = "nb_registered") public int nbRegistration;
    public int semester;
    @Json(name = "has_exam_subject") public boolean hasExamSubject;
}
