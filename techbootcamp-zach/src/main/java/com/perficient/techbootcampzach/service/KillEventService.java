package com.perficient.techbootcampzach.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.perficient.techbootcampzach.entity.KillEvent;
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
}
