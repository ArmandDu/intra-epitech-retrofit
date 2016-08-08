package com.github.armanddu.heroku.intraepitech.response;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class IntraUserResponse {

  private String login;
  private String title;
  @SerializedName("internal_email")
  private String internalEmail;
  @SerializedName("lastname")
  private String lastName;
  @SerializedName("firstname")
  private String firstName;
  @SerializedName("userinfo")
  private IntraUserInfo userInfo;
  @SerializedName("referent_used")
  private boolean referentUsed;
  private String picture;
  @SerializedName("picture_fun")
  private String pictureFun;
  private Number promo;
  private Number semester;
  private Number uid;
  private Number gid;
  private String location;
  private String documents;
  private String userdocs;
  private String shell;
  private boolean close;
  private String ctime;
  private String mtime;
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
  @SerializedName("studentyear")
  private Number studentYear;
  private boolean admin;
  private boolean editable;
  private List<IntraGroup> groups;
  private List<IntraEvent> events;
  private Number credits;
  private List<IntraGpa> gpa;
  private List<IntraAverageGpa> averageGPA;
  private IntraSpice spice;
  @SerializedName("nsstat")
  private IntraNsStat nsStat;

  public String getLogin() {
    return login;
  }

  public String getTitle() {
    return title;
  }

  public String getInternalEmail() {
    return internalEmail;
  }

  public String getLastName() {
    return lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public IntraUserInfo getUserInfo() {
    return userInfo;
  }

  public boolean isReferentUsed() {
    return referentUsed;
  }

  public String getPicture() {
    return picture;
  }

  public String getPictureFun() {
    return pictureFun;
  }

  public Number getPromo() {
    return promo;
  }

  public Number getSemester() {
    return semester;
  }

  public Number getUid() {
    return uid;
  }

  public Number getGid() {
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

  public boolean isClose() {
    return close;
  }

  public String getCtime() {
    return ctime;
  }

  public String getMtime() {
    return mtime;
  }

  public Number getIdPromo() {
    return Integer.valueOf(idPromo);
  }

  public Number getIdHistory() {
    return Integer.valueOf(idHistory);
  }

  public String getCourseCode() {
    return courseCode;
  }

  public String getSchoolCode() {
    return schoolCode;
  }

  public String getSchoolTitle() {
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

  public Number getStudentYear() {
    return studentYear;
  }

  public boolean isAdmin() {
    return admin;
  }

  public boolean isEditable() {
    return editable;
  }

  public List<IntraGroup> getGroups() {
    return groups;
  }

  public List<IntraEvent> getEvents() {
    return events;
  }

  public Number getCredits() {
    return credits;
  }

  public List<IntraGpa> getGpa() {
    return gpa;
  }

  public List<IntraAverageGpa> getAverageGPA() {
    return averageGPA;
  }

  public IntraSpice getSpice() {
    return spice;
  }

  public IntraNsStat getNsStat() {
    return nsStat;
  }

}
