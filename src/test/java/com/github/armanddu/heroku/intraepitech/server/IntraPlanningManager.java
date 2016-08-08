package com.github.armanddu.heroku.intraepitech.server;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class IntraPlanningManager {

    public static String getSuccessful() {
        return "[\n" +
                "\n" +
                "    {\n" +
                "        \"module_available\": false,\n" +
                "        \"nb_hours\": \"String\",\n" +
                "        \"total_students_registered\": 0,\n" +
                "        \"scolaryear\": \"String\",\n" +
                "        \"register_month\": false,\n" +
                "        \"prof_inst\": [\n" +
                "            {\n" +
                "                \"type\": \"String\",\n" +
                "                \"title\": \"String\",\n" +
                "                \"picture\": \"String\",\n" +
                "                \"login\": \"String\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"instance_location\": \"String\",\n" +
                "        \"register_prof\": false,\n" +
                "        \"is_rdv\": \"String\",\n" +
                "        \"num_event\": 0,\n" +
                "        \"register_student\": false,\n" +
                "        \"project\": false,\n" +
                "        \"event_registered\": null,\n" +
                "        \"rdv_indiv_registered\": null,\n" +
                "        \"nb_max_students_projet\": null,\n" +
                "        \"codeinstance\": \"String\",\n" +
                "        \"titlemodule\": \"String\",\n" +
                "        \"past\": false,\n" +
                "        \"codemodule\": \"String\",\n" +
                "        \"rdv_group_registered\": null,\n" +
                "        \"in_more_than_one_month\": false,\n" +
                "        \"start\": \"String\",\n" +
                "        \"module_registered\": false,\n" +
                "        \"allowed_planning_end\": \"String\",\n" +
                "        \"acti_title\": \"String\",\n" +
                "        \"type_title\": \"String\",\n" +
                "        \"allowed_planning_start\": \"String\",\n" +
                "        \"nb_group\": 0,\n" +
                "        \"semester\": 0,\n" +
                "        \"allow_token\": false,\n" +
                "        \"type_code\": \"String\",\n" +
                "        \"end\": \"String\",\n" +
                "        \"codeevent\": \"String\",\n" +
                "        \"dates\": null,\n" +
                "        \"room\": {\n" +
                "            \"code\": \"String\",\n" +
                "            \"type\": \"String\",\n" +
                "            \"seats\": 0\n" +
                "        },\n" +
                "        \"codeacti\": \"String\",\n" +
                "        \"allow_register\": false,\n" +
                "        \"title\": null\n" +
                "    }\n" +
                "\n" +
                "]";
    }

    public static String getFailure() {
        return "{\"error\": {\"code\": 403, \"message\": \"Connection token is invalid or has expired\"}}\n";
    }

    public static void main(String[] a) throws IOException {
        System.out.println(getSuccessful());
        Files.write(Paths.get("t.json"), getSuccessful().getBytes());
    }

}
