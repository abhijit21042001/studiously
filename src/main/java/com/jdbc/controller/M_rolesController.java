package com.jdbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jdbc.dao.M_rolesDao;
import com.jdbc.model.M_roles;

@Controller
public class M_rolesController {

	@Autowired
	private M_rolesDao m_rolesDao;
	
	@RequestMapping("/m_roles-list")
	public ModelAndView readMroles(Model m) {
		
		List<M_roles> m_roles= m_rolesDao.readM_roles();
		m.addAttribute("m_roles",m_roles);
		return new ModelAndView("m_roles-list");
	}
}
