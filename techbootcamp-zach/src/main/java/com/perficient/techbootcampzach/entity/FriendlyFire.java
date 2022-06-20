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
public class FriendlyFire {
	@Id
	@GeneratedValue
	private int id;
	
	@OneToOne(mappedBy = "friendly_fire")
	private Behavior behavior;
	
	private int incoming;
	private int outgoing;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Behavior getBehavior() {
		return behavior;
	}
	public void setBehavior(Behavior behavior) {
		this.behavior = behavior;
	}
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
