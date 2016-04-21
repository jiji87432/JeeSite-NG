/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.sys.entity;

import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 接口管理白名单Entity
 * @author 吴文豪
 * @version 2016-04-21
 */
public class SysInterface extends DataEntity<SysInterface> {
	
	private static final long serialVersionUID = 1L;
	private SysInterfaceWhitelist sysInterfaceId;		// 接口白名单ID 父类
	private String interfaceurl;		// 接口地址
	
	public SysInterface() {
		super();
	}

	public SysInterface(String id){
		super(id);
	}

	public SysInterface(SysInterfaceWhitelist sysInterfaceId){
		this.sysInterfaceId = sysInterfaceId;
	}

	@Length(min=0, max=64, message="接口白名单ID长度必须介于 0 和 64 之间")
	public SysInterfaceWhitelist getSysInterfaceId() {
		return sysInterfaceId;
	}

	public void setSysInterfaceId(SysInterfaceWhitelist sysInterfaceId) {
		this.sysInterfaceId = sysInterfaceId;
	}
	
	@Length(min=0, max=255, message="接口地址长度必须介于 0 和 255 之间")
	public String getInterfaceurl() {
		return interfaceurl;
	}

	public void setInterfaceurl(String interfaceurl) {
		this.interfaceurl = interfaceurl;
	}
	
}