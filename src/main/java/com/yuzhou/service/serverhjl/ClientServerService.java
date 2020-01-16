package com.yuzhou.service.serverhjl;

import java.util.List;

import com.yuzhou.entity.ClientInfo;
import com.yuzhou.entity.ClientServer;

public interface ClientServerService {
    
	public int insertClientServer(ClientServer clientServer);
	
	public List<ClientServer> selectClientServerAll();
	
	public List<ClientServer> selectClientServerByTerm(ClientServer clientServer);
	
	public int updateClientServerByAllot(ClientServer clientServer);
	
	public int deleteClientServer(ClientServer clientServer);
	
	public int selectClientServerCount();
	
	public ClientServer selectClientServerAllInfo(ClientServer clientServer);
	
//	rept
	public List<ClientServer> selectClientInfoAndClientServerAll();
	
}
