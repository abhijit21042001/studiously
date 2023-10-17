package com.jdbc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.jdbc.dao.StudentDao;
import com.jdbc.model.Student;

@Controller
public class CreateController {

	@Autowired
	private StudentDao studentDao;
	
	/*
	 * @Autowired private Admin_usersDao admin_usersDao;
	 */
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public ModelAndView createStudent(@ModelAttribute("student") Student student, ModelAndView mv) {
	    int counter = studentDao.create(student);

	    mv.addObject("msg", counter > 0 ? "Student registration successful." : "Error- check the console log.");
	    mv.setViewName("create");

	    return mv;
	}
	
	

}