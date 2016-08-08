package com.github.armanddu.intraepitech.data.pojos;

import com.squareup.moshi.Json;

import java.util.List;

/**
 * Created by armanddu on 06/08/16 for rest-epitech-client.
 */

/*
{

    "scolaryear": "String",
    "codemodule": "String",
    "codeinstance": "String",
    "codeacti": "String",
    "codeevent": "String",
    "semester": 5,
    "instance_location": "String",
    "titlemodule": "String",
    "prof_inst": [],
    "acti_title": "String",
    "num_event": 1,
    "start": "YYYY-MM-DD HH:mm:ss",
    "end": "YYYY-MM-DD HH:mm:ss",
    "total_students_registered": 0,
    "title": null,
    "type_title": "String",
    "type_code": "String",
    "is_rdv": "String",
    "nb_hours": "HH:mm:ss",
    "allowed_planning_start": "YYYY-MM-DD HH:mm:ss",
    "allowed_planning_end": "YYYY-MM-DD HH:mm:ss",
    "nb_group": 1,
    "nb_max_students_projet": "String",
    "room": {},
    "dates": null,
    "module_available": boolean,
    "module_registered": boolean,
    "past": boolean,
    "allow_register": boolean,
    "event_registered": boolean,
    "display": "String",
    "project": boolean,
    "rdv_group_registered": null,
    "rdv_indiv_registered": null,
    "allow_token": boolean,
    "register_student": boolean,
    "register_prof": boolean,
    "register_month": boolean,
    "in_more_than_one_month": boolean

}
 */

public class PlanningEntry extends ModuleInfo {

    @Json(name = "prof_inst")
    public List<Instance> profs;
    public Room room;
}
