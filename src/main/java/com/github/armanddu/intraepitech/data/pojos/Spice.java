package com.github.armanddu.intraepitech.data.pojos;

import com.squareup.moshi.Json;

/**
 * Created by armanddu on 06/08/16 for rest-epitech-client.
 */

public class Spice {
    @Json(name = "available_spice") public String availableSpices;
    @Json(name = "consumed_spice") public int consumedSpices;
}
