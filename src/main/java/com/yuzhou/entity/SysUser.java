package com.yuzhou.entity;



public class SysUser {
	private Integer userId;
	private String userName;
	private String userPassword;
	private Integer daId;
	private Integer userRoleId;
	private Integer userFlag;
	private DataArea dataArea;
	private Integer beginNum;
	private Integer maxPageNum;

	
	public DataArea getDataArea() {
		return dataArea;
	}

	public void setDataArea(DataArea dataArea) {
		this.dataArea = dataArea;
	}

	public Integer getBeginNum() {
		return beginNum;
	}

	public void setBeginNum(Integer beginNum) {
		this.beginNum = beginNum;
	}

	public Integer getMaxPageNum() {
		return maxPageNum;
	}

	public void setMaxPageNum(Integer maxPageNum) {
		this.maxPageNum = maxPageNum;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public Integer getDaId() {
		return daId;
	}

	public void setDaId(Integer daId) {
		this.daId = daId;
	}

	public Integer getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(Integer userRoleId) {
		this.userRoleId = userRoleId;
	}

	public Integer getUserFlag() {
		return userFlag;
	}

	public void setUserFlag(Integer userFlag) {
		this.userFlag = userFlag;
	}

	public SysUser() {
		super();
	}

	public SysUser(Integer userId, String userName, String userPassword, Integer daId, Integer userRoleId,
			Integer userFlag, com.yuzhou.entity.DataArea dataArea, Integer beginNum, Integer maxPageNum) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.daId = daId;
		this.userRoleId = userRoleId;
		this.userFlag = userFlag;
		this.dataArea = dataArea;
		this.beginNum = beginNum;
		this.maxPageNum = maxPageNum;
	}
	

}
