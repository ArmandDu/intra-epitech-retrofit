package com.github.armanddu.heroku.intraepitech.response;


public class IntraGpa {

	private String	gpa;
	private String	cycle;

	public double getGpa() {
		return Double.parseDouble(gpa);
	}

	public String getCycle() {
		return cycle;
	}

}
