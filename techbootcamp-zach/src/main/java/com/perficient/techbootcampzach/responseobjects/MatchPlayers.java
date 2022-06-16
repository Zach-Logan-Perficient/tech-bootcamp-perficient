package com.perficient.techbootcampzach.responseobjects;

import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MatchPlayers {
	private Player[] all_players;
	private Player[] red;
	private Player[] blue;
	public Player[] getAll_players() {
		return all_players;
	}
	public void setAll_players(Player[] all_players) {
		this.all_players = all_players;
	}
	public Player[] getRed() {
		return red;
	}
	public void setRed(Player[] red) {
		this.red = red;
	}
	public Player[] getBlue() {
		return blue;
	}
	public void setBlue(Player[] blue) {
		this.blue = blue;
	}
	@Override
	public String toString() {
		return "{\n\"all_players\":\"" + Arrays.toString(all_players) + "\",\n\"red\":\"" + Arrays.toString(red)
				+ "\",\n\"blue\":\"" + Arrays.toString(blue) + "\"\n}";
	}
}
