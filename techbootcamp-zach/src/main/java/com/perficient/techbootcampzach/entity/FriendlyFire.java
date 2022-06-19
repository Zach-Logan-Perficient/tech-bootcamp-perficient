package com.perficient.techbootcampzach.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FriendlyFire {
	private int incoming;
	private int outgoing;
	public int getIncoming() {
		return incoming;
	}
	public void setIncoming(int incoming) {
		this.incoming = incoming;
	}
	public int getOutgoing() {
		return outgoing;
	}
	public void setOutgoing(int outgoing) {
		this.outgoing = outgoing;
	}
	@Override
	public String toString() {
		return "{\n\"incoming\":\"" + incoming + "\",\n\"outgoing\":\"" + outgoing + "\"\n}";
	}
}
