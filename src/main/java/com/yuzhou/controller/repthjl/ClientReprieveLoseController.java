package com.yuzhou.controller.repthjl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yuzhou.entity.ClientReprieveLose;
import com.yuzhou.service.repthjl.ClientReprieveLoseService;

@RestController
public class ClientReprieveLoseController {
	
	@Autowired
	private ClientReprieveLoseService clientReprieveLoseService;
	
	@RequestMapping("/selectClientReprieveLoseAll")
	public List<ClientReprieveLose> selectClientReprieveLoseAll() throws Exception{
		return clientReprieveLoseService.selectClientReprieveLoseAll();
	}

}
