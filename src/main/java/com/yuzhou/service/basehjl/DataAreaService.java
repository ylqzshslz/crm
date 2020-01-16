package com.yuzhou.service.basehjl;

import java.util.List;

import com.yuzhou.entity.DataArea;



public interface DataAreaService {
	public List<DataArea> selectDataAreaAll();
	public DataArea selectDataAreaById(DataArea dataArea);
	public int insertDataArea(DataArea dataArea);
	public int deleteDataArea(DataArea dataArea);
	public int updateDataArea(DataArea dataArea);
	public int deleteDataAreaBatch(int[] daIdArr);
	
}
