package com.github.armanddu.heroku.intraepitech.response;

import com.google.gson.annotations.SerializedName;

public class IntraModule {
  private String title;
  @SerializedName("title_link")
  private String titleLink;
  @SerializedName("timeline_start")
  private String timelineStart;
  @SerializedName("timeline_end")
  private String timelineEnd;
  @SerializedName("timeline_barre")
  private String timelineBarre;
  @SerializedName("date_inscription")
  private String inscriptionDate;

  public String getTitle() {
    return title;
  }

  public String getTitleLink() {
    return titleLink;
  }

  public String getTimelineStart() {
    return timelineStart;
  }

  public String getTimelineEnd() {
    return timelineEnd;
  }

  public Number getTimelineBarre() {
    return Double.valueOf(timelineBarre);
  }

  public String getinscriptionDate() {
    return inscriptionDate;
  }

}
