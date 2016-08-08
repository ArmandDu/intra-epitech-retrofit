package com.github.armanddu.heroku.intraepitech.response;

import com.google.gson.annotations.SerializedName;

/*
 * { "active_log":"ii.iii", "credits_min":"ii", "credits_norm":"iii", "credits_obj":"iii",
 * "nslog_min":"ii", "nslog_norm":"ii", "semester_code":"B5", "semester_num":"i", "achieved":iii,
 * "failed":i, "inProgress":ii }
 */
public class IntraCurrentInfos {

  @SerializedName("active_log")
  private String activeLog;
  @SerializedName("credits_min")
  private String creditsMin;
  @SerializedName("credits_norm")
  private String creditsNorm;
  @SerializedName("credits_obj")
  private String creditsTarget;
  @SerializedName("nslog_min")
  private String minNslog;
  @SerializedName("nslog_norm")
  private String nslogNorm;
  @SerializedName("semester_code")
  private String semesterCode;
  @SerializedName("semester_num")
  private String semesterNum;
  private int achieved;
  private int failed;
  @SerializedName("inProgress")
  private int inProgress;

  public double getActiveLog() {
    return Double.valueOf(activeLog);
  }

  public int getCreditsMin() {
    return Integer.valueOf(creditsMin);
  }

  public int getCreditsNorm() {
    return Integer.valueOf(creditsNorm);
  }

  public int getCreditsTarget() {
    return Integer.valueOf(creditsTarget);
  }

  public double getMinNslog() {
    return Double.valueOf(minNslog);
  }

  public double getNslogNorm() {
    return Double.valueOf(nslogNorm);
  }

  public String getSemesterCode() {
    return semesterCode;
  }

  public int getSemesterNum() {
    return Integer.valueOf(semesterNum);
  }

  public int getAchieved() {
    return achieved;
  }

  public int getFailed() {
    return failed;
  }

  public int getInProgress() {
    return inProgress;
  }

}
