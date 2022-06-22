package com.perficient.techbootcampzach.map;

public interface MapArea {
	public boolean contains(int x, int y);
	public String getCallout();
	public void setCallout(String callout);
}
