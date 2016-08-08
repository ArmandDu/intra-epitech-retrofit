package com.github.armanddu.heroku.intraepitech.response;

import com.google.gson.annotations.SerializedName;

public class IntraRoom {

  private String code;
  private String type;
  @SerializedName("seats")
  private int nSeats;

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public int getnSeats() {
    return nSeats;
  }

  public void setnSeats(int nSeats) {
    this.nSeats = nSeats;
  }

}
