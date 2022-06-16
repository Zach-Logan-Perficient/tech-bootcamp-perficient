package com.perficient.techbootcampzach.responseobjects;

import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DefuseEvent {
	private Location defuse_location;
	private PlayerBasic defused_by;
	private int defuse_time_in_round;
	private PlayerLocation[] player_locations_on_defuse;
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
