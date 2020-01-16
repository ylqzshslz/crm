package com.yuzhou.service.serverhjl.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.yuzhou.entity.ClientInfo;
import com.yuzhou.entity.ClientServer;
import com.yuzhou.mapper.serverhjl.ClientServerMapper;
import com.yuzhou.service.serverhjl.ClientServerService;

@Service("serverClientServerService")
public class ClientServerServiceImpl implements ClientServerService {
    
	@Autowired
	@Qualifier("serverClientServerMapper")
	private ClientServerMapper clientServerMapper;

	@Override
	public int insertClientServer(ClientServer clientServer) {
		return clientServerMapper.insertClientServer(clientServer);
	}
	
	@Override
	public List<ClientServer> selectClientServerAll() {
		return clientServerMapper.selectClientServerAll();
	}
	
	@Override
	public List<ClientServer> selectClientServerByTerm(ClientServer clientServer) {
		return clientServerMapper.selectClientServerByTerm(clientServer);
	}

	@Override
	public int updateClientServerByAllot(ClientServer clientServer) {
		return clientServerMapper.updateClientServerByAllot(clientServer);
	}

	@Override
	public int deleteClientServer(ClientServer clientServer) {
		return clientServerMapper.deleteClientServer(clientServer);
	}

	@Override
	public int selectClientServerCount() {
		return clientServerMapper.selectClientServerCount();
	}

	@Override
	public ClientServer selectClientServerAllInfo(ClientServer clientServer) {
		return clientServerMapper.selectClientServerAllInfo(clientServer);
	}

//  rept
	@Override
	public List<ClientServer> selectClientInfoAndClientServerAll() {
		return clientServerMapper.selectClientInfoAndClientServerAll();
	}
}
