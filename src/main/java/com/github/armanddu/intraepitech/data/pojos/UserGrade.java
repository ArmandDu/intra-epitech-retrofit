package com.github.armanddu.intraepitech.data.pojos;

import com.squareup.moshi.Json;

import java.util.List;

/**
 * Created by armanddu on 06/08/16 for rest-epitech-client.
 */
public class UserGrade {
    @Json(name = "notes")
    public List<Grade> grades;
}
