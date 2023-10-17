package com.jdbc.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.jdbc.dao.Admin_usersDao;
import com.jdbc.dao.Admin_usersDaoImpl;
import com.jdbc.dao.AdminrolesDao;
import com.jdbc.dao.AdminrolesDaoImpl;
import com.jdbc.dao.M_rolesDao;
import com.jdbc.dao.M_rolesDaoImpl;
import com.jdbc.dao.StudentDao;
import com.jdbc.dao.StudentDaoImpl;

@Configuration
@EnableWebMvc
@ComponentScan("com.jdbc")
public class WebMvcConfig {

	@Bean
	InternalResourceViewResolver viewResolver() {

		InternalResourceViewResolver vr = new InternalResourceViewResolver();

		vr.setPrefix("/");
		vr.setSuffix(".jsp");
        

		return vr;
	}

	@Bean
	public DriverManagerDataSource getDataSource() {
	    DriverManagerDataSource ds = new DriverManagerDataSource();
	    ds.setDriverClassName("org.postgresql.Driver"); 
	    ds.setUrl("jdbc:postgresql://localhost:5432/postgres"); 
	    ds.setUsername("postgres"); 
	    ds.setPassword("admin"); 

	    return ds;
	}


	@Bean
	public StudentDao getUserDao() {
		return new StudentDaoImpl(getDataSource());
	}
	
	@Bean
	public Admin_usersDao getAdmin_userDao() {
		return new Admin_usersDaoImpl(getDataSource());
	}
	
	@Bean
	public AdminrolesDao getAdminrolesDao() {
		return new AdminrolesDaoImpl(getDataSource());
	}
	
	@Bean
	public M_rolesDao getM_rolesDao() {
		return new M_rolesDaoImpl(getDataSource());
	}
	
	
	
}