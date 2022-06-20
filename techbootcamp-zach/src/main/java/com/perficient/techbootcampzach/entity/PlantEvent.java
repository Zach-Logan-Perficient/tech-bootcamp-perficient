package com.perficient.techbootcampzach.entity;

import java.util.Arrays;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table
public class PlantEvent {
	@Id
	@GeneratedValue
	private int id;
	
	@OneToOne(mappedBy = "plant_events")
	private Round round;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Location plant_location;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private PlayerBasic planted_by;
	
	private String plant_site;
	private int plant_time_in_round;
	
	@OneToMany(mappedBy="plant_events", cascade = CascadeType.ALL)
	private PlayerLocation[] player_locations_on_plant;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Round getRound() {
		return round;
	}
	public void setRound(Round round) {
		this.round = round;
	}
	public Location getPlant_location() {
		return plant_location;
	}
	public void setPlant_location(Location plant_location) {
		this.plant_location = plant_location;
	}
	public PlayerBasic getPlanted_by() {
		return planted_by;
	}
	public void setPlanted_by(PlayerBasic planted_by) {
		this.planted_by = planted_by;
	}
	public String getPlant_site() {
		return plant_site;
	}
	public void setPlant_site(String plant_site) {
		this.plant_site = plant_site;
	}
	public int getPlant_time_in_round() {
		return plant_time_in_round;
	}
	public void setPlant_time_in_round(int plant_time_in_round) {
		this.plant_time_in_round = plant_time_in_round;
	}
	public PlayerLocation[] getPlayer_locations_on_plant() {
		return player_locations_on_plant;
	}
	public void setPlayer_locations_on_plant(PlayerLocation[] player_locations_on_plant) {
		this.player_locations_on_plant = player_locations_on_plant;
	}
	@Override
	public String toString() {
		return "{\n\"plant_location\":\"" + plant_location + "\",\n\"planted_by\":\"" + planted_by
				+ "\",\n\"plant_site\":\"" + plant_site + "\",\n\"plant_time_in_round\":\"" + plant_time_in_round
				+ "\",\n\"player_locations_on_plant\":\"" + Arrays.toString(player_locations_on_plant) + "\"\n}";
	}
}
