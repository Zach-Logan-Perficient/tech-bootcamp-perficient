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
public class AccountData {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String puuid;
	private String region;
	private long account_level;
	private String name;
	private String tag;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Card card;
	private String last_update;
	public String getPuuid() {
		return puuid;
	}
	public void setPuuid(String puuid) {
		this.puuid = puuid;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public long getAccount_level() {
		return account_level;
	}
	public void setAccount_level(long account_level) {
		this.account_level = account_level;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}
	public String getLast_update() {
		return last_update;
	}
	public void setLast_update(String last_update) {
		this.last_update = last_update;
	}
	
	public String toString()
	{
		return "puuid: " + "'" + puuid + "',\n"
				+ "region: " + "'" + region + "',\n"
				+ "account_level: " + account_level + ",\n"
				+ "name: " + "'" + name + "',\n"
				+ "tag: " + "'" + tag + "',\n"
				+ "card: " + "{\n" + card + "},\n"
				+ "last_update: " + "'" + last_update + "'\n";
	}
}
