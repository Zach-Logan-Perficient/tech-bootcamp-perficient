package com.perficient.techbootcampzach.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Table
@Entity
public class Team {
	@Id
	@GeneratedValue
	private int id;
	
	@OneToOne(mappedBy = "red")
	private MatchTeams redTeam;
	
	@OneToOne(mappedBy = "blue")
	private MatchTeams blueTeam;
	
	private boolean has_won;
	private int rounds_won;
	private int rounds_lost;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public MatchTeams getRedTeam() {
		return redTeam;
	}
	public void setRedTeam(MatchTeams redTeam) {
		this.redTeam = redTeam;
	}
	public MatchTeams getBlueTeam() {
		return blueTeam;
	}
	public void setBlueTeam(MatchTeams blueTeam) {
		this.blueTeam = blueTeam;
	}
	public boolean isHas_won() {
		return has_won;
	}
	public void setHas_won(boolean has_won) {
		this.has_won = has_won;
	}
	public int getRounds_won() {
		return rounds_won;
	}
	public void setRounds_won(int rounds_won) {
		this.rounds_won = rounds_won;
	}
	public int getRounds_lost() {
		return rounds_lost;
	}
	public void setRounds_lost(int rounds_lost) {
		this.rounds_lost = rounds_lost;
	}
	@Override
	public String toString() {
		return "{\n\"has_won\":\"" + has_won + "\",\n\"rounds_won\":\"" + rounds_won + "\",\n\"rounds_lost\":\""
				+ rounds_lost + "\"\n}";
	}
}
