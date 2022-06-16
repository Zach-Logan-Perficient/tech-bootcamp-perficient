package com.perficient.techbootcampzach.responseobjects;

import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlayerStats {
	private AbilityCasts ability_casts;
	private String playear_puuid;
	private String palyer_team;
	private int damage;
	private int bodyshots;
	private int headshots;
	private int legshots;
	private KillEvent[] kill_events;
	private int kills;
	private int score;
	private Economy economy;
	private boolean was_afk;
	private boolean was_penalized;
	private boolean stayead_in_spawn;
	public AbilityCasts getAbility_casts() {
		return ability_casts;
	}
	public void setAbility_casts(AbilityCasts ability_casts) {
		this.ability_casts = ability_casts;
	}
	public String getPlayear_puuid() {
		return playear_puuid;
	}
	public void setPlayear_puuid(String playear_puuid) {
		this.playear_puuid = playear_puuid;
	}
	public String getPalyer_team() {
		return palyer_team;
	}
	public void setPalyer_team(String palyer_team) {
		this.palyer_team = palyer_team;
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
	public boolean isStayead_in_spawn() {
		return stayead_in_spawn;
	}
	public void setStayead_in_spawn(boolean stayead_in_spawn) {
		this.stayead_in_spawn = stayead_in_spawn;
	}
	@Override
	public String toString() {
		return "{\n\"ability_casts\":\"" + ability_casts + "\",\n\"playear_puuid\":\"" + playear_puuid
				+ "\",\n\"palyer_team\":\"" + palyer_team + "\",\n\"damage\":\"" + damage + "\",\n\"bodyshots\":\""
				+ bodyshots + "\",\n\"headshots\":\"" + headshots + "\",\n\"legshots\":\"" + legshots
				+ "\",\n\"kill_events\":\"" + Arrays.toString(kill_events) + "\",\n\"kills\":\"" + kills
				+ "\",\n\"score\":\"" + score + "\",\n\"economy\":\"" + economy + "\",\n\"was_afk\":\"" + was_afk
				+ "\",\n\"was_penalized\":\"" + was_penalized + "\",\n\"stayead_in_spawn\":\"" + stayead_in_spawn
				+ "\"\n}";
	}
}
