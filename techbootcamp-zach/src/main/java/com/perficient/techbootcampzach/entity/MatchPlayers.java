package com.perficient.techbootcampzach.entity;

import java.util.Arrays;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.OrderColumn;
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
	@OrderColumn
	private Player[] all_players;
	
	@OneToMany(mappedBy="matchPlayersRed", cascade = CascadeType.ALL)
	@OrderColumn
	private Player[] red;
	
	@OneToMany(mappedBy="matchPlayersBlue", cascade = CascadeType.ALL)
	@OrderColumn
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
		if (all_players == null) return;
		for(Player player : all_players) {
			player.setMatchPlayersAll(this);
		}
	}
	public Player[] getRed() {
		return red;
	}
	public void setRed(Player[] red) {
		this.red = red;
		if (red == null) return;
		for(Player player : red) {
			player.setMatchPlayersRed(this);
		}
	}
	public Player[] getBlue() {
		return blue;
	}
	public void setBlue(Player[] blue) {
		this.blue = blue;
		if (blue == null) return;
		for(Player player : blue) {
			player.setMatchPlayersBlue(this);
		}
	}
	@Override
	public String toString() {
		return "{\n\"all_players\":\"" + Arrays.toString(all_players) + "\",\n\"red\":\"" + Arrays.toString(red)
				+ "\",\n\"blue\":\"" + Arrays.toString(blue) + "\"\n}";
	}
}
