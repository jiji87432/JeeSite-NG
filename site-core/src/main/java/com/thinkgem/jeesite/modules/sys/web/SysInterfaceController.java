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
import com.thinkgem.jeesite.modules.sys.entity.SysInterface;
import com.thinkgem.jeesite.modules.sys.service.SysInterfaceService;

/**
 * 接口列表Controller
 * @author 吴文豪
 * @version 2016-04-21
 */
@Controller
@RequestMapping(value = "${adminPath}/sys/sysInterface")
public class SysInterfaceController extends BaseController {

	@Autowired
	private SysInterfaceService sysInterfaceService;
	
	@ModelAttribute
	public SysInterface get(@RequestParam(required=false) String id) {
		SysInterface entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = sysInterfaceService.get(id);
		}
		if (entity == null){
			entity = new SysInterface();
		}
		return entity;
	}
	
	@RequiresPermissions("sys:sysInterface:view")
	@RequestMapping(value = {"list", ""})
	public String list(SysInterface sysInterface, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<SysInterface> page = sysInterfaceService.findPage(new Page<SysInterface>(request, response), sysInterface); 
		model.addAttribute("page", page);
		return "modules/sys/sysInterfaceList";
	}

	@RequiresPermissions("sys:sysInterface:view")
	@RequestMapping(value = "form")
	public String form(SysInterface sysInterface, Model model) {
		model.addAttribute("sysInterface", sysInterface);
		return "modules/sys/sysInterfaceForm";
	}

	@RequiresPermissions("sys:sysInterface:edit")
	@RequestMapping(value = "save")
	public String save(SysInterface sysInterface, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, sysInterface)){
			return form(sysInterface, model);
		}
		sysInterfaceService.save(sysInterface);
		addMessage(redirectAttributes, "保存接口列表成功");
		return "redirect:"+Global.getAdminPath()+"/sys/sysInterface/?repage";
	}
	
	@RequiresPermissions("sys:sysInterface:edit")
	@RequestMapping(value = "delete")
	public String delete(SysInterface sysInterface, RedirectAttributes redirectAttributes) {
		sysInterfaceService.delete(sysInterface);
		addMessage(redirectAttributes, "删除接口列表成功");
		return "redirect:"+Global.getAdminPath()+"/sys/sysInterface/?repage";
	}

}