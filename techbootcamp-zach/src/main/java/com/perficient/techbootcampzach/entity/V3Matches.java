package com.perficient.techbootcampzach.entity;

import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class V3Matches {
	private String status;
	private Match[] data;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Match[] getData() {
		return data;
	}
	public void setData(Match[] data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "{\n\"status\":\"" + status + "\",\n\"data\":\"" + Arrays.toString(data) + "\"\n}";
	}
}
