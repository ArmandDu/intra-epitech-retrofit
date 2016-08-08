package com.github.armanddu.heroku.intraepitech.response;

import com.google.gson.annotations.SerializedName;

public class IntraNsStat {
  private double active;
  private double idle;
  @SerializedName("out_active")
  private double outActive;
  @SerializedName("out_idle")
  private double outIdle;
  @SerializedName("nslog_norm")
  private double nslogNorm;

  public double getActive() {
    return active;
  }

  public double getIdle() {
    return idle;
  }

  public double getOutActive() {
    return outActive;
  }

  public double getOutIdle() {
    return outIdle;
  }

  public double getNslogNorm() {
    return nslogNorm;
  }

}
