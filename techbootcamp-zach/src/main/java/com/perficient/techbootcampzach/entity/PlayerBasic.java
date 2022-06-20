package com.perficient.techbootcampzach.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table
public class PlayerBasic {
	@Id
	@GeneratedValue
	private int id;
	
	@OneToOne(mappedBy = "planted_by")
	private PlantEvent plant_events;
	
	@OneToOne(mappedBy = "defused_by")
	private DefuseEvent defuse_events;
	
	private String puuid;
	private String display_name;
	private String team;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public PlantEvent getPlant_events() {
		return plant_events;
	}
	public void setPlant_events(PlantEvent plant_events) {
		this.plant_events = plant_events;
	}
	public DefuseEvent getDefuse_events() {
		return defuse_events;
	}
	public void setDefuse_events(DefuseEvent defuse_events) {
		this.defuse_events = defuse_events;
	}
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
