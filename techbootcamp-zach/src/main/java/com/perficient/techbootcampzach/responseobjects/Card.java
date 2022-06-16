package com.perficient.techbootcampzach.responseobjects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Card {
	private String small;
	private String large;
	private String wide;
	private String id;
	public String getSmall() {
		return small;
	}
	public void setSmall(String small) {
		this.small = small;
	}
	public String getLarge() {
		return large;
	}
	public void setLarge(String large) {
		this.large = large;
	}
	public String getWide() {
		return wide;
	}
	public void setWide(String wide) {
		this.wide = wide;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String toString()
	{
		return "small: " + "'" + small + "',\n"
			+ "large: " + "'" + large + "',\n"
			+ "wide: " + "'" + wide + "',\n"
			+ "id: " + "'" + id + "'\n";
	}
}
