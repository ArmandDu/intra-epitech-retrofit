package com.github.armanddu.intraepitech.data.pojos;

/**
 * Created by armanddu on 06/08/16 for rest-epitech-client.
 */

/*
{

    "id_user_history": null,
    "title": "String",
    "date_ins": "YYYY-MM-DD HH:mm:ss",
    "cycle": "String",
    "grade": "String",
    "credits": int,
    "barrage": int

}

 */
public class ModuleSummary extends ModuleInfo {

    public int credits;
    public int barrage;
    public String grade;
    public String title;
    public String cycle;
}
