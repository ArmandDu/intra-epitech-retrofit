package com.github.armanddu.heroku.intraepitech.response;

import com.google.gson.annotations.SerializedName;

public class IntraActivity {

    private String title;
    @SerializedName("module")
    private String moduleName;
    @SerializedName("module_link")
    private String moduleLink;
    @SerializedName("module_code")
    private String moduleCode;
    @SerializedName("title_link")
    private String titleLink;
    @SerializedName("timeline_start")
    private String timelineStart;
    @SerializedName("timeline_end")
    private String timelineEnd;
    @SerializedName("timeline_barre")
    private String timelineBarre;
    @SerializedName("date_inscription")
    private boolean inscriptionDate;
    @SerializedName("salle")
    private String room;
    private String intervenant;
    private String token;
    @SerializedName("token_link")
    private String tokenLink;
    @SerializedName("register_link")
    private String registerLink;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getModuleLink() {
        return moduleLink;
    }

    public void setModuleLink(String moduleLink) {
        this.moduleLink = moduleLink;
    }

    public String getModuleCode() {
        return moduleCode;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }

    public String getTitleLink() {
        return titleLink;
    }

    public void setTitleLink(String titleLink) {
        this.titleLink = titleLink;
    }

    public String getTimelineStart() {
        return timelineStart;
    }

    public void setTimelineStart(String timelineStart) {
        this.timelineStart = timelineStart;
    }

    public String getTimelineEnd() {
        return timelineEnd;
    }

    public void setTimelineEnd(String timelineEnd) {
        this.timelineEnd = timelineEnd;
    }

    public String getTimelineBarre() {
        return timelineBarre;
    }

    public void setTimelineBarre(String timelineBarre) {
        this.timelineBarre = timelineBarre;
    }

    public boolean isInscriptionDate() {
        return inscriptionDate;
    }

    public void setInscriptionDate(boolean inscriptionDate) {
        this.inscriptionDate = inscriptionDate;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getIntervenant() {
        return intervenant;
    }

    public void setIntervenant(String intervenant) {
        this.intervenant = intervenant;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getTokenLink() {
        return tokenLink;
    }

    public void setTokenLink(String tokenLink) {
        this.tokenLink = tokenLink;
    }

    public String getRegisterLink() {
        return registerLink;
    }

    public void setRegisterLink(String registerLink) {
        this.registerLink = registerLink;
    }


}
