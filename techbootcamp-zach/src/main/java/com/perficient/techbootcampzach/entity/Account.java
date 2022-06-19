package com.perficient.techbootcampzach.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Account {
	private long status;
	private AccountData data;
	
	public long getStatus() {
		return status;
	}
	public void setStatus(long status) {
		this.status = status;
	}
	
	public AccountData getData() {
		return data;
	}
	public void setData(AccountData data) {
		this.data = data;
	}
	
	public String toString()
	{
		return "Account: {\n"
				+ "status:" + status + ",\n"
				+ "data: {\n" + data + "}\n}";
	}
}
