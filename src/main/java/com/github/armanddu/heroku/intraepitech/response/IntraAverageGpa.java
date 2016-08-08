package com.github.armanddu.heroku.intraepitech.response;

import com.google.gson.annotations.SerializedName;


public class IntraAverageGpa {
	private String	cycle;
	@SerializedName("gpa_average")
	private String	averageGpa;

	public String getCycle() {
		return cycle;
	}

	public double getAverageGpa() {
		return Double.valueOf(averageGpa);
	}

}
