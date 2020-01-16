package com.yuzhou.controller.salehjl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yuzhou.entity.SaleChance;
import com.yuzhou.service.salehjl.SaleChanceService;


@RestController
public class SaleChanceController {
	@Autowired
	private SaleChanceService saleChanceService;
	
//	销售管理->销售机会管理功能，按ChanceStatus(销售机会状态为0 未分配)多条件模糊查询机会
	@RequestMapping("/selectSaleChanceByChanceStatus")
	public List<SaleChance> selectSaleChanceByChanceStatus(@RequestBody SaleChance saleChance) {
		return saleChanceService.selectSaleChanceByChanceStatus(saleChance);
	}
	
//	分页功能，查询销售机会状态(0 未分配)多条件模糊查询总记录数
	@RequestMapping("/selectSaleChanceCount")
	public int selectSaleChanceCount(@RequestBody SaleChance saleChance) {
		return saleChanceService.selectSaleChanceCount(saleChance);
	}
	
//	新建销售机会
	@RequestMapping("/insertSaleChance")
	public int insertSaleChance(@RequestBody SaleChance saleChance) {
		return saleChanceService.insertSaleChance(saleChance);
	}

//	按chanceId更新salechance表
	@RequestMapping("/updaeSaleChanceByChanceId")
	public int updaeSaleChanceByChanceId(@RequestBody SaleChance salechance)throws Exception {
		return saleChanceService.updaeSaleChanceByChanceId(salechance);
	}
	
//	按chanceId删除salechance表
	@RequestMapping("/delSaleChanceByChanceId")
	public int delSaleChanceByChanceId(@RequestBody SaleChance salechance)throws Exception {
		return saleChanceService.delSaleChanceByChanceId(salechance);
	}


}
