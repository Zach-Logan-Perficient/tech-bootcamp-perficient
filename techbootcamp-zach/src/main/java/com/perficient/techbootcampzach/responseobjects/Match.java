package com.perficient.techbootcampzach.responseobjects;

import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Match {
	private MatchMetaData metadata;
	private MatchPlayers players;
	private MatchTeams teams;
	private Round[] rounds;
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
	}
	@Override
	public String toString() {
		return "{\n\"metadata\":\"" + metadata + "\",\n\"players\":\"" + players + "\",\n\"teams\":\"" + teams
				+ "\",\n\"rounds\":\"" + Arrays.toString(rounds) + "\"\n}";
	}
}
