package com.perficient.techbootcampzach.responseobjects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SessionPlaytime {
	private int minutes;
	private int seconds;
	private int milliseconds;
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
