package com.perficient.techbootcampzach.responseobjects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlayerBasic {
	private String puuid;
	private String display_name;
	private String team;
	public String getPuuid() {
		return puuid;
	}
	public void setPuuid(String puuid) {
		this.puuid = puuid;
	}
	public String getDisplay_name() {
		return display_name;
	}
	public void setDisplay_name(String display_name) {
		this.display_name = display_name;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	@Override
	public String toString() {
		return "{\n\"puuid\":\"" + puuid + "\",\n\"display_name\":\"" + display_name + "\",\n\"team\":\"" + team
				+ "\"\n}";
	}
}
