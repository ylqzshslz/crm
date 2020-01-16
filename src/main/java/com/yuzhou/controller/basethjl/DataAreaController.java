package com.yuzhou.controller.basethjl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yuzhou.entity.DataArea;
import com.yuzhou.service.basehjl.DataAreaService;




@RestController
public class DataAreaController {

	@Autowired
	private DataAreaService dataAreaService;
	
	@RequestMapping("/selectDataAreaById")
	public DataArea selectDataAreaById(@RequestBody DataArea dataArea) throws Exception{
		return dataAreaService.selectDataAreaById(dataArea);
	}
	
	@RequestMapping("/selectDataAreaAll")
	public List<DataArea> selectDataAreaAll() throws Exception{
		return dataAreaService.selectDataAreaAll();
	}
	
	@RequestMapping("/insertDataArea")
	public int insertDataArea(@RequestBody DataArea dataArea) throws Exception{
		return dataAreaService.insertDataArea(dataArea);
	}
	
	@RequestMapping("/deleteDataArea")
	public int deleteDataArea(@RequestBody DataArea dataArea) throws Exception{
		return dataAreaService.deleteDataArea(dataArea);
	}
	
	@RequestMapping("/updateDataArea")
	public int updateDataArea(@RequestBody DataArea dataArea) throws Exception{
		return dataAreaService.updateDataArea(dataArea);
	}
	
	@RequestMapping("/deleteDataAreaBatch")
	public int deleteDataAreaBatch(@RequestBody int[] daIdArr)throws Exception{
		return dataAreaService.deleteDataAreaBatch(daIdArr);
	}
}
