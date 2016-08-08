package com.github.armanddu.intraepitech.data.pojos;

import com.squareup.moshi.Json;

/**
 * Created by armanddu on 06/08/16 for rest-epitech-client.
 */


public class ModuleInfo {
    @Json(name = "codemodule") public String moduleCode;
    @Json(name = "scolaryear") public String scholarYear;
    @Json(name = "codeinstance") public String instanceCode;
}
