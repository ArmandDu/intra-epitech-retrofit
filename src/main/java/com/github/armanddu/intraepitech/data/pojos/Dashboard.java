package com.github.armanddu.intraepitech.data.pojos;

import com.squareup.moshi.Json;

import java.util.List;

/**
 * Created by armanddu on 05/08/16 for rest-epitech-client.
 */
/*
{
    "ip": "...",
    "board": {},
    "history": [],
    "infos": {},
    "current": []
}
 */

public class Dashboard {

    public String ip;
    public Board board;
    public List<HistoryEntry> history;
    @Json(name = "infos")
    public UserInfo user;
    @Json(name = "current")
    public List<CurrentInfo> currentInfos;

}
