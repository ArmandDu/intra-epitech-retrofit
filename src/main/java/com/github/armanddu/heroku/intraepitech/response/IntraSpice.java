package com.github.armanddu.heroku.intraepitech.response;

import com.google.gson.annotations.SerializedName;


public class IntraSpice {

  @SerializedName("available_spice")
  private String availableSpice;
  @SerializedName("consumed_spice")
  private int consumedSpice;

  public int getAvailableSpice() {
    return Integer.valueOf(availableSpice);
  }

  public int getConsumedSpice() {
    return consumedSpice;
  }

}
