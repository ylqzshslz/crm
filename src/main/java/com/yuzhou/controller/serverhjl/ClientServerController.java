package com.yuzhou.controller.serverhjl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yuzhou.entity.ClientServer;
import com.yuzhou.service.serverhjl.ClientServerService;

@RestController("serverClientServerController")
public class ClientServerController {
    
	@Autowired
	@Qualifier("serverClientServerService")
	private ClientServerService clientServerService;
	
	@RequestMapping("/insertClientServer")
	public int insertClientServer(@RequestBody ClientServer clientServer) {
		return clientServerService.insertClientServer(clientServer);
	}
	
	@RequestMapping("/selectClientServerAll")
	public List<ClientServer> selectClientServerAll() {
		return clientServerService.selectClientServerAll();
	}
	
	@RequestMapping("/selectClientServerByTerm")
	public List<ClientServer> selectClientServerByTerm(@RequestBody ClientServer clientServer) {
//		System.out.println("clientServer:"+clientServer);
//		System.out.println("clientServer.getServerTypeId():"+clientServer.getServerTypeId());
//		System.out.println("clientServer.getClientInfo().getClientName():"+clientServer.getClientInfo().getClientName());
//		System.out.println("clientServer.toString():"+clientServer.toString());
		return clientServerService.selectClientServerByTerm(clientServer);
	}
	
	@RequestMapping("/updateClientServerByAllot")
	public int updateClientServerByAllot(@RequestBody ClientServer clientServer) {
		System.out.println("serverID"+clientServer.getServerId());
		return clientServerService.updateClientServerByAllot(clientServer);
	}
	
	@RequestMapping("/deleteClientServer")
	public int deleteClientServer(@RequestBody ClientServer clientServer) {
		return clientServerService.deleteClientServer(clientServer);
	}
    
	@RequestMapping("/selectClientServerCount")
	public int selectClientServerCount() {
		return clientServerService.selectClientServerCount();
	}
	
	@RequestMapping("/selectClientServerAllInfo")
	public ClientServer selectClientServerAllInfo(ClientServer clientServer) {
		return clientServerService.selectClientServerAllInfo(clientServer);
	}
	
//	rept
	@RequestMapping("/selectClientInfoAndClientServerAll")
	public List<ClientServer> selectClientInfoAndClientServerAll() throws Exception{
		return clientServerService.selectClientInfoAndClientServerAll();
	}
}
