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
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table
public class PlayerStats {
	@Id
	@GeneratedValue
	private int id;
	
	@ManyToOne
	@JoinColumn
	private Round round;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private AbilityCasts ability_casts;
	private String player_puuid;
	private String player_display_name;
	private String player_team;
	private int damage;
	private int bodyshots;
	private int headshots;
	private int legshots;
	
	@OneToMany(mappedBy="player_stats", cascade = CascadeType.ALL)
	private KillEvent[] kill_events;
	private int kills;
	private int score;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Economy economy;
	private boolean was_afk;
	private boolean was_penalized;
	private boolean stayed_in_spawn;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Round getRound() {
		return round;
	}
	public void setRound(Round round) {
		this.round = round;
	}
	public AbilityCasts getAbility_casts() {
		return ability_casts;
	}
	public void setAbility_casts(AbilityCasts ability_casts) {
		this.ability_casts = ability_casts;
	}
	public String getPlayer_puuid() {
		return player_puuid;
	}
	public void setPlayer_puuid(String playear_puuid) {
		this.player_puuid = playear_puuid;
	}
	public String getPlayer_display_name() {
		return player_display_name;
	}
	public void setPlayer_display_name(String player_display_name) {
		this.player_display_name = player_display_name;
	}
	public String getPlayer_team() {
		return player_team;
	}
	public void setPlayer_team(String palyer_team) {
		this.player_team = palyer_team;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public int getBodyshots() {
		return bodyshots;
	}
	public void setBodyshots(int bodyshots) {
		this.bodyshots = bodyshots;
	}
	public int getHeadshots() {
		return headshots;
	}
	public void setHeadshots(int headshots) {
		this.headshots = headshots;
	}
	public int getLegshots() {
		return legshots;
	}
	public void setLegshots(int legshots) {
		this.legshots = legshots;
	}
	public KillEvent[] getKill_events() {
		return kill_events;
	}
	public void setKill_events(KillEvent[] kill_events) {
		this.kill_events = kill_events;
	}
	public int getKills() {
		return kills;
	}
	public void setKills(int kills) {
		this.kills = kills;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Economy getEconomy() {
		return economy;
	}
	public void setEconomy(Economy economy) {
		this.economy = economy;
	}
	public boolean isWas_afk() {
		return was_afk;
	}
	public void setWas_afk(boolean was_afk) {
		this.was_afk = was_afk;
	}
	public boolean isWas_penalized() {
		return was_penalized;
	}
	public void setWas_penalized(boolean was_penalized) {
		this.was_penalized = was_penalized;
	}
	public boolean isStayed_in_spawn() {
		return stayed_in_spawn;
	}
	public void setStayed_in_spawn(boolean stayed_in_spawn) {
		this.stayed_in_spawn = stayed_in_spawn;
	}
	@Override
	public String toString() {
		return "{\n\"ability_casts\":\"" + ability_casts + "\",\n\"player_puuid\":\"" + player_puuid
				+ "\",\n\"player_display_name\":\"" + player_display_name + "\",\n\"player_team\":\"" + player_team
				+ "\",\n\"damage\":\"" + damage + "\",\n\"bodyshots\":\"" + bodyshots + "\",\n\"headshots\":\""
				+ headshots + "\",\n\"legshots\":\"" + legshots + "\",\n\"kill_events\":\""
				+ Arrays.toString(kill_events) + "\",\n\"kills\":\"" + kills + "\",\n\"score\":\"" + score
				+ "\",\n\"economy\":\"" + economy + "\",\n\"was_afk\":\"" + was_afk + "\",\n\"was_penalized\":\""
				+ was_penalized + "\",\n\"stayead_in_spawn\":\"" + stayed_in_spawn + "\"\n}";
	}
	
}
