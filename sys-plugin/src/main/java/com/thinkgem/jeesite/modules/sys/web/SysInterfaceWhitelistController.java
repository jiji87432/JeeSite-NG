/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.sys.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.thinkgem.jeesite.common.config.Global;
import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.web.BaseController;
import com.thinkgem.jeesite.common.utils.StringUtils;
import com.thinkgem.jeesite.modules.sys.entity.SysInterfaceWhitelist;
import com.thinkgem.jeesite.modules.sys.service.SysInterfaceWhitelistService;

/**
 * 接口管理白名单Controller
 * @author 吴文豪
 * @version 2016-04-21
 */
@Controller
@RequestMapping(value = "${adminPath}/sys/sysInterfaceWhitelist")
public class SysInterfaceWhitelistController extends BaseController {

	@Autowired
	private SysInterfaceWhitelistService sysInterfaceWhitelistService;
	
	@ModelAttribute
	public SysInterfaceWhitelist get(@RequestParam(required=false) String id) {
		SysInterfaceWhitelist entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = sysInterfaceWhitelistService.get(id);
		}
		if (entity == null){
			entity = new SysInterfaceWhitelist();
		}
		return entity;
	}
	
	@RequiresPermissions("sys:sysInterfaceWhitelist:view")
	@RequestMapping(value = {"list", ""})
	public String list(SysInterfaceWhitelist sysInterfaceWhitelist, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<SysInterfaceWhitelist> page = sysInterfaceWhitelistService.findPage(new Page<SysInterfaceWhitelist>(request, response), sysInterfaceWhitelist); 
		model.addAttribute("page", page);
		return "modules/sys/sysInterfaceWhitelistList";
	}

	@RequiresPermissions("sys:sysInterfaceWhitelist:view")
	@RequestMapping(value = "form")
	public String form(SysInterfaceWhitelist sysInterfaceWhitelist, Model model) {
		model.addAttribute("sysInterfaceWhitelist", sysInterfaceWhitelist);
		return "modules/sys/sysInterfaceWhitelistForm";
	}

	@RequiresPermissions("sys:sysInterfaceWhitelist:edit")
	@RequestMapping(value = "save")
	public String save(SysInterfaceWhitelist sysInterfaceWhitelist, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, sysInterfaceWhitelist)){
			return form(sysInterfaceWhitelist, model);
		}
		sysInterfaceWhitelistService.save(sysInterfaceWhitelist);
		addMessage(redirectAttributes, "保存接口管理白名单成功");
		return "redirect:"+Global.getAdminPath()+"/sys/sysInterfaceWhitelist/?repage";
	}
	
	@RequiresPermissions("sys:sysInterfaceWhitelist:edit")
	@RequestMapping(value = "delete")
	public String delete(SysInterfaceWhitelist sysInterfaceWhitelist, RedirectAttributes redirectAttributes) {
		sysInterfaceWhitelistService.delete(sysInterfaceWhitelist);
		addMessage(redirectAttributes, "删除接口管理白名单成功");
		return "redirect:"+Global.getAdminPath()+"/sys/sysInterfaceWhitelist/?repage";
	}

}