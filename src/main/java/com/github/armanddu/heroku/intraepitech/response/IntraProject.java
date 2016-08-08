package com.github.armanddu.heroku.intraepitech.response;

import com.google.gson.annotations.SerializedName;

public class IntraProject {

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
  private String dateInscription;
  @SerializedName("id_activite")
  private String activityId;
  @SerializedName("soutenance_name")
  private String soutenanceName;
  @SerializedName("soutenance_link")
  private String soutenanceLink;
  @SerializedName("soutenance_date")
  private String soutenanceDate;
  @SerializedName("soutenance_salle")
  private String soutenanceRoom;

  public String getTitle() {
    return title;
  }


  public double getTimelineBarre() {
    return Double.valueOf(timelineBarre);
  }

  public int getActiviteId() {
    return Integer.valueOf(activityId);
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


  public String getDateInscription() {
    return dateInscription;
  }


  public String getActivityId() {
    return activityId;
  }


  public String getSoutenanceName() {
    return soutenanceName;
  }


  public String getSoutenanceLink() {
    return soutenanceLink;
  }


  public String getSoutenanceDate() {
    return soutenanceDate;
  }


  public String getSoutenanceRoom() {
    return soutenanceRoom;
  }

}
