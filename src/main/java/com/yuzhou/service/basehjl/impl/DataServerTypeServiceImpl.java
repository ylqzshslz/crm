package com.yuzhou.service.basehjl.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuzhou.entity.ClientServer;
import com.yuzhou.entity.DataServerType;
import com.yuzhou.mapper.basehjl.DataServerTypeMapper;
import com.yuzhou.service.basehjl.DataServerTypeService;


@Service
public class DataServerTypeServiceImpl implements DataServerTypeService{
	
	@Autowired
	private DataServerTypeMapper dataServerTypeMapper;

	@Override
	public List<DataServerType> selectDataServerTypeAll() {
		return dataServerTypeMapper.selectDataServerTypeAll();
	}

	@Override
	public int insertDataServerType(DataServerType dataServerType) {
		return dataServerTypeMapper.insertDataServerType(dataServerType);
	}

	@Override
	public int deleteDataServerType(DataServerType dataServerType) {
		return dataServerTypeMapper.deleteDataServerType(dataServerType);
	}

	@Override
	public int updateDataServerType(DataServerType dataServerType) {
		return dataServerTypeMapper.updateDataServerType(dataServerType);
	}
	
	@Override
	public int deleteDataServerBatch(int[] dstIdArr) {
		return dataServerTypeMapper.deleteDataServerBatch(dstIdArr);
	}
	
	@Override
	public DataServerType selectDataServerTypeById(DataServerType dataServerType) {
		return dataServerTypeMapper.selectDataServerTypeById(dataServerType);
	}
	
//	rept
	@Override
	public List<ClientServer> selectDataServerTypeAndClientServerAll() {
		return dataServerTypeMapper.selectDataServerTypeAndClientServerAll();
	}
}
