package com.yuzhou.mapper.serverhjl;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.yuzhou.entity.ClientInfo;

@Mapper
@Repository("serverClientInfoMapper")
public interface ClientInfoMapper {
    
	@Select("select * from clientInfo order by clientCode")
	public List<ClientInfo> selectClientInfoAll();
	
	
}
