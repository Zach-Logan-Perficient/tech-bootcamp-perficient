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
@Table(name = "match_tbl")
public class Match {
	@Id
	@GeneratedValue
	private int id;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private MatchMetaData metadata;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private MatchPlayers players;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private MatchTeams teams;
	
	@OneToMany(mappedBy="match", cascade = CascadeType.ALL)
	@OrderColumn
	private Round[] rounds;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public MatchMetaData getMetadata() {
		return metadata;
	}
	public void setMetadata(MatchMetaData metadata) {
		this.metadata = metadata;
	}
	public MatchPlayers getPlayers() {
		return players;
	}
	public void setPlayers(MatchPlayers players) {
		this.players = players;
	}
	public MatchTeams getTeams() {
		return teams;
	}
	public void setTeams(MatchTeams teams) {
		this.teams = teams;
	}
	public Round[] getRounds() {
		return rounds;
	}
	public void setRounds(Round[] rounds) {
		this.rounds = rounds;
		if (rounds == null) return;
		for(Round round : rounds) {
			round.setMatch(this);
		}
	}
	@Override
	public String toString() {
		return "{\n\"metadata\":\"" + metadata + "\",\n\"players\":\"" + players + "\",\n\"teams\":\"" + teams
				+ "\",\n\"rounds\":\"" + Arrays.toString(rounds) + "\"\n}";
	}
}
