package com.yuzhou.controller.salehjl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yuzhou.entity.SysUser;
import com.yuzhou.service.salehjl.SysUserService;

@RestController
public class SysUserController {
	@Autowired
	private SysUserService sysUserService; 
	
//	登录功能，按用户名查询SysUser表
	@RequestMapping("/selectSysUserByUserName")
	public SysUser selectSysUserByUserName(@RequestBody SysUser sysUser) {
		return sysUserService.selectSysUserByUserName(sysUser);
	}
//	按用UserRoleId(户权限管理)查询所用用户
	@RequestMapping("/selectSysUserByUserRoleId")
	public List<SysUser> selectSysUserByUserRoleId(@RequestBody SysUser sysUser)throws Exception {
		return sysUserService.selectSysUserByUserRoleId(sysUser);
	}
//	按用户名修改密码
	@RequestMapping("/updateSysUserByUserName")
	public int updateSysUserByUserName(@RequestBody SysUser sysUser)throws Exception {
		return sysUserService.updateSysUserByUserName(sysUser);
	}
//	按用户名编号查询用户
	@RequestMapping("/selectSysUserByUserId")
	public SysUser selectSysUserByUserId(@RequestBody SysUser sysUser)throws Exception {
		return sysUserService.selectSysUserByUserId(sysUser);
	}
	
	
	
	
	@RequestMapping("/selectSysUserAll")
	public List<SysUser> selectSysUserAll() throws Exception {
		return sysUserService.selectSysUserAll();
	}
	
	@RequestMapping("/selectSysUser")
	public List<SysUser> selectSysUser() throws Exception{
		return sysUserService.selectSysUser();
	}
	
	@RequestMapping("/insertSysUser")
	public int insertSysUser(@RequestBody SysUser sysUser) throws Exception{
		return sysUserService.insertSysUser(sysUser);
	}
	
	@RequestMapping("/deleteSysUser")
	public int deleteSysUser(@RequestBody SysUser sysUser) throws Exception{
		return sysUserService.deleteSysUser(sysUser);
	}
	
	@RequestMapping("/selectSysUserById")
	public SysUser selectSysUserById(@RequestBody SysUser sysUser) throws Exception{
		return sysUserService.selectSysUserById(sysUser);
	}
	
	@RequestMapping("/updateSysUser")
	public int updateSysUser(@RequestBody SysUser sysUser) throws Exception{
		return sysUserService.updateSysUser(sysUser);
	}
	
	@RequestMapping("/selectSysUserCount")
	public int selectSysUserCount() throws Exception {
		return sysUserService.selectSysUserCount();
	}
	
	@RequestMapping("/selectSysUserPaging")
	public List<SysUser> selectSysUserPaging(@RequestBody SysUser sysUser) throws Exception {
		return sysUserService.selectSysUserPaging(sysUser);
	}
	
	@RequestMapping("/deleteSysUserBatch")
	public int deleteSysUserBatch(@RequestBody int[] userIdArr) throws Exception {
		return sysUserService.deleteSysUserBatch(userIdArr);
	}


}
