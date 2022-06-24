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
	
	public HashMap<String, List<double[]>> associateKillEventsWithAreaLocations(List<KillEvent> events, String player) {
		HashMap<String, List<double[]>> associations = new HashMap<String, List<double[]>>();
		for(KillEvent ke : events) {
			double[] coords = ke.getCoordsOfPlayer(player);
			ArrayList<double[]> list = new ArrayList<double[]>();
			list.add(coords);
			List<double[]> prev = associations.putIfAbsent(getCallout(coords[0], coords[1]), list);
			if(prev != null) {
				prev.add(coords);
			}
		}
		return associations;
	}
	
	public String getCallout(double x, double y) {
		for(MapArea area: areas) {
			if(area.contains(x, y)) {
				return area.getCallout();
			}
		}
		return "NONE";
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
	public List<String> getCallouts() {
		List<String> callouts = new ArrayList<String>();
		for(MapArea area : areas) {
			if(!callouts.contains(area.getCallout())) {
				callouts.add(area.getCallout());
			}
		}
		return callouts;
	}
	
}
