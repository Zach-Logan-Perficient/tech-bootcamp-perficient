package com.perficient.techbootcampzach.map;

public interface MapArea {
	public boolean contains(double x, double y);
	public String getCallout();
	public void setCallout(String callout);
}
