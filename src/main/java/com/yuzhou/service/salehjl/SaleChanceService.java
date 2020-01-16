package com.yuzhou.service.salehjl;

import java.util.List;

import com.yuzhou.entity.SaleChance;

public interface SaleChanceService {
//	销售管理->销售机会管理功能，按ChanceStatus(销售机会状态为0 未分配)多条件模糊查询机会
	public List<SaleChance> selectSaleChanceByChanceStatus(SaleChance saleChance);
//	分页功能，查询销售机会状态(0 未分配)多条件模糊查询总记录数
	public int selectSaleChanceCount(SaleChance saleChance);
//	新建销售机会
	public int insertSaleChance(SaleChance saleChance);
//	按chanceId更新salechance表
	public int updaeSaleChanceByChanceId(SaleChance salechance); 
//	按chanceId删除salechance表
	public int delSaleChanceByChanceId(SaleChance salechance);
}
