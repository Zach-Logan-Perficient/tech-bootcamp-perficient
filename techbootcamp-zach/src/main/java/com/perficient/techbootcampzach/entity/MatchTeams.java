package com.perficient.techbootcampzach.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Table
@Entity
public class MatchTeams {
	@Id
	@GeneratedValue
	private int id;
	
	@OneToOne(mappedBy = "players")
	private Match match;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Team red;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Team blue;
	
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
	public Team getRed() {
		return red;
	}
	public void setRed(Team red) {
		this.red = red;
	}
	public Team getBlue() {
		return blue;
	}
	public void setBlue(Team blue) {
		this.blue = blue;
	}
	@Override
	public String toString() {
		return "{\n\"red\":\"" + red + "\",\n\"blue\":\"" + blue + "\"\n}";
	}
}
