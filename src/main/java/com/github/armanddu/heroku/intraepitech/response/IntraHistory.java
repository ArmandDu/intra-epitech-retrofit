package com.github.armanddu.heroku.intraepitech.response;

import com.google.gson.annotations.SerializedName;

public class IntraHistory {
	private String			title;
	private IntraUserInfo	user;
	private String			content;
	private String			date;
	private String			id;
	private String			visible;
	@SerializedName("id_activite")
  private String idActivity;
	@SerializedName("class")
	private String			classType;

	public String getTitle() {
		return title;
	}

	public IntraUserInfo getUser() {
		return user;
	}

	public String getContent() {
		return content;
	}

	public String getDate() {
		return date;
	}

	public Number getId() {
		return Integer.valueOf(id);
	}

	public String getVisible() {
		return visible;
	}

	public int getIdActivity() {
		return Integer.parseInt(idActivity);
	}

	public String getClassType() {
		return classType;
	}

}
