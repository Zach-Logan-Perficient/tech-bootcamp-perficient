package com.perficient.techbootcampzach.entity;

import java.util.Arrays;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table
public class KillEvent {
	@Id
	@GeneratedValue
	private int id;
	
	@ManyToOne
	@JoinColumn
	private PlayerStats player_stats;
	
	private int kill_time_in_round;
	private int kill_time_in_match;
	private String killer_puuid;
	private String killer_display_name;
	private String killer_team;
	private String victim_puuid;
	private String victim_display_name;
	private String victim_team;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Location victim_death_location;
	private String damage_weapon_id;
	private String damage_weapon_name;
	private boolean secondary_fire_mode;
	
	@OneToMany(mappedBy="kill_event", cascade = CascadeType.ALL)
	@OrderColumn
	private PlayerLocation[] player_locations_on_kill;
	
	@OneToMany(mappedBy="kill_event", cascade = CascadeType.ALL)
	@OrderColumn
	private Assistant[] assistants;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public PlayerStats getPlayer_stats() {
		return player_stats;
	}
	public void setPlayer_stats(PlayerStats player_stats) {
		this.player_stats = player_stats;
	}
	public int getKill_time_in_round() {
		return kill_time_in_round;
	}
	public void setKill_time_in_round(int kill_time_in_round) {
		this.kill_time_in_round = kill_time_in_round;
	}
	public int getKill_time_in_match() {
		return kill_time_in_match;
	}
	public void setKill_time_in_match(int kill_time_in_match) {
		this.kill_time_in_match = kill_time_in_match;
	}
	public String getKiller_puuid() {
		return killer_puuid;
	}
	public void setKiller_puuid(String killer_puuid) {
		this.killer_puuid = killer_puuid;
	}
	public String getKiller_display_name() {
		return killer_display_name;
	}
	public void setKiller_display_name(String killer_display_name) {
		this.killer_display_name = killer_display_name;
	}
	public String getKiller_team() {
		return killer_team;
	}
	public void setKiller_team(String killer_team) {
		this.killer_team = killer_team;
	}
	public String getVictim_puuid() {
		return victim_puuid;
	}
	public void setVictim_puuid(String victim_puuid) {
		this.victim_puuid = victim_puuid;
	}
	public String getVictim_display_name() {
		return victim_display_name;
	}
	public void setVictim_display_name(String victim_display_name) {
		this.victim_display_name = victim_display_name;
	}
	public String getVictim_team() {
		return victim_team;
	}
	public void setVictim_team(String victim_team) {
		this.victim_team = victim_team;
	}
	public Location getVictim_death_location() {
		return victim_death_location;
	}
	public void setVictim_death_location(Location victim_death_loaction) {
		this.victim_death_location = victim_death_loaction;
	}
	public String getDamage_weapon_id() {
		return damage_weapon_id;
	}
	public void setDamage_weapon_id(String damage_weapon_id) {
		this.damage_weapon_id = damage_weapon_id;
	}
	public String getDamage_weapon_name() {
		return damage_weapon_name;
	}
	public void setDamage_weapon_name(String damage_weapon_name) {
		this.damage_weapon_name = damage_weapon_name;
	}
	public boolean isSecondary_fire_mode() {
		return secondary_fire_mode;
	}
	public void setSecondary_fire_mode(boolean secondary_fire_mode) {
		this.secondary_fire_mode = secondary_fire_mode;
	}
	public PlayerLocation[] getPlayer_locations_on_kill() {
		return player_locations_on_kill;
	}
	public void setPlayer_locations_on_kill(PlayerLocation[] player_locations_on_kill) {
		this.player_locations_on_kill = player_locations_on_kill;
		if (player_locations_on_kill == null) return;
		for(PlayerLocation PL : player_locations_on_kill) {
			PL.setKill_event(this);
		}
	}
	public Assistant[] getAssistants() {
		return assistants;
	}
	public void setAssistants(Assistant[] assistants) {
		this.assistants = assistants;
		if (assistants == null) return;
		for(Assistant assistant: assistants) {
			assistant.setKill_event(this);
		}
	}
	@Override
	public String toString() {
		return "{\n\"kill_time_in_round\":\"" + kill_time_in_round + "\",\n\"kill_time_in_match\":\""
				+ kill_time_in_match + "\",\n\"killer_puuid\":\"" + killer_puuid + "\",\n\"killer_display_name\":\""
				+ killer_display_name + "\",\n\"killer_team\":\"" + killer_team + "\",\n\"victim_puuid\":\""
				+ victim_puuid + "\",\n\"victim_display_name\":\"" + victim_display_name + "\",\n\"victim_team\":\""
				+ victim_team + "\",\n\"victim_death_location\":\"" + victim_death_location
				+ "\",\n\"damage_weapon_id\":\"" + damage_weapon_id + "\",\n\"damage_weapon_name\":\""
				+ damage_weapon_name + "\",\n\"secondary_fire_mode\":\"" + secondary_fire_mode
				+ "\",\n\"player_locations_on_kill\":\"" + Arrays.toString(player_locations_on_kill)
				+ "\",\n\"assistants\":\"" + Arrays.toString(assistants) + "\"\n}";
	}
}
