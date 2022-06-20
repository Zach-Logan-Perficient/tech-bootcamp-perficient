package com.perficient.techbootcampzach.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table
public class Assistant {
	@Id
	@GeneratedValue
	private int id;
	
	@ManyToOne
	@JoinColumn
	private KillEvent kill_event;
	
	private String assistant_puuid;
	private String assistant_display_name;
	private String assistant_team;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public KillEvent getKill_event() {
		return kill_event;
	}
	public void setKill_event(KillEvent kill_event) {
		this.kill_event = kill_event;
	}
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
