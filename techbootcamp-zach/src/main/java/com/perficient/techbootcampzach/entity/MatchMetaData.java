package com.perficient.techbootcampzach.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table
public class MatchMetaData {
	private String map;
	private String game_version;
	private int game_length;
	private int game_start;
	private String game_start_patched;
	private int rounds_played;
	private String mode;
	private String season_id;
	private String platform;
	@Id
	private String matchid;
	private String region;
	private String cluster;
	
	@OneToOne(mappedBy = "metadata")
	private Match match;
	
	public String getMap() {
		return map;
	}
	public void setMap(String map) {
		this.map = map;
	}
	public String getGame_version() {
		return game_version;
	}
	public void setGame_version(String game_version) {
		this.game_version = game_version;
	}
	public int getGame_length() {
		return game_length;
	}
	public void setGame_length(int game_length) {
		this.game_length = game_length;
	}
	public int getGame_start() {
		return game_start;
	}
	public void setGame_start(int game_start) {
		this.game_start = game_start;
	}
	public String getGame_start_patched() {
		return game_start_patched;
	}
	public void setGame_start_patched(String game_start_patched) {
		this.game_start_patched = game_start_patched;
	}
	public int getRounds_played() {
		return rounds_played;
	}
	public void setRounds_played(int rounds_played) {
		this.rounds_played = rounds_played;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public String getSeason_id() {
		return season_id;
	}
	public void setSeason_id(String season_id) {
		this.season_id = season_id;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public String getMatchid() {
		return matchid;
	}
	public void setMatchid(String matchid) {
		this.matchid = matchid;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getCluster() {
		return cluster;
	}
	public void setCluster(String cluster) {
		this.cluster = cluster;
	}
	public Match getMatch() {
		return match;
	}
	public void setMatch(Match match) {
		this.match = match;
	}
	@Override
	public String toString() {
		return "{\n\"map\":\"" + map + "\",\n\"game_version\":\"" + game_version + "\",\n\"game_length\":\""
				+ game_length + "\",\n\"game_start\":\"" + game_start + "\",\n\"game_start_patched\":\""
				+ game_start_patched + "\",\n\"rounds_played\":\"" + rounds_played + "\",\n\"mode\":\"" + mode
				+ "\",\n\"season_id\":\"" + season_id + "\",\n\"platform\":\"" + platform + "\",\n\"matchid\":\""
				+ matchid + "\",\n\"region\":\"" + region + "\",\n\"cluster\":\"" + cluster + "\"\n}";
	}
}
