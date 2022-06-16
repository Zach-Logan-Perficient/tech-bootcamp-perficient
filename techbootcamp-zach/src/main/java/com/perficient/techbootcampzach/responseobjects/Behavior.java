package com.perficient.techbootcampzach.responseobjects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Behavior {
	private int afk_rounds;
	private FriendlyFire friendly_fire;
	private int rounds_in_spawn;
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
