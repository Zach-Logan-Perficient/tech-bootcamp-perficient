package com.perficient.techbootcampzach.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table
public class Card {
	private String small;
	private String large;
	private String wide;
	@Id
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
