package com.perficient.techbootcampzach.responseobjects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Team {
	private boolean has_won;
	private int rounds_won;
	private int rounds_lost;
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
