package com.yuzhou.mapper.salehjl;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.yuzhou.entity.SysUser;

@Mapper
public interface SysUserMapper {
//	登录功能，按用户名查询SysUser表
	public SysUser selectSysUserByUserName(SysUser sysUser);
//	按用UserRoleId(用户权限管理)查询所用用户
	public List<SysUser> selectSysUserByUserRoleId(SysUser sysUser);
//	按用户名修改密码
	public int updateSysUserByUserName(SysUser sysUser);
//	按用户名编号查询用户
	public SysUser selectSysUserByUserId(SysUser sysUser);
	

	@Select("select * from sysuser")
	public List<SysUser> selectSysUserAll();
	
	public List<SysUser> selectSysUser();
	
	@Insert("insert into sysUser (userId,userName,userPassword,userRoleId,daId) values (null,#{userName},123,#{userRoleId},#{daId})")
	public int insertSysUser(SysUser sysUser);

	@Delete("delete from sysUser where userId=#{userId}")
	public int deleteSysUser(SysUser sysUser);

	@Update("update sysUser set userName=#{userName} userRoleId=#{userRoleId} daId=#{daId} where userId=#{userId}")
	public int updateSysUser(SysUser sysUser);

	@Select("select * from sysUser where userId=#{userId}")
	public SysUser selectSysUserById(SysUser sysUser);

	public int selectSysUserCount();

	public List<SysUser> selectSysUserPaging(SysUser sysUser);

	public int deleteSysUserBatch(int[] userIdArr);

	// 分页
	public int selectSysuserCount(SysUser sysUser);

	public List<SysUser> selectSysuserPaging(SysUser sysUser);
}
