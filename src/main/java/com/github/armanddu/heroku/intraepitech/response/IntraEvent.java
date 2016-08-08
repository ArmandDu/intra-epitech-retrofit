package com.github.armanddu.heroku.intraepitech.response;

import com.google.gson.annotations.SerializedName;

/*
 * { "id_event_failed":"iiii", "id_user":"iii", "begin":"2014-10-29 18:00:00",
 * "id_activite_failed":"iii" }
 */

public class IntraEvent {
  @SerializedName("id_event_failed")
  private String idEventFailed;
  @SerializedName("id_user")
  private String idUser;
  private String begin;
  @SerializedName("id_activite_failed")
  private String idActiviteFailed;

  public int getIdEventFailed() {
    return Integer.parseInt(idEventFailed);
  }

  public int getIdUser() {
    return Integer.parseInt(idUser);
  }

  public String getBegin() {
    return begin;
  }

  public int getIdActiviteFailed() {
    return Integer.parseInt(idActiviteFailed);
  }

}
