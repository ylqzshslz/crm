package com.yuzhou.service.salehjl.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuzhou.entity.SaleChance;
import com.yuzhou.mapper.salehjl.SaleChanceMapper;
import com.yuzhou.service.salehjl.SaleChanceService;

@Service
public class SaleChanceServiceImpl implements SaleChanceService {
	@Autowired
	private SaleChanceMapper saleChanceMapper;

//	销售管理->销售机会管理功能，按ChanceStatus(销售机会状态为0 未分配)多条件模糊查询机会
	@Override
	public List<SaleChance> selectSaleChanceByChanceStatus(SaleChance saleChance) {
		return saleChanceMapper.selectSaleChanceByChanceStatus(saleChance);
	}

//	分页功能，查询销售机会状态(0 未分配)多条件模糊查询总记录数
	@Override
	public int selectSaleChanceCount(SaleChance saleChance) {
		return saleChanceMapper.selectSaleChanceCount(saleChance);
	}

//	新建销售机会
	@Override
	public int insertSaleChance(SaleChance saleChance) {
		return saleChanceMapper.insertSaleChance(saleChance);
	}
//	按chanceId更新salechance表
	@Override
	public int updaeSaleChanceByChanceId(SaleChance salechance) {
		return saleChanceMapper.updaeSaleChanceByChanceId(salechance);
	}

//	按chanceId删除salechance表
	@Override
	public int delSaleChanceByChanceId(SaleChance salechance) {
		return saleChanceMapper.delSaleChanceByChanceId(salechance);
	}

}
