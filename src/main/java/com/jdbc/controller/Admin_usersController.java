package com.jdbc.controller;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.jdbc.dao.Admin_usersDao;
import com.jdbc.dao.AdminrolesDao;
import com.jdbc.model.Admin_users;
import com.jdbc.model.Adminroles;

@Controller
public class Admin_usersController {

	@Autowired
	private Admin_usersDao admin_usersDao;
	
	@Autowired
	private AdminrolesDao adminrolesDao;


	@RequestMapping(value = "/add_admin_users")
	public ModelAndView createAdminform(@ModelAttribute("admin_users")Admin_users admin_users, ModelAndView mv) {
		mv.setViewName("add_admin_users");
		return mv;
	}
	@RequestMapping(value = "/add_admin_usersfinal")
	public ModelAndView createAdmin(@ModelAttribute("admin_users")Admin_users admin_users, ModelAndView mv) {
		int counter=admin_usersDao.createAdmin_usersNew(admin_users);
		
		mv.addObject("msg", counter > 0 ? "Admin_user Created. ":"Error");
		mv.setViewName("add_admin_users");
		return mv;
	}
	
	
	
	@RequestMapping(value = "/admin_users_list")
	public ModelAndView admin_user(Model m) {
		List<Admin_users> admin_users = admin_usersDao.readAdmin_users();
		m.addAttribute("admin_users", admin_users);

		return new ModelAndView("admin_users_list");
	}
	
	
	
	
	
	
//update admin_users function	
	@RequestMapping(value = "/update_admin_user/{admin_id}")
	public ModelAndView findAdmin_usersById(ModelAndView model, @PathVariable("admin_id") int admin_id, Model m)
			throws IOException {
		List<Admin_users> admin_users = admin_usersDao.findAdmin_usersById(admin_id);
		model.addObject("admin_users", admin_users);
		model.addObject("admin_id_new", admin_id);

//below lines is for the Drop-down so we just passed the list to the form

		List<Admin_users> admin_user_Drop = admin_usersDao.readAdmin_users(); 	
		Set<Admin_users> adminUsersSet = new HashSet<>(admin_user_Drop);			
		model.addObject("adminUsersSet", adminUsersSet);
		
		
//below code is for showing the adminRoles assign to the AdminUser having same Admin_id in the update 
		List<Adminroles> adminroles = adminrolesDao.readAdminroles();
		m.addAttribute("adminroles", adminroles);
		
		model.setViewName("update_admin_user");
		return model;
	}
	
	 @RequestMapping(value="/update_admin_user", method=RequestMethod.POST) 
	 public ModelAndView updateAdmin_users (@RequestParam("admin_id") int admin_id,
	  
	  @RequestParam ("name") String name,@RequestParam("user_name") String user_name,
	  @RequestParam("email") String email, @RequestParam("mobile_number") String mobile_number,
	  @RequestParam("passwd") String passwd, @RequestParam ("reg_timestamp") @DateTimeFormat(pattern = "yyyy-MM-dd") Timestamp reg_timestamp,
	  @RequestParam("update_by")String update_by,@RequestParam("update_timestamp")@DateTimeFormat(pattern = "yyyy-MM-dd")Timestamp update_timestamp,
	  @RequestParam("account_status_code")String account_status_code,
	  @RequestParam("email_verification_code")String email_verification_code,@RequestParam("mobile_verification_code")String
	  mobile_verification_code,@RequestParam("division")String division,@RequestParam("department")String
	  department,@RequestParam("designation")String designation,@RequestParam("unit")int unit,
	  ModelAndView m) 
	 {	  
	 Admin_users admin_users=new Admin_users();
	  
		Timestamp updateTimestamp = new Timestamp(System.currentTimeMillis());
	  admin_users.setAdmin_id(admin_id); admin_users.setName(name);
	  admin_users.setUser_name(user_name); admin_users.setEmail(email);
	  admin_users.setMobile_number(mobile_number); admin_users.setPasswd(passwd);
	  admin_users.setReg_timestamp(updateTimestamp);
	  
	  admin_users.setUpdate_by(update_by);
	  admin_users.setUpdate_timestamp(null);
	  admin_users.setAccount_status_code(account_status_code);
	  admin_users.setEmail_verification_code(email_verification_code);
	  admin_users.setMobile_verification_code(mobile_verification_code);
	  admin_users.setDivision(division); admin_users.setDepartment(department);
	  admin_users.setDesignation(designation); admin_users.setUnit(unit);
	  
	  int counter=admin_usersDao.updateAdmin_users(admin_users);
	  
	  if (counter>0) {
		  m.addObject("msg","Records Updated of Admin_id" + 
				  admin_users.getAdmin_id()); 
		  } else 
		  {
			  m.addObject("msg","errore check consol"); 
		  }
	  		 m.setViewName("update_admin_user"); 
	  		 return m; 
	  		 }
	 }
	  
	 


