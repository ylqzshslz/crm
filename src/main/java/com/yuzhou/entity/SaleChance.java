package com.yuzhou.entity;

import java.util.List;

public class SaleChance {
	private Integer chanceId;
	private String chanceSource;
	private String chanceCustName;
	private String chanceTitle;
	private Integer chanceRate;
	private String chanceLinkman;
	private String chanceTel;
	private String chanceDesc;
	private Integer chanceCreateId;
	private String chanceCreateDate;
	private Integer chanceDueId;
	private String chanceDueDate;
	private Integer chanceStatus;
	
	private SysUser sysUser;
	private List<SalePlan> salePlans;
	
	private Integer beginNum;
	private Integer maxNum;
	
	public Integer getChanceId() {
		return chanceId;
	}
	public void setChanceId(Integer chanceId) {
		this.chanceId = chanceId;
	}
	public String getChanceSource() {
		return chanceSource;
	}
	public void setChanceSource(String chanceSource) {
		this.chanceSource = chanceSource;
	}
	public String getChanceCustName() {
		return chanceCustName;
	}
	public void setChanceCustName(String chanceCustName) {
		this.chanceCustName = chanceCustName;
	}
	public String getChanceTitle() {
		return chanceTitle;
	}
	public void setChanceTitle(String chanceTitle) {
		this.chanceTitle = chanceTitle;
	}
	public Integer getChanceRate() {
		return chanceRate;
	}
	public void setChanceRate(Integer chanceRate) {
		this.chanceRate = chanceRate;
	}
	public String getChanceLinkman() {
		return chanceLinkman;
	}
	public void setChanceLinkman(String chanceLinkman) {
		this.chanceLinkman = chanceLinkman;
	}
	public String getChanceTel() {
		return chanceTel;
	}
	public void setChanceTel(String chanceTel) {
		this.chanceTel = chanceTel;
	}
	public String getChanceDesc() {
		return chanceDesc;
	}
	public void setChanceDesc(String chanceDesc) {
		this.chanceDesc = chanceDesc;
	}
	public Integer getChanceCreateId() {
		return chanceCreateId;
	}
	public void setChanceCreateId(Integer chanceCreateId) {
		this.chanceCreateId = chanceCreateId;
	}
	public String getChanceCreateDate() {
		return chanceCreateDate;
	}
	public void setChanceCreateDate(String chanceCreateDate) {
		this.chanceCreateDate = chanceCreateDate;
	}
	public Integer getChanceDueId() {
		return chanceDueId;
	}
	public void setChanceDueId(Integer chanceDueId) {
		this.chanceDueId = chanceDueId;
	}
	public String getChanceDueDate() {
		return chanceDueDate;
	}
	public void setChanceDueDate(String chanceDueDate) {
		this.chanceDueDate = chanceDueDate;
	}
	public Integer getChanceStatus() {
		return chanceStatus;
	}
	public void setChanceStatus(Integer chanceStatus) {
		this.chanceStatus = chanceStatus;
	}
	
	public Integer getBeginNum() {
		return beginNum;
	}
	public void setBeginNum(Integer beginNum) {
		this.beginNum = beginNum;
	}
	public Integer getMaxNum() {
		return maxNum;
	}
	public void setMaxNum(Integer maxNum) {
		this.maxNum = maxNum;
	}
	
	public SysUser getSysUser() {
		return sysUser;
	}
	public void setSysUser(SysUser sysUser) {
		this.sysUser = sysUser;
	}
	public List<SalePlan> getSalePlans() {
		return salePlans;
	}
	public void setSalePlans(List<SalePlan> salePlans) {
		this.salePlans = salePlans;
	}
	public SaleChance() {
		super();
	}
	public SaleChance(int chanceId, String chanceSource, String chanceCustName, String chanceTitle, int chanceRate,
			String chanceLinkman, String chanceTel, String chanceDesc, int chanceCreateId, String chanceCreateDate,
			int chanceDueId, String chanceDueDate, int chanceStatus) {
		super();
		this.chanceId = chanceId;
		this.chanceSource = chanceSource;
		this.chanceCustName = chanceCustName;
		this.chanceTitle = chanceTitle;
		this.chanceRate = chanceRate;
		this.chanceLinkman = chanceLinkman;
		this.chanceTel = chanceTel;
		this.chanceDesc = chanceDesc;
		this.chanceCreateId = chanceCreateId;
		this.chanceCreateDate = chanceCreateDate;
		this.chanceDueId = chanceDueId;
		this.chanceDueDate = chanceDueDate;
		this.chanceStatus = chanceStatus;
	}
	
}
