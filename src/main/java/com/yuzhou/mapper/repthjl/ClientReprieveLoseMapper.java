package com.yuzhou.mapper.repthjl;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.yuzhou.entity.ClientReprieveLose;

@Mapper
public interface ClientReprieveLoseMapper {
	
	public List<ClientReprieveLose> selectClientReprieveLoseAll();

}
