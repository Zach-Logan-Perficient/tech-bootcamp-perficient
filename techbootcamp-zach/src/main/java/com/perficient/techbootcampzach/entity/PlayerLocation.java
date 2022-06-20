package com.perficient.techbootcampzach.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table
public class PlayerLocation {
	@Id
	@GeneratedValue
	private int id;
	
	@ManyToOne
	@JoinColumn
	private PlantEvent plant_events;
	
	@ManyToOne
	@JoinColumn
	private DefuseEvent defuse_events;
	
	@ManyToOne
	@JoinColumn
	private KillEvent kill_event;
	
	private String player_puuid;
	private String player_display_name;
	private String player_team;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Location location;
	private double view_radians;
	
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
	public KillEvent getKill_event() {
		return kill_event;
	}
	public void setKill_event(KillEvent kill_event) {
		this.kill_event = kill_event;
	}
	public String getPlayer_puuid() {
		return player_puuid;
	}
	public void setPlayer_puuid(String player_puuid) {
		this.player_puuid = player_puuid;
	}
	public String getPlayer_display_name() {
		return player_display_name;
	}
	public void setPlayer_display_name(String player_display_name) {
		this.player_display_name = player_display_name;
	}
	public String getPlayer_team() {
		return player_team;
	}
	public void setPlayer_team(String player_team) {
		this.player_team = player_team;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public double getView_radians() {
		return view_radians;
	}
	public void setView_radians(double view_radians) {
		this.view_radians = view_radians;
	}
	@Override
	public String toString() {
		return "{\n\"player_puuid\":\"" + player_puuid + "\",\n\"player_display_name\":\"" + player_display_name
				+ "\",\n\"player_team\":\"" + player_team + "\",\n\"location\":\"" + location
				+ "\",\n\"view_radians\":\"" + view_radians + "\"\n}";
	}
}
