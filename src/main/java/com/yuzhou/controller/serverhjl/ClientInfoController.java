package com.yuzhou.controller.serverhjl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yuzhou.entity.ClientInfo;
import com.yuzhou.service.serverhjl.ClientInfoService;

@RestController("serverClientInfoController")
public class ClientInfoController {
    
	@Autowired
	@Qualifier("serverClientInfoService")
	private ClientInfoService clientInfoService;
	
	@RequestMapping("/selectClientInfoAll")
	public List<ClientInfo> selectClientInfoAll() {
		return clientInfoService.selectClientInfoAll();
	}
	
}
