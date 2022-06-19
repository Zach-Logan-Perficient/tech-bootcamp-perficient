package com.perficient.techbootcampzach.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Economy {
	private int loadout_value;
	private Purchase weapon;
	private Purchase armor;
	private int remaining;
	private int spent;
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
