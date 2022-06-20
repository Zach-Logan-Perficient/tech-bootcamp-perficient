package com.perficient.techbootcampzach.entity;

import java.util.Arrays;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table
public class DefuseEvent {
	@Id
	@GeneratedValue
	private int id;
	
	@OneToOne(mappedBy = "defuse_events")
	private Round round;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Location defuse_location;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private PlayerBasic defused_by;
	private int defuse_time_in_round;
	
	@OneToMany(mappedBy="defuse_events", cascade = CascadeType.ALL)
	@OrderColumn
	private PlayerLocation[] player_locations_on_defuse;
	
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
	public Location getDefuse_location() {
		return defuse_location;
	}
	public void setDefuse_location(Location defuse_location) {
		this.defuse_location = defuse_location;
	}
	public PlayerBasic getDefused_by() {
		return defused_by;
	}
	public void setDefused_by(PlayerBasic defused_by) {
		this.defused_by = defused_by;
	}
	public int getDefuse_time_in_round() {
		return defuse_time_in_round;
	}
	public void setDefuse_time_in_round(int defuse_time_in_round) {
		this.defuse_time_in_round = defuse_time_in_round;
	}
	public PlayerLocation[] getPlayer_locations_on_defuse() {
		return player_locations_on_defuse;
	}
	public void setPlayer_locations_on_defuse(PlayerLocation[] player_locations_on_defuse) {
		this.player_locations_on_defuse = player_locations_on_defuse;
	}
	@Override
	public String toString() {
		return "{\n\"defuse_location\":\"" + defuse_location + "\",\n\"defused_by\":\"" + defused_by
				+ "\",\n\"defuse_time_in_round\":\"" + defuse_time_in_round + "\",\n\"player_locations_on_defuse\":\""
				+ Arrays.toString(player_locations_on_defuse) + "\"\n}";
	}
}
