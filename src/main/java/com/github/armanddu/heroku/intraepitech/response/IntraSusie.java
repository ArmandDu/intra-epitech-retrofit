package com.github.armanddu.heroku.intraepitech.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class IntraSusie {

  private int id;
  @SerializedName("id_calendar")
  private int calendarId;
  private String location;
  @SerializedName("type_room")
  private String roomType;
  private String type;
  private String start;
  private String end;
  private String title;
  private String description;
  @SerializedName("nb_place")
  private int nbPlace;
  private String color;
  @SerializedName("confirm_owner")
  private boolean confirmOwner;
  @SerializedName("confirm_maker")
  private boolean confirmMaker;
  @SerializedName("id_owner")
  private String ownerId;
  @SerializedName("id_maker")
  private String makerId;
  @SerializedName("rating_event")
  private String eventRate;
  @SerializedName("rating_student")
  private String studentRate;
  private String duration;
  private List<IntraLogin> logins;
  private IntraRight rights;
  private IntraCalendar calendar;
  private IntraLogin owner;
  private IntraLogin maker;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getCalendarId() {
    return calendarId;
  }

  public void setCalendarId(int calendarId) {
    this.calendarId = calendarId;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getRoomType() {
    return roomType;
  }

  public void setRoomType(String roomType) {
    this.roomType = roomType;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getStart() {
    return start;
  }

  public void setStart(String start) {
    this.start = start;
  }

  public String getEnd() {
    return end;
  }

  public void setEnd(String end) {
    this.end = end;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getNbPlace() {
    return nbPlace;
  }

  public void setNbPlace(int nbPlace) {
    this.nbPlace = nbPlace;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public boolean isConfirmOwner() {
    return confirmOwner;
  }

  public void setConfirmOwner(boolean confirmOwner) {
    this.confirmOwner = confirmOwner;
  }

  public boolean isConfirmMaker() {
    return confirmMaker;
  }

  public void setConfirmMaker(boolean confirmMaker) {
    this.confirmMaker = confirmMaker;
  }

  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }

  public String getMakerId() {
    return makerId;
  }

  public void setMakerId(String makerId) {
    this.makerId = makerId;
  }

  public String getEventRate() {
    return eventRate;
  }

  public void setEventRate(String eventRate) {
    this.eventRate = eventRate;
  }

  public String getStudentRate() {
    return studentRate;
  }

  public void setStudentRate(String studentRate) {
    this.studentRate = studentRate;
  }

  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public List<IntraLogin> getLogins() {
    return logins;
  }

  public void setLogins(List<IntraLogin> logins) {
    this.logins = logins;
  }

  public IntraRight getRights() {
    return rights;
  }

  public void setRights(IntraRight rights) {
    this.rights = rights;
  }

  public IntraCalendar getCalendar() {
    return calendar;
  }

  public void setCalendar(IntraCalendar calendar) {
    this.calendar = calendar;
  }

  public IntraLogin getOwner() {
    return owner;
  }

  public void setOwner(IntraLogin owner) {
    this.owner = owner;
  }

  public IntraLogin getMaker() {
    return maker;
  }

  public void setMaker(IntraLogin maker) {
    this.maker = maker;
  }



}
