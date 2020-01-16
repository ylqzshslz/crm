package com.yuzhou.mapper.basehjl;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.yuzhou.entity.DataClientLevel;



@Mapper
public interface DataClientLevelMapper {
	
	@Select("select * from DataClientLevel where dclId=#{dclId}")
	public DataClientLevel selectDataClientLevelById(DataClientLevel dataClientlevel);
	
	@Select("select * from DataClientLevel order by dclId")
	public List<DataClientLevel> selectDataClientLevelAll();

	@Insert("insert into DataClientLevel values(null,#{dclName})")
	public int insertDataClientLevel(DataClientLevel dataClientLevel);

	@Delete("delete from DataClientLevel where dclId=#{dclId}")
	public int deleteDataClientLevel(DataClientLevel dataClientLevel);

	@Update("update DataClientLevel set dclName=#{dclName} where dclId=#{dclId}")
	public int updateDataClientLevel(DataClientLevel dataClientLevel);
	
	public int deleteDataClientLevelBatch(int[] dclIdArr);
	
	//rept
	public List<DataClientLevel> selectClientInfoAndDataClientLevelAll();
}
