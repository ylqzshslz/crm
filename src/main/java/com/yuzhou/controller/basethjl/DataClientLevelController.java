package com.yuzhou.controller.basethjl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yuzhou.entity.DataClientLevel;
import com.yuzhou.service.basehjl.DataClientLevelService;



@RestController
public class DataClientLevelController {
	
	@Autowired
	private DataClientLevelService dataClientlevelService;

	@RequestMapping("/selectDataClientLevelById")
	public DataClientLevel selectDataClientLevelById(@RequestBody DataClientLevel dataClientlevel) throws Exception {
		return dataClientlevelService.selectDataClientLevelById(dataClientlevel);
	}
	
	@RequestMapping("/selectDataClientLevelAll")
	public List<DataClientLevel> selectDataClientlevelAll() throws Exception {
		return dataClientlevelService.selectDataClientLevelAll();
	}

	@RequestMapping("/insertDataClientLevel")
	public int insertDataClientlevel(@RequestBody DataClientLevel dataClientlevel) throws Exception {
		return dataClientlevelService.insertDataClientLevel(dataClientlevel);
	}

	@RequestMapping("/deleteDataClientLevel")
	public int deleteDataClientlevel(@RequestBody DataClientLevel dataClientlevel) throws Exception {
		return dataClientlevelService.deleteDataClientLevel(dataClientlevel);
	}

	@RequestMapping("/updateDataClientLevel")
	public int updateDataClientlevel(@RequestBody DataClientLevel dataClientlevel) throws Exception {
		return dataClientlevelService.updateDataClientLevel(dataClientlevel);
	}
	
	@RequestMapping("/deleteDataClientLevelBatch")
	public int deleteDataClientLevelBatch(@RequestBody int[] dclIdArr)throws Exception{
		return dataClientlevelService.deleteDataClientLevelBatch(dclIdArr);
	}
	
//	rept
	@RequestMapping("/selectClientInfoAndDataClientLevelAll")
	public List<DataClientLevel> selectClientInfoAndDataClientLevelAll() throws Exception{
		return dataClientlevelService.selectClientInfoAndDataClientLevelAll();
	}
}
