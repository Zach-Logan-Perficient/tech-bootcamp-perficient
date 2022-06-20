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
public class Location {
	@Id
	@GeneratedValue
	private int id;
	
	@OneToOne(mappedBy = "plant_location")
	private PlantEvent plant_events;
	
	@OneToOne(mappedBy = "defuse_location")
	private DefuseEvent defuse_events;
	
	@OneToOne(mappedBy = "location")
	private PlayerLocation playerLocation;
	
	@OneToOne(mappedBy = "victim_death_location")
	private KillEvent kill_event;
	
	private int x;
	private int y;
	
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
	public PlayerLocation getPlayerLocation() {
		return playerLocation;
	}
	public void setPlayerLocation(PlayerLocation playerLocation) {
		this.playerLocation = playerLocation;
	}
	public KillEvent getKill_event() {
		return kill_event;
	}
	public void setKill_event(KillEvent kill_event) {
		this.kill_event = kill_event;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "{\n\"x\":\"" + x + "\",\n\"y\":\"" + y + "\"\n}";
	}
}
