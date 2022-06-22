package com.perficient.techbootcampzach.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.perficient.techbootcampzach.entity.KillEvent;

public class Map {
	private String name;
	private List<MapArea> areas;
	
	public Map(String name) {
		this.name = name;
		areas = new ArrayList<MapArea>();
	}
	
	public Map(String name, List<MapArea> areas) {
		this.name = name;
		this.areas = areas;
	}
	
	public HashMap<MapArea, List<KillEvent>> associateKillEventsWithAreas(List<KillEvent> events) {
		return null;
	}
	
	public void addArea(MapArea area) {
		areas.add(area);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<MapArea> getAreas() {
		return areas;
	}
	public void setAreas(List<MapArea> areas) {
		this.areas = areas;
	}
	
}
