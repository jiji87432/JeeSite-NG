/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.sys.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.sys.entity.SysInterfaceWhitelist;
import com.thinkgem.jeesite.modules.sys.dao.SysInterfaceWhitelistDao;

/**
 * 接口管理白名单Service
 * @author 吴文豪
 * @version 2016-04-21
 */
@Service
@Transactional(readOnly = true)
public class SysInterfaceWhitelistService extends CrudService<SysInterfaceWhitelistDao, SysInterfaceWhitelist> {

	public SysInterfaceWhitelist get(String id) {
		return super.get(id);
	}
	
	public List<SysInterfaceWhitelist> findList(SysInterfaceWhitelist sysInterfaceWhitelist) {
		return super.findList(sysInterfaceWhitelist);
	}
	
	public Page<SysInterfaceWhitelist> findPage(Page<SysInterfaceWhitelist> page, SysInterfaceWhitelist sysInterfaceWhitelist) {
		return super.findPage(page, sysInterfaceWhitelist);
	}
	
	@Transactional(readOnly = false)
	public void save(SysInterfaceWhitelist sysInterfaceWhitelist) {
		super.save(sysInterfaceWhitelist);
	}
	
	@Transactional(readOnly = false)
	public void delete(SysInterfaceWhitelist sysInterfaceWhitelist) {
		super.delete(sysInterfaceWhitelist);
	}
	
}