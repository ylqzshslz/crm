package com.yuzhou.service.repthjl.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuzhou.entity.ClientReprieveLose;
import com.yuzhou.mapper.repthjl.ClientReprieveLoseMapper;
import com.yuzhou.service.repthjl.ClientReprieveLoseService;

@Service
public class ClientReprieveLoseServiceImpl implements ClientReprieveLoseService {
	
	@Autowired
	private ClientReprieveLoseMapper clientReprieveLoseMapper;

	@Override
	public List<ClientReprieveLose> selectClientReprieveLoseAll() {
		return clientReprieveLoseMapper.selectClientReprieveLoseAll();
	}

}
