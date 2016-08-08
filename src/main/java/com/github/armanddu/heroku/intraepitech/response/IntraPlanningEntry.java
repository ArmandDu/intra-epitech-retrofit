package com.github.armanddu.heroku.intraepitech.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class IntraPlanningEntry {

  @SerializedName("module_available")
  private boolean isModuleAvailable;
  @SerializedName("nb_hours")
  private String nHours;
  @SerializedName("total_students_registered")
  private int totalRegisteredStudents;
  @SerializedName("scolaryear")
  private String scolarYear;
  @SerializedName("register_month")
  private boolean registerMonth;
  @SerializedName("prof_inst")
  private List<IntraLogin> prof;
  @SerializedName("instance_location")
  private String location;
  @SerializedName("register_prof")
  private boolean profRegistered;
  @SerializedName("is_rdv")
  private String isRdv;
  @SerializedName("num_event")
  private String eventNumber;
  @SerializedName("register_student")
  private boolean studentRegistered;
  private boolean project;
  @SerializedName("event_registered")
  private String eventRegistered;
  @SerializedName("allow_register")
  private boolean registerAllowed;
  @SerializedName("codeacti")
  private String activityCode;
  private IntraRoom room;
  private String dates;
  @SerializedName("codeevent")
  private String codeEvent;
  @SerializedName("type_code")
  private String codeType;
  @SerializedName("allow_token")
  private boolean tokenAllowed;
  private int semester;
  @SerializedName("module_registered")
  private boolean moduleRegistered;
  @SerializedName("acti_title")
  private String activityTitle;
  @SerializedName("type_title")
  private String type;

  private String start;
  private String end;
  private String title;

  public String getScolarYear() {
    return scolarYear;
  }

  public void setScolarYear(String scolarYear) {
    this.scolarYear = scolarYear;
  }

  public boolean isRegisterMonth() {
    return registerMonth;
  }

  public void setRegisterMonth(boolean registerMonth) {
    this.registerMonth = registerMonth;
  }

  public List<IntraLogin> getProf() {
    return prof;
  }

  public void setProf(List<IntraLogin> prof) {
    this.prof = prof;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public boolean isProfRegistered() {
    return profRegistered;
  }

  public void setProfRegistered(boolean profRegistered) {
    this.profRegistered = profRegistered;
  }

  public String getIsRdv() {
    return isRdv;
  }

  public void setIsRdv(String isRdv) {
    this.isRdv = isRdv;
  }

  public String getEventNumber() {
    return eventNumber;
  }

  public void setEventNumber(String eventNumber) {
    this.eventNumber = eventNumber;
  }

  public boolean isStudentRegistered() {
    return studentRegistered;
  }

  public void setStudentRegistered(boolean studentRegistered) {
    this.studentRegistered = studentRegistered;
  }

  public boolean isProject() {
    return project;
  }

  public void setProject(boolean project) {
    this.project = project;
  }

  public String getEventRegistered() {
    return eventRegistered;
  }

  public void setEventRegistered(String eventRegistered) {
    this.eventRegistered = eventRegistered;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public boolean isRegisterAllowed() {
    return registerAllowed;
  }

  public void setRegisterAllowed(boolean registerAllowed) {
    this.registerAllowed = registerAllowed;
  }

  public String getActivityCode() {
    return activityCode;
  }

  public void setActivityCode(String activityCode) {
    this.activityCode = activityCode;
  }

  public IntraRoom getRoom() {
    return room;
  }

  public void setRoom(IntraRoom room) {
    this.room = room;
  }

  public String getDates() {
    return dates;
  }

  public void setDates(String dates) {
    this.dates = dates;
  }

  public String getCodeEvent() {
    return codeEvent;
  }

  public void setCodeEvent(String codeEvent) {
    this.codeEvent = codeEvent;
  }

  public String getEnd() {
    return end;
  }

  public void setEnd(String end) {
    this.end = end;
  }

  public String getStart() {
    return start;
  }

  public void setStart(String start) {
    this.start = start;
  }

  public String getCodeType() {
    return codeType;
  }

  public void setCodeType(String codeType) {
    this.codeType = codeType;
  }

  public boolean isTokenAllowed() {
    return tokenAllowed;
  }

  public void setTokenAllowed(boolean tokenAllowed) {
    this.tokenAllowed = tokenAllowed;
  }

  public int getSemester() {
    return semester;
  }

  public void setSemester(int semester) {
    this.semester = semester;
  }

  public boolean isModuleRegistered() {
    return moduleRegistered;
  }

  public void setModuleRegistered(boolean moduleRegistered) {
    this.moduleRegistered = moduleRegistered;
  }

  public String getActivityTitle() {
    return activityTitle;
  }

  public void setActivityTitle(String activityTitle) {
    this.activityTitle = activityTitle;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public boolean isModuleAvailable() {
    return isModuleAvailable;
  }

  public void setModuleAvailable(boolean isModuleAvailable) {
    this.isModuleAvailable = isModuleAvailable;
  }

  public String getNbHours() {
    return nHours;
  }

  public void setnHours(String nHours) {
    this.nHours = nHours;
  }

  public int getTotalRegisteredStudents() {
    return totalRegisteredStudents;
  }

  public void setTotalRegisteredStudents(int totalRegisteredStudents) {
    this.totalRegisteredStudents = totalRegisteredStudents;
  }


}
