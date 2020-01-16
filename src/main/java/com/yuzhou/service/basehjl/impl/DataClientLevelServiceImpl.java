package com.yuzhou.service.basehjl.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuzhou.entity.DataClientLevel;
import com.yuzhou.mapper.basehjl.DataClientLevelMapper;
import com.yuzhou.service.basehjl.DataClientLevelService;



@Service
public class DataClientLevelServiceImpl implements DataClientLevelService{
	
	@Autowired
	private DataClientLevelMapper dataClientLevelMapper;

	@Override
	public List<DataClientLevel> selectDataClientLevelAll() {
		return dataClientLevelMapper.selectDataClientLevelAll();
	}

	@Override
	public int insertDataClientLevel(DataClientLevel dataClientLevel) {
		return dataClientLevelMapper.insertDataClientLevel(dataClientLevel);
	}

	@Override
	public int deleteDataClientLevel(DataClientLevel dataClientLevel) {
		return dataClientLevelMapper.deleteDataClientLevel(dataClientLevel);
	}

	@Override
	public int updateDataClientLevel(DataClientLevel dataClientLevel) {
		return dataClientLevelMapper.updateDataClientLevel(dataClientLevel);
	}
	
	@Override
	public int deleteDataClientLevelBatch(int[] dclIdArr) {
		return dataClientLevelMapper.deleteDataClientLevelBatch(dclIdArr);
	}
	
	@Override
	public DataClientLevel selectDataClientLevelById(DataClientLevel dataClientlevel) {
		return dataClientLevelMapper.selectDataClientLevelById(dataClientlevel);
	}
	
//	rept
	@Override
	public List<DataClientLevel> selectClientInfoAndDataClientLevelAll() {
		return dataClientLevelMapper.selectClientInfoAndDataClientLevelAll();
	}

}
