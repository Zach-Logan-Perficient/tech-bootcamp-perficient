package com.perficient.techbootcampzach.entity;

import javax.persistence.Entity;
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
	private Economy economyW;
	
	@OneToOne(mappedBy = "armor")
	private Economy economyA;
	
	private String name;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Economy getEconomyW() {
		return economyW;
	}
	public void setEconomyW(Economy economyW) {
		this.economyW = economyW;
	}
	public Economy getEconomyA() {
		return economyA;
	}
	public void setEconomyA(Economy economyA) {
		this.economyA = economyA;
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
