package com.github.armanddu.heroku.intraepitech.response;

import com.google.gson.annotations.SerializedName;

public class IntraRight {

  @SerializedName("planning_visible")
  private int planningVisible;

  public int getPlanningVisible() {
    return planningVisible;
  }

  public void setPlanningVisible(int planningVisible) {
    this.planningVisible = planningVisible;
  }


}
