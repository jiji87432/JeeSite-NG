/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.sys.entity;

import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 接口列表Entity
 * @author 吴文豪
 * @version 2016-04-21
 */
public class SysInterface extends DataEntity<SysInterface> {
	
	private static final long serialVersionUID = 1L;
	private String sysInterfaceId;		// 接口白名单ID
	private String classname;		// 接口类名
	private String functionname;		// 接口函数名
	
	public SysInterface() {
		super();
	}

	public SysInterface(String id){
		super(id);
	}

	@Length(min=0, max=64, message="接口白名单ID长度必须介于 0 和 64 之间")
	public String getSysInterfaceId() {
		return sysInterfaceId;
	}

	public void setSysInterfaceId(String sysInterfaceId) {
		this.sysInterfaceId = sysInterfaceId;
	}
	
	@Length(min=0, max=255, message="接口类名长度必须介于 0 和 255 之间")
	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}
	
	@Length(min=0, max=255, message="接口函数名长度必须介于 0 和 255 之间")
	public String getFunctionname() {
		return functionname;
	}

	public void setFunctionname(String functionname) {
		this.functionname = functionname;
	}
	
}