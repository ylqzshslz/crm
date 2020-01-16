package com.yuzhou.mapper.salehjl;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.yuzhou.entity.SaleChance;

@Mapper
public interface SaleChanceMapper {
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
//	按chanceId销售机会编号查询sysUser系统用表、saleChance销售机会表、salePlan销售机会执行计划表
	public SaleChance selectSysUserAndSaleChanceAndSalePlanBychanceId(SaleChance salechance);

}
