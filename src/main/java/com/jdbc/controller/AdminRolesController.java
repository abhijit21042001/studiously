package com.jdbc.controller;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jdbc.dao.AdminrolesDao;
import com.jdbc.model.Adminroles;

@Controller
public class AdminRolesController {

	@Autowired
	private AdminrolesDao adminrolesDao;

	@RequestMapping(value = "/add_admin_role")
	public ModelAndView creatAdminroleform(@ModelAttribute("adminroles") Adminroles adminroles, ModelAndView mv) {
		mv.setViewName("add-roles");
		return mv;
	}
	@RequestMapping(value = "handle-adminroles")
	public ModelAndView creatAdminrole(@ModelAttribute Adminroles adminroles, ModelAndView mv) {
		int counter = adminrolesDao.createAdminroles(adminroles);
		mv.addObject("msg", counter > 0 ? "Adminrole created" : "Error");
		mv.setViewName("add-roles");
		return mv;
	}


	@RequestMapping(value = "/admin_roles_list")
	public ModelAndView adminrole(Model m) {
		List<Adminroles> adminroles = adminrolesDao.readAdminroles();
		m.addAttribute("adminroles", adminroles);
		return new ModelAndView("admin_roles_list");
	}
	
//update function is only declare but actually still not use 	
	@RequestMapping(value="/update_admin_roles/{admin_role_id}")
	public ModelAndView findAdminRolesById(ModelAndView model,@PathVariable("admin_role_id") int admin_role_id )
	throws IOException{
		
		List<Adminroles> adminroles=adminrolesDao.findAdminrolesById(admin_role_id);
		model.addObject("adminroles", adminroles);
		model.setViewName("update_admin_roles");
		return model;
	}
	@RequestMapping(value="/update_admin_roles", method=RequestMethod.POST)
	public ModelAndView updateAdminroles(@RequestParam("admin_role_id")int admin_role_id,
	@RequestParam("role_id") String role_id ,@RequestParam("update_by")String update_by,
	@RequestParam("update_timestamp")Timestamp update_timestamp,@RequestParam("admin_id")int admin_id,
	@RequestParam("is_active")Boolean is_active, @RequestParam("is_fullright")Boolean is_fullright,ModelAndView m) 
	{
		Adminroles adminroles=new Adminroles();
		Timestamp updateTimestamp = new Timestamp(System.currentTimeMillis());
		
		adminroles.setAdmin_role_id(admin_role_id);
		adminroles.setRole_id(role_id);
		adminroles.setUpdate_by(update_by);
		adminroles.setUpdate_timestamp(updateTimestamp);
		adminroles.setAdmin_id(admin_id);
		adminroles.setIs_active(is_active);
		adminroles.setIs_fullright(is_fullright);
		
		int counter=adminrolesDao.updateAdminroles(adminroles);
		if (counter>0) {
			m.addObject("msg","record update"+adminroles.getAdmin_role_id());
		}else {
			m.addObject("msg","errore check consol");
		}
		m.setViewName("update_admin_roles")	;	
		return m;
	}
	
	
//	this delete controller for the update menu's Assign role deletion
	@RequestMapping(value = "/delete-adminroles/{admin_role_id}")
	public ModelAndView deleteAdminRoleById(ModelAndView mv, @PathVariable("admin_role_id") int admin_role_id)
			throws IOException {

		int counter = adminrolesDao.deleteAdmin_users(admin_role_id);

		if (counter > 0) {
			mv.addObject("msg", "----------> AdminRole deleted against Admin_role_id --> " + admin_role_id);
		} else {
			mv.addObject("msg", "Error- check the console log.");
		}

		mv.setViewName("update_admin_user");

		return mv;
	}
	
	
}
