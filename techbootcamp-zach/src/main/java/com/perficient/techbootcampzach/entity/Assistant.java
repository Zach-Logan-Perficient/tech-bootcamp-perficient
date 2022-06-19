package com.perficient.techbootcampzach.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Assistant {
	private String assistant_puuid;
	private String assistant_display_name;
	private String assistant_team;
	public String getAssistant_puuid() {
		return assistant_puuid;
	}
	public void setAssistant_puuid(String assistant_puuid) {
		this.assistant_puuid = assistant_puuid;
	}
	public String getAssistant_display_name() {
		return assistant_display_name;
	}
	public void setAssistant_display_name(String assistant_display_name) {
		this.assistant_display_name = assistant_display_name;
	}
	public String getAssistant_team() {
		return assistant_team;
	}
	public void setAssistant_team(String assistant_team) {
		this.assistant_team = assistant_team;
	}
	@Override
	public String toString() {
		return "{\n\"assistant_puuid\":\"" + assistant_puuid + "\",\n\"assistant_display_name\":\""
				+ assistant_display_name + "\",\n\"assistant_team\":\"" + assistant_team + "\"\n}";
	}
}
