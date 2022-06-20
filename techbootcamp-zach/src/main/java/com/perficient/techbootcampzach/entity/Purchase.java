package com.perficient.techbootcampzach.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table
public class Purchase {
	@Id
	private String id;
	
	@OneToOne(mappedBy = "weapon")
	private PlayerStats playerStatsW;
	
	@OneToOne(mappedBy = "armor")
	private PlayerStats playerStatsA;
	
	private String name;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public PlayerStats getPlayerStatsW() {
		return playerStatsW;
	}
	public void setPlayerStatsW(PlayerStats playerStatsW) {
		this.playerStatsW = playerStatsW;
	}
	public PlayerStats getPlayerStatsA() {
		return playerStatsA;
	}
	public void setPlayerStatsA(PlayerStats playerStatsA) {
		this.playerStatsA = playerStatsA;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "{\n\"id\":\"" + id + "\",\n\"name\":\"" + name + "\"\n}";
	}
}
