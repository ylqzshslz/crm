package com.yuzhou.service.salehjl;

import java.util.List;

import com.yuzhou.entity.SysUser;

public interface SysUserService {
//	登录功能，按用户名查询SysUser表
	public SysUser selectSysUserByUserName(SysUser sysUser);
//	按用UserRoleId(用户权限管理)查询所用用户
	public List<SysUser> selectSysUserByUserRoleId(SysUser sysUser);
//	按用户名修改密码
	public int updateSysUserByUserName(SysUser sysUser);
//	按用户名编号查询用户
	public SysUser selectSysUserByUserId(SysUser sysUser);
	
	
	public List<SysUser> selectSysUserAll();

	public SysUser selectSysUserById(SysUser sysUser);

	public List<SysUser> selectSysUser();

	public int insertSysUser(SysUser sysUser);

	public int deleteSysUser(SysUser sysUser);

	public int updateSysUser(SysUser sysUser);

	public int selectSysUserCount();

	public List<SysUser> selectSysUserPaging(SysUser sysUser);

	public int deleteSysUserBatch(int[] userIdArr);

}
