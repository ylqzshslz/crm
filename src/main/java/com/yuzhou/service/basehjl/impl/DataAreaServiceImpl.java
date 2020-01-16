package com.yuzhou.service.basehjl.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuzhou.entity.DataArea;
import com.yuzhou.mapper.basehjl.DataAreaMapper;
import com.yuzhou.service.basehjl.DataAreaService;



@Service
public class DataAreaServiceImpl implements DataAreaService{

	@Autowired
	private DataAreaMapper dataAreaMapper;
	
	@Override
	public DataArea selectDataAreaById(DataArea dataArea) {
		return dataAreaMapper.selectDataAreaById(dataArea);
	}
	
	@Override
	public List<DataArea> selectDataAreaAll() {
		return dataAreaMapper.selectDataAreaAll();
	}

	@Override
	public int insertDataArea(DataArea dataArea) {
		return dataAreaMapper.insertDataArea(dataArea);
	}

	@Override
	public int deleteDataArea(DataArea dataArea) {
		return dataAreaMapper.deleteDataArea(dataArea);
	}

	@Override
	public int updateDataArea(DataArea dataArea) {
		return dataAreaMapper.updateDataArea(dataArea);
	}

	@Override
	public int deleteDataAreaBatch(int[] daIdArr) {
		return dataAreaMapper.deleteDataAreaBatch(daIdArr);
	}
}
