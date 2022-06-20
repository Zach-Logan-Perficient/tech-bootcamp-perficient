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
public class Behavior {
	@Id
	@GeneratedValue
	private int id;
	
	@OneToOne(mappedBy = "behavior")
	private Player player;
	
	private int afk_rounds;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private FriendlyFire friendly_fire;
	private int rounds_in_spawn;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	public int getAfk_rounds() {
		return afk_rounds;
	}
	public void setAfk_rounds(int afk_rounds) {
		this.afk_rounds = afk_rounds;
	}
	public FriendlyFire getFriendly_fire() {
		return friendly_fire;
	}
	public void setFriendly_fire(FriendlyFire friendly_fire) {
		this.friendly_fire = friendly_fire;
	}
	public int getRounds_in_spawn() {
		return rounds_in_spawn;
	}
	public void setRounds_in_spawn(int rounds_in_spawn) {
		this.rounds_in_spawn = rounds_in_spawn;
	}
	@Override
	public String toString() {
		return "{\n\"afk_rounds\":\"" + afk_rounds + "\",\n\"friendly_fire\":\"" + friendly_fire
				+ "\",\n\"rounds_in_spawn\":\"" + rounds_in_spawn + "\"\n}";
	}
}
