package com.github.armanddu.heroku.intraepitech.response;

import com.google.gson.annotations.SerializedName;

// TODO POJO UserInfo

public class IntraGlobalInfos {
  private String id;
  private String login;
  private String title;
  private String email;
  @SerializedName("internal_email")
  private String internalEmail;
  private String lastname;
  private String firstname;
  private String userinfo;
  @SerializedName("referent_used")
  private boolean referentUsed;
  private String picture;
  @SerializedName("picture_fun")
  private String pictureFun;
  @SerializedName("email_referent")
  private String emailReferent;
  @SerializedName("pass_referent")
  private String passReferent;
  private int promo;
  private int semester;
  private int uid;
  private int gid;
  private String location;
  private String documents;
  private String userdocs;
  private String shell;
  private String netsoul;
  private boolean close;
  @SerializedName("close_reason")
  private String closeReason;
  private String ctime;
  private String mtime;
  private String comment;
  @SerializedName("id_promo")
  private String idPromo;
  @SerializedName("id_history")
  private String idHistory;
  @SerializedName("course_code")
  private String courseCode;
  @SerializedName("school_code")
  private String schoolCode;
  @SerializedName("school_title")
  private String schoolTitle;
  @SerializedName("old_id_promo")
  private String oldIdPromo;
  @SerializedName("old_id_location")
  private String oldIdLocation;
  private IntraRight rights;
  private boolean invited;
  private int studentyear;
  private boolean admin;
  private int decoded;

  public int getId() {
    return Integer.parseInt(id);
  }

  public String getLogin() {
    return login;
  }

  public String getTitle() {
    return title;
  }

  public String getEmail() {
    return email;
  }

  public String getInternalEmail() {
    return internalEmail;
  }

  public String getLastname() {
    return lastname;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getUserinfo() {
    return userinfo;
  }

  public boolean isReferentUsed() {
    return referentUsed;
  }

  public String getPicture() {
    return picture;
  }

  public String getPicture_fun() {
    return pictureFun;
  }

  public String getEmailReferent() {
    return emailReferent;
  }

  public int getPassReferent() {
    return Integer.parseInt(passReferent);
  }

  public int getPromo() {
    return promo;
  }

  public int getSemester() {
    return semester;
  }

  public int getUid() {
    return uid;
  }

  public int getGid() {
    return gid;
  }

  public String getLocation() {
    return location;
  }

  public String getDocuments() {
    return documents;
  }

  public String getUserdocs() {
    return userdocs;
  }

  public String getShell() {
    return shell;
  }

  public String getNetsoul() {
    return netsoul;
  }

  public boolean isClose() {
    return close;
  }

  public String getCloseReason() {
    return closeReason;
  }

  public String getCtime() {
    return ctime;
  }

  public String getMtime() {
    return mtime;
  }

  public String getComment() {
    return comment;
  }

  public int getId_promo() {
    return Integer.valueOf(idPromo);
  }

  public int getIdHistory() {
    return Integer.valueOf(idHistory);
  }

  public String getCourse_code() {
    return courseCode;
  }

  public String getSchoolCode() {
    return schoolCode;
  }

  public String getSchool_title() {
    return schoolTitle;
  }

  public String getOldIdPromo() {
    return oldIdPromo;
  }

  public String getOldIdLocation() {
    return oldIdLocation;
  }

  public IntraRight getRights() {
    return rights;
  }

  public boolean isInvited() {
    return invited;
  }

  public int getStudentyear() {
    return studentyear;
  }

  public boolean isAdmin() {
    return admin;
  }

  public int getDecoded() {
    return decoded;
  }

}
