package com.github.armanddu.intraepitech.data.pojos;

import com.squareup.moshi.Json;

import java.util.List;

/**
 * Created by armanddu on 06/08/16 for rest-epitech-client.

 */

     /*
        {
    "codeacti": "String",
    "call_ihk": "String",
    "slug": null,
    "instance_location": "String",
    "module_title": "String",
    "title": "String",
    "description": "String",
    "type_title": "String",
    "type_code": "String",
    "begin": "YYYY-MM-DD HH:mm:ss",
    "start": "YYYY-MM-DD HH:mm:ss",
    "end_register": "YYYY-MM-DD HH:mm:ss",
    "deadline": null,
    "end": "YYYY-MM-DD HH:mm:ss",
    "nb_hours": "HH:mm:ss",
    "nb_group": int,
    "num": int,
    "register": "String",
    "register_by_bloc": null,
    "register_prof": "String",
    "title_location_type": "String",
    "is_projet": boolean,
    "id_projet": "String",
    "project_title": "String",
    "is_note": boolean,
    "nb_notes": int,
    "is_blocins": boolean,
    "rdv_status": "String",
    "id_bareme": null,
    "title_bareme": null,
    "archive": "String",
    "hash_elearning": null,
    "ged_node_adm": null,
    "nb_planified": null,
    "note": null,
    "project": null,
    "student_registered": null,
    "events": []
}
 */

public class Activity extends ModuleInfo {

    @Json(name = "codeacti") public String activityCode;
    public List<EventInfo> events;
    public Project project;
    @Json(name = "note") public String grade;

}