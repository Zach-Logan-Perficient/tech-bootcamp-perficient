package com.perficient.techbootcampzach.entity;

import java.util.Arrays;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Table
@Entity
public class MatchPlayers {
	@Id
	@GeneratedValue
	private int id;
	
	@OneToOne(mappedBy = "players")
	private Match match;
	
	@OneToMany(mappedBy="matchPlayersAll", cascade = CascadeType.ALL)
	private Player[] all_players;
	
	@OneToMany(mappedBy="matchPlayersRed", cascade = CascadeType.ALL)
	private Player[] red;
	
	@OneToMany(mappedBy="matchPlayersBlue", cascade = CascadeType.ALL)
	private Player[] blue;
	
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
