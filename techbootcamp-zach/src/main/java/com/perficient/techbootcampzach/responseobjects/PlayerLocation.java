package com.perficient.techbootcampzach.responseobjects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlayerLocation {
	private String player_puuid;
	private String player_display_name;
	private String player_team;
	private Location location;
	private double view_radians;
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
