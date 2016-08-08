package com.github.armanddu.heroku.intraepitech.response;

import com.google.gson.annotations.SerializedName;

public class IntraGrade {
  private String title;
  @SerializedName("title_link")
  private String titleLink;
  @SerializedName("note")
  private String grade;
  @SerializedName("noteur")
  private String teacher;

  public String getTitle() {
    return title;
  }

  public String getTitleLink() {
    return titleLink;
  }

  public double getGrade() {
    return Double.parseDouble(grade);
  }

  public String getTeacher() {
    return teacher;
  }

}
