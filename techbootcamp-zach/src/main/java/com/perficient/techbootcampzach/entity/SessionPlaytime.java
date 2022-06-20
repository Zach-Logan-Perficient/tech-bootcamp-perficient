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
public class SessionPlaytime {
	@Id
	@GeneratedValue
	private int id;
	
	@OneToOne(mappedBy = "session_playtime")
	private Player player;
	
	private int minutes;
	private int seconds;
	private int milliseconds;
	
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
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	public int getSeconds() {
		return seconds;
	}
	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}
	public int getMilliseconds() {
		return milliseconds;
	}
	public void setMilliseconds(int milliseconds) {
		this.milliseconds = milliseconds;
	}
	@Override
	public String toString() {
		return "{\n\"minutes\":\"" + minutes + "\",\n\"seconds\":\"" + seconds + "\",\n\"milliseconds\":\""
				+ milliseconds + "\"\n}";
	}
}
