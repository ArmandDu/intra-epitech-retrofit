package com.github.armanddu.heroku.intraepitech.response;



public class IntraLogin {

  private String login;
  private String picture;
  private String title;
  private String promo;
  private String present;
  private String type;

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public String getPicture() {
    return picture;
  }

  public void setPicture(String picture) {
    this.picture = picture;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getPromo() {
    return promo;
  }

  public void setPromo(String promo) {
    this.promo = promo;
  }

  public String getPresent() {
    return present;
  }

  public void setPresent(String present) {
    this.present = present;
  }

}
