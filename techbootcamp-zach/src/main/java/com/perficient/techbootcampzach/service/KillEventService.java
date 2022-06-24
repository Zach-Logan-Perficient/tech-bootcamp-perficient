package com.perficient.techbootcampzach.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.perficient.techbootcampzach.entity.KillEvent;
import com.perficient.techbootcampzach.map.Map;
import com.perficient.techbootcampzach.map.Maps;
import com.perficient.techbootcampzach.repository.KillEventRepository;

@Service
public class KillEventService {
	@Autowired
	private KillEventRepository repo;
	
	public List<KillEvent> getKillEvents(String name){
		return repo.findKillEventsByName(name + "#NA1");
	}
	
	public List<KillEvent> getKills(String name){
		return repo.findKillsByName(name + "#NA1");
	}
	
	public List<KillEvent> getSelfKills(String name){
		return repo.findSelfKillsByName(name + "#NA1");
	}
	
	public List<KillEvent> getDeaths(String name){
		return repo.findDeathsByName(name + "#NA1");
	}
	
	public List<KillEvent> getKillEvents(String name, String map){
		return repo.findKillEventsByNameAndMap(name + "#NA1", map);
	}
	
	public List<KillEvent> getKills(String name, String map){
		return repo.findKillsByNameAndMap(name + "#NA1", map);
	}
	
	public List<KillEvent> getSelfKills(String name, String map){
		return repo.findSelfKillsByNameAndMap(name + "#NA1", map);
	}
	
	public List<KillEvent> getDeaths(String name, String map){
		return repo.findDeathsByNameAndMap(name + "#NA1", map);
	}
	
	public String[][] getDataToShow(String player, String map, String side, String weapon) {
		List<KillEvent> kills = getKills(player, map);
		List<KillEvent> deaths = getDeaths(player, map);
		HashMap<String, List<double[]>> dmap = Maps.BREEZE.associateKillEventsWithAreaLocations(deaths, player);
		HashMap<String, List<double[]>> kmap = Maps.BREEZE.associateKillEventsWithAreaLocations(kills, player);
		List<String[]> data = new ArrayList<String[]>();;
		for(String callout: Maps.BREEZE.getCallouts()) {
			int killnum = 0;
			int deathnum = 0;
			if(kmap.get(callout) != null)
			{
				killnum = kmap.get(callout).size();
			}
			if(dmap.get(callout) != null)
			{
				deathnum = dmap.get(callout).size();
			}
			data.add(new String[] {callout, Integer.toString(killnum), Integer.toString(deathnum), Double.toString(deathnum == 0 ? killnum : Math.round(100*killnum/(double)deathnum)/100.0)});
		}
		String[][] arrdata = new String[1][1];
		return data.toArray(arrdata);
	}
}
