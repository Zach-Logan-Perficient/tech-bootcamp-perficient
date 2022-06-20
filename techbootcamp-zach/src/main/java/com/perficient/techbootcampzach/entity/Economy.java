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
@Entity
@Table
public class Economy {
	@Id
	@GeneratedValue
	private int id;
	
	@OneToOne(mappedBy = "economy")
	private PlayerStats playerStats;
	
	private int loadout_value;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Purchase weapon;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Purchase armor;
	private int remaining;
	private int spent;
	
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
	public int getLoadout_value() {
		return loadout_value;
	}
	public void setLoadout_value(int loadout_value) {
		this.loadout_value = loadout_value;
	}
	public Purchase getWeapon() {
		return weapon;
	}
	public void setWeapon(Purchase weapon) {
		this.weapon = weapon;
	}
	public Purchase getArmor() {
		return armor;
	}
	public void setArmor(Purchase armor) {
		this.armor = armor;
	}
	public int getRemaining() {
		return remaining;
	}
	public void setRemaining(int remaining) {
		this.remaining = remaining;
	}
	public int getSpent() {
		return spent;
	}
	public void setSpent(int spent) {
		this.spent = spent;
	}
	@Override
	public String toString() {
		return "{\n\"loadout_value\":\"" + loadout_value + "\",\n\"weapon\":\"" + weapon + "\",\n\"armor\":\""
				+ armor + "\",\n\"remaining\":\"" + remaining + "\",\n\"spent\":\"" + spent + "\"\n}";
	}
}
