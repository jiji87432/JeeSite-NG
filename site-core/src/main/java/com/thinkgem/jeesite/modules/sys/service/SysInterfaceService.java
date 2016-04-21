/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.sys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.common.utils.StringUtils;
import com.thinkgem.jeesite.modules.sys.entity.SysInterface;
import com.thinkgem.jeesite.modules.sys.dao.SysInterfaceDao;

/**
 * 接口列表Service
 * @author 吴文豪
 * @version 2016-04-21
 */
@Service
@Transactional(readOnly = true)
public class SysInterfaceService extends CrudService<SysInterfaceDao, SysInterface> {

	
	public SysInterface get(String id) {
		SysInterface sysInterface = super.get(id);
		return sysInterface;
	}
	
	public List<SysInterface> findList(SysInterface sysInterface) {
		return super.findList(sysInterface);
	}
	
	public Page<SysInterface> findPage(Page<SysInterface> page, SysInterface sysInterface) {
		return super.findPage(page, sysInterface);
	}
	
	@Transactional(readOnly = false)
	public void save(SysInterface sysInterface) {
		super.save(sysInterface);
	}
	
	@Transactional(readOnly = false)
	public void delete(SysInterface sysInterface) {
		super.delete(sysInterface);
	}
	
}