package com.perficient.techbootcampzach.responseobjects;

import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Round {
	private String winning_team;
	private String end_type;
	private boolean bomb_planted;
	private boolean bomb_defused;
	private PlantEvent plant_events;
	private DefuseEvent defuse_events;
	private PlayerStats[] player_stats;
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
