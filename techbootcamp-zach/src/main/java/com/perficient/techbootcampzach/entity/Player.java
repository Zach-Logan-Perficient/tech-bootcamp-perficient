package com.perficient.techbootcampzach.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table
public class Player {
	@Id
	@GeneratedValue
	private int id;
	
	@ManyToOne
	@JoinColumn
	private MatchPlayers matchPlayersAll;
	
	@ManyToOne
	@JoinColumn
	private MatchPlayers matchPlayersRed;
	
	@ManyToOne
	@JoinColumn
	private MatchPlayers matchPlayersBlue;
	
	private String puuid;
	private String name;
	private String tag;
	private String team;
	private String character;
	private String player_id;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private SessionPlaytime session_playtime;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Behavior behavior;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public MatchPlayers getMatchPlayersAll() {
		return matchPlayersAll;
	}
	public void setMatchPlayersAll(MatchPlayers matchPlayersAll) {
		this.matchPlayersAll = matchPlayersAll;
	}
	public MatchPlayers getMatchPlayersRed() {
		return matchPlayersRed;
	}
	public void setMatchPlayersRed(MatchPlayers matchPlayersRed) {
		this.matchPlayersRed = matchPlayersRed;
	}
	public MatchPlayers getMatchPlayersBlue() {
		return matchPlayersBlue;
	}
	public void setMatchPlayersBlue(MatchPlayers matchPlayersBlue) {
		this.matchPlayersBlue = matchPlayersBlue;
	}
	public String getPuuid() {
		return puuid;
	}
	public void setPuuid(String puuid) {
		this.puuid = puuid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getCharacter() {
		return character;
	}
	public void setCharacter(String character) {
		this.character = character;
	}
	public String getPlayer_id() {
		return player_id;
	}
	public void setPlayer_id(String player_id) {
		this.player_id = player_id;
	}
	public SessionPlaytime getSession_playtime() {
		return session_playtime;
	}
	public void setSession_playtime(SessionPlaytime session_playtime) {
		this.session_playtime = session_playtime;
	}
	public Behavior getBehavior() {
		return behavior;
	}
	public void setBehavior(Behavior behavior) {
		this.behavior = behavior;
	}
	@Override
	public String toString() {
		return "{\n\"puuid\":\"" + puuid + "\",\n\"name\":\"" + name + "\",\n\"tag\":\"" + tag + "\",\n\"team\":\""
				+ team + "\",\n\"character\":\"" + character + "\",\n\"player_id\":\"" + player_id
				+ "\",\n\"session_playtime\":\"" + session_playtime + "\",\n\"behavior\":\"" + behavior + "\"\n}";
	}
}
