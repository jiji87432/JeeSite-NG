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
import com.thinkgem.jeesite.modules.sys.entity.SysInterfaceWhitelist;
import com.thinkgem.jeesite.modules.sys.dao.SysInterfaceWhitelistDao;
import com.thinkgem.jeesite.modules.sys.entity.SysInterface;
import com.thinkgem.jeesite.modules.sys.dao.SysInterfaceDao;

/**
 * 接口管理白名单Service
 * @author 吴文豪
 * @version 2016-04-21
 */
@Service
@Transactional(readOnly = true)
public class SysInterfaceWhitelistService extends CrudService<SysInterfaceWhitelistDao, SysInterfaceWhitelist> {

	@Autowired
	private SysInterfaceDao sysInterfaceDao;
	
	public SysInterfaceWhitelist get(String id) {
		SysInterfaceWhitelist sysInterfaceWhitelist = super.get(id);
		sysInterfaceWhitelist.setSysInterfaceList(sysInterfaceDao.findList(new SysInterface(sysInterfaceWhitelist)));
		return sysInterfaceWhitelist;
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
		for (SysInterface sysInterface : sysInterfaceWhitelist.getSysInterfaceList()){
			if (sysInterface.getId() == null){
				continue;
			}
			if (SysInterface.DEL_FLAG_NORMAL.equals(sysInterface.getDelFlag())){
				if (StringUtils.isBlank(sysInterface.getId())){
					sysInterface.setSysInterfaceId(sysInterfaceWhitelist);
					sysInterface.preInsert();
					sysInterfaceDao.insert(sysInterface);
				}else{
					sysInterface.preUpdate();
					sysInterfaceDao.update(sysInterface);
				}
			}else{
				sysInterfaceDao.delete(sysInterface);
			}
		}
	}
	
	@Transactional(readOnly = false)
	public void delete(SysInterfaceWhitelist sysInterfaceWhitelist) {
		super.delete(sysInterfaceWhitelist);
		sysInterfaceDao.delete(new SysInterface(sysInterfaceWhitelist));
	}
	
}