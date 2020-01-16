package com.yuzhou.entity;

public class DataClientLevel {
	private int dclId;
	private String dclName;
	
	private ClientInfo clientInfo;
	
	public int getDclId() {
		return dclId;
	}
	public void setDclId(int dclId) {
		this.dclId = dclId;
	}
	public String getDclName() {
		return dclName;
	}
	public void setDclName(String dclName) {
		this.dclName = dclName;
	}
	
	public ClientInfo getClientInfo() {
		return clientInfo;
	}
	public void setClientInfo(ClientInfo clientInfo) {
		this.clientInfo = clientInfo;
	}
	public DataClientLevel() {
		super();
	}
	public DataClientLevel(int dclId, String dclName) {
		super();
		this.dclId = dclId;
		this.dclName = dclName;
	}
	
}	
