package com.yuzhou.entity;

public class Orders {
	private int ordersId;
	private String ordersDate;
	private String address;
	private int ordersState;
	private String clientCode;
	private int ordersTotal;
	private String remark;
	
	private ClientInfo clientInfo;
	
	public int getOrdersId() {
		return ordersId;
	}
	public void setOrdersId(int ordersId) {
		this.ordersId = ordersId;
	}
	public String getOrdersDate() {
		return ordersDate;
	}
	public void setOrdersDate(String ordersDate) {
		this.ordersDate = ordersDate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getOrdersState() {
		return ordersState;
	}
	public void setOrdersState(int ordersState) {
		this.ordersState = ordersState;
	}
	public String getClientCode() {
		return clientCode;
	}
	public void setClientCode(String clientCode) {
		this.clientCode = clientCode;
	}
	public int getOrdersTotal() {
		return ordersTotal;
	}
	public void setOrdersTotal(int ordersTotal) {
		this.ordersTotal = ordersTotal;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	public ClientInfo getClientInfo() {
		return clientInfo;
	}
	public void setClientInfo(ClientInfo clientInfo) {
		this.clientInfo = clientInfo;
	}
	public Orders() {
		super();
	}
	public Orders(int ordersId, String ordersDate, String address, int ordersState, String clientCode, int ordersTotal,
			String remark) {
		super();
		this.ordersId = ordersId;
		this.ordersDate = ordersDate;
		this.address = address;
		this.ordersState = ordersState;
		this.clientCode = clientCode;
		this.ordersTotal = ordersTotal;
		this.remark = remark;
	}
	
}
