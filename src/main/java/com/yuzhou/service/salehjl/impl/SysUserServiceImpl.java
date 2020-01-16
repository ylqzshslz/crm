package com.yuzhou.service.salehjl.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuzhou.entity.SysUser;
import com.yuzhou.mapper.salehjl.SysUserMapper;
import com.yuzhou.service.salehjl.SysUserService;

@Service
public class SysUserServiceImpl implements SysUserService {
	@Autowired
	private SysUserMapper sysUserMapper;

//	登录功能，按用户名查询SysUser表
	@Override
	public SysUser selectSysUserByUserName(SysUser sysUser) {
		return sysUserMapper.selectSysUserByUserName(sysUser);
	}
//	按用UserRoleId(用户权限管理)查询所用用户
	@Override
	public List<SysUser> selectSysUserByUserRoleId(SysUser sysUser) {
		return sysUserMapper.selectSysUserByUserRoleId(sysUser);
	}
//	按用户名修改密码
	@Override
	public int updateSysUserByUserName(SysUser sysUser) {
		return sysUserMapper.updateSysUserByUserName(sysUser);
	}
//	按用户名编号查询用户
	@Override
	public SysUser selectSysUserByUserId(SysUser sysUser) {
		return sysUserMapper.selectSysUserByUserId(sysUser);
	}
	
	
	

	@Override
	public List<SysUser> selectSysUserAll() {
		return sysUserMapper.selectSysUserAll();
	}

	@Override
	public List<SysUser> selectSysUser() {
		return sysUserMapper.selectSysUser();
	}

	@Override
	public int insertSysUser(SysUser sysUser) {
		return sysUserMapper.insertSysUser(sysUser);
	}

	@Override
	public int deleteSysUser(SysUser sysUser) {
		return sysUserMapper.deleteSysUser(sysUser);
	}

	@Override
	public int updateSysUser(SysUser sysUser) {
		return sysUserMapper.updateSysUser(sysUser);
	}

	@Override
	public SysUser selectSysUserById(SysUser sysUser) {
		return sysUserMapper.selectSysUserById(sysUser);
	}

	@Override
	public int selectSysUserCount() {
		return sysUserMapper.selectSysUserCount();
	}

	@Override
	public List<SysUser> selectSysUserPaging(SysUser sysUser) {
		return sysUserMapper.selectSysUserPaging(sysUser);
	}

	@Override
	public int deleteSysUserBatch(int[] userIdArr) {
		return sysUserMapper.deleteSysUserBatch(userIdArr);
	}
	

	

	
}
