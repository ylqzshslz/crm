package com.yuzhou.mapper.basehjl;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.yuzhou.entity.ClientServer;
import com.yuzhou.entity.DataServerType;



@Mapper
public interface DataServerTypeMapper {
	
	@Select("select * from DataServerType where dstId=#{dstId}")
	public DataServerType selectDataServerTypeById(DataServerType dataServerType);
	
	@Select("select * from DataServerType")
	public List<DataServerType> selectDataServerTypeAll();

	@Insert("insert into DataServerType values(null,#{dstName})")
	public int insertDataServerType(DataServerType dataServerType);

	@Delete("delete from DataServerType where dstId=#{dstId}")
	public int deleteDataServerType(DataServerType dataServerType);

	@Update("update DataServerType set dstName=#{dstName} where dstId=#{dstId}")
	public int updateDataServerType(DataServerType dataServerType);
	
	public int deleteDataServerBatch(int[] dstIdArr);
	
//	rept
	public List<ClientServer> selectDataServerTypeAndClientServerAll();
}
