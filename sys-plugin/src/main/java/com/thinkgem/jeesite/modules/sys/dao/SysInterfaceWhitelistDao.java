/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.sys.dao;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.sys.entity.SysInterfaceWhitelist;

/**
 * 接口管理白名单DAO接口
 * @author 吴文豪
 * @version 2016-04-21
 */
@MyBatisDao
public interface SysInterfaceWhitelistDao extends CrudDao<SysInterfaceWhitelist> {
	
}