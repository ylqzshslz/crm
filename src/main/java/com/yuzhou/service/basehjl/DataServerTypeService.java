package com.yuzhou.service.basehjl;

import java.util.List;

import com.yuzhou.entity.ClientServer;
import com.yuzhou.entity.DataServerType;


public interface DataServerTypeService {
	public DataServerType selectDataServerTypeById(DataServerType dataServerType);
	public List<DataServerType> selectDataServerTypeAll();
	public int insertDataServerType(DataServerType dataServerType);
	public int deleteDataServerType(DataServerType dataServerType);
	public int updateDataServerType(DataServerType dataServerType);
	public int deleteDataServerBatch(int[] dstIdArr);
	
//	rept
	public List<ClientServer> selectDataServerTypeAndClientServerAll();
}
