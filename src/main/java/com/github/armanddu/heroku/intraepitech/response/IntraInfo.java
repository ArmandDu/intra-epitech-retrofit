package com.github.armanddu.heroku.intraepitech.response;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class IntraInfo {

  private String ip;
  private IntraBoard board;
  private String message;
  private IntraGlobalInfos infos;
  @SerializedName("current")
  private IntraCurrentInfos currentInfos;
  private List<IntraHistory> history;

  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public IntraBoard getBoard() {
    return board;
  }

  public void setBoard(IntraBoard board) {
    this.board = board;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public IntraGlobalInfos getInfos() {
    return infos;
  }

  public void setInfos(IntraGlobalInfos infos) {
    this.infos = infos;
  }

  public IntraCurrentInfos getCurrentInfos() {
    return currentInfos;
  }

  public void setCurrentInfos(IntraCurrentInfos currentInfos) {
    this.currentInfos = currentInfos;
  }

  public List<IntraHistory> getHistory() {
    return history;
  }

  public void setHistory(List<IntraHistory> history) {
    this.history = history;
  }

}
