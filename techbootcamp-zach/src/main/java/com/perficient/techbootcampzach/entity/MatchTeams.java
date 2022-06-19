package com.perficient.techbootcampzach.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MatchTeams {
	private Team red;
	private Team blue;
	public Team getRed() {
		return red;
	}
	public void setRed(Team red) {
		this.red = red;
	}
	public Team getBlue() {
		return blue;
	}
	public void setBlue(Team blue) {
		this.blue = blue;
	}
	@Override
	public String toString() {
		return "{\n\"red\":\"" + red + "\",\n\"blue\":\"" + blue + "\"\n}";
	}
}
