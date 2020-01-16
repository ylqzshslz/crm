package com.yuzhou.controller.basethjl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yuzhou.entity.ClientServer;
import com.yuzhou.entity.DataServerType;
import com.yuzhou.service.basehjl.DataServerTypeService;



@RestController
public class DataServerTypeController {
	
	@Autowired
	private DataServerTypeService dataServerTypeService;
	
	@RequestMapping("/selectDataServerTypeById")
	public DataServerType selectDataServerTypeById(@RequestBody DataServerType dataServerType) throws Exception{
		return dataServerTypeService.selectDataServerTypeById(dataServerType);
	}
	
	@RequestMapping("/selectDataServerTypeAll")
	public List<DataServerType> selectDataServerTypeAll() throws Exception{
		return dataServerTypeService.selectDataServerTypeAll();
	}
	
	@RequestMapping("/insertDataServerType")
	public int insertDataServerType(@RequestBody DataServerType dataServerType) throws Exception{
		return dataServerTypeService.insertDataServerType(dataServerType);
	}
	
	@RequestMapping("/deleteDataServerType")
	public int deleteDataServerType(@RequestBody DataServerType dataServerType) throws Exception{
		return dataServerTypeService.deleteDataServerType(dataServerType);
	}
	
	@RequestMapping("/updateDataServerType")
	public int updateDataServerType(@RequestBody DataServerType dataServerType) throws Exception{
		return dataServerTypeService.updateDataServerType(dataServerType);
	}
	
	@RequestMapping("/deleteDataServerBatch")
	public int deleteDataServerBatch(@RequestBody int[] dstIdArr) throws Exception{
		return dataServerTypeService.deleteDataServerBatch(dstIdArr);
	}
	
//	rept
	@RequestMapping("/selectDataServerTypeAndClientServerAll")
	public List<ClientServer> selectDataServerTypeAndClientServerAll() throws Exception{
		return dataServerTypeService.selectDataServerTypeAndClientServerAll();
	}

}
