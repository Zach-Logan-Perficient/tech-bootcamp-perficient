package com.perficient.techbootcampzach.entity;

import java.util.Arrays;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table
public class Round {
	@Id
	@GeneratedValue
	private int id;
	
	@ManyToOne
	@JoinColumn
	private Match match;
	
	private String winning_team;
	private String end_type;
	private boolean bomb_planted;
	private boolean bomb_defused;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private PlantEvent plant_events;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private DefuseEvent defuse_events;
	
	@OneToMany(mappedBy="round", cascade = CascadeType.ALL)
	@OrderColumn
	private PlayerStats[] player_stats;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Match getMatch() {
		return match;
	}
	public void setMatch(Match match) {
		this.match = match;
	}
	public String getWinning_team() {
		return winning_team;
	}
	public void setWinning_team(String winning_team) {
		this.winning_team = winning_team;
	}
	public String getEnd_type() {
		return end_type;
	}
	public void setEnd_type(String end_type) {
		this.end_type = end_type;
	}
	public boolean isBomb_planted() {
		return bomb_planted;
	}
	public void setBomb_planted(boolean bomb_planted) {
		this.bomb_planted = bomb_planted;
	}
	public boolean isBomb_defused() {
		return bomb_defused;
	}
	public void setBomb_defused(boolean bomb_defused) {
		this.bomb_defused = bomb_defused;
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
	public PlayerStats[] getPlayer_stats() {
		return player_stats;
	}
	public void setPlayer_stats(PlayerStats[] player_stats) {
		this.player_stats = player_stats;
		if (player_stats == null) return;
		for(PlayerStats PS : player_stats) {
			PS.setRound(this);
		}
	}
	@Override
	public String toString() {
		return "{\n\"winning_team\":\"" + winning_team + "\",\n\"end_type\":\"" + end_type
				+ "\",\n\"bomb_planted\":\"" + bomb_planted + "\",\n\"bomb_defused\":\"" + bomb_defused
				+ "\",\n\"plant_events\":\"" + plant_events + "\",\n\"defuse_events\":\""
				+ defuse_events + "\",\n\"player_stats\":\"" + Arrays.toString(player_stats)
				+ "\"\n}";
	}
}
