/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.sys.entity;

import org.hibernate.validator.constraints.Length;
import com.thinkgem.jeesite.modules.sys.entity.User;
import java.util.List;
import com.google.common.collect.Lists;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 接口管理白名单Entity
 * @author 吴文豪
 * @version 2016-04-21
 */
public class SysInterfaceWhitelist extends DataEntity<SysInterfaceWhitelist> {
	
	private static final long serialVersionUID = 1L;
	private String hosts;		// 允许通过的主机IP或地址
	private User user;		// 归属用户
	private String authway;		// 认证方式
	private List<SysInterface> sysInterfaceList = Lists.newArrayList();		// 子表列表
	
	public SysInterfaceWhitelist() {
		super();
	}

	public SysInterfaceWhitelist(String id){
		super(id);
	}

	@Length(min=0, max=255, message="允许通过的主机IP或地址长度必须介于 0 和 255 之间")
	public String getHosts() {
		return hosts;
	}

	public void setHosts(String hosts) {
		this.hosts = hosts;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	@Length(min=0, max=255, message="认证方式长度必须介于 0 和 255 之间")
	public String getAuthway() {
		return authway;
	}

	public void setAuthway(String authway) {
		this.authway = authway;
	}
	
	public List<SysInterface> getSysInterfaceList() {
		return sysInterfaceList;
	}

	public void setSysInterfaceList(List<SysInterface> sysInterfaceList) {
		this.sysInterfaceList = sysInterfaceList;
	}
}