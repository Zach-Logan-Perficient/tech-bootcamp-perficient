package com.perficient.techbootcampzach.map;

public class SquareArea implements MapArea {
	private int x, y, w, h;
	private String callout;
	
	@Override
	public boolean contains(double x, double y) {
		return x <= this.x && y >= this.y && x >= this.x-h && y <= this.y+w;
	}

	public SquareArea(int x, int y, int h, int w, String callout) {
		super();
		this.x = -x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.callout = callout;
	}

	@Override
	public String getCallout() {
		return callout;
	}

	@Override
	public void setCallout(String callout) {
		this.callout = callout;
	}

}
