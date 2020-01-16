package com.yuzhou.service.basehjl;

import java.util.List;

import com.yuzhou.entity.DataClientLevel;



public interface DataClientLevelService {
	public DataClientLevel selectDataClientLevelById(DataClientLevel dataClientlevel);
	public List<DataClientLevel> selectDataClientLevelAll();
	public int insertDataClientLevel(DataClientLevel dataClientLevel);
	public int deleteDataClientLevel(DataClientLevel dataClientLevel);
	public int updateDataClientLevel(DataClientLevel dataClientLevel);
	public int deleteDataClientLevelBatch(int[] dclIdArr);
	
//	rept
	public List<DataClientLevel> selectClientInfoAndDataClientLevelAll();
}
