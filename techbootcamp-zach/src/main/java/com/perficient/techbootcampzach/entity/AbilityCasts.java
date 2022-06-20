package com.perficient.techbootcampzach.entity;

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
public class AbilityCasts {
	@Id
	@GeneratedValue
	private int id;
	
	@OneToOne(mappedBy = "ability_casts")
	private PlayerStats playerStats;
	
	private int c_casts;
	private int q_casts;
	private int e_casts;
	private int x_casts;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public PlayerStats getPlayerStats() {
		return playerStats;
	}
	public void setPlayerStats(PlayerStats playerStats) {
		this.playerStats = playerStats;
	}
	public int getC_casts() {
		return c_casts;
	}
	public void setC_casts(int c_casts) {
		this.c_casts = c_casts;
	}
	public int getQ_casts() {
		return q_casts;
	}
	public void setQ_casts(int q_casts) {
		this.q_casts = q_casts;
	}
	public int getE_casts() {
		return e_casts;
	}
	public void setE_casts(int e_casts) {
		this.e_casts = e_casts;
	}
	public int getX_casts() {
		return x_casts;
	}
	public void setX_casts(int x_casts) {
		this.x_casts = x_casts;
	}
	@Override
	public String toString() {
		return "{\n\"c_casts\":\"" + c_casts + "\",\n\"q_casts\":\"" + q_casts + "\",\n\"e_casts\":\"" + e_casts
				+ "\",\n\"x_casts\":\"" + x_casts + "\"\n}";
	}
}
