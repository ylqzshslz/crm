package com.yuzhou.mapper.basehjl;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.yuzhou.entity.DataArea;


@Mapper
public interface DataAreaMapper {
	
	@Select("select * from dataarea where daId=#{daId}")
	public DataArea selectDataAreaById(DataArea dataArea);
	
	@Select("select * from dataarea order by daid")
	public List<DataArea> selectDataAreaAll();
	
	@Insert("insert into dataarea values(null,#{daName})")
	public int insertDataArea(DataArea dataArea);
	
	@Delete("delete from dataarea where daId=#{daId}")
	public int deleteDataArea(DataArea dataArea);
	
	@Update("update dataarea set daName=#{daName} where daId=#{daId}")
	public int updateDataArea(DataArea dataArea);
	
	public int deleteDataAreaBatch(int[] daIdArr);
	
}
