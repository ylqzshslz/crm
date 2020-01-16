package com.yuzhou.service.serverhjl.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.yuzhou.entity.ClientInfo;
import com.yuzhou.mapper.serverhjl.ClientInfoMapper;
import com.yuzhou.service.serverhjl.ClientInfoService;

@Service("serverClientInfoService")
public class ClientInfoServiceImpl implements ClientInfoService {

	@Autowired
	@Qualifier("serverClientInfoMapper")
	private ClientInfoMapper clientInfoMapper;
	
	@Override
	public List<ClientInfo> selectClientInfoAll() {
		return clientInfoMapper.selectClientInfoAll();
	}

}
