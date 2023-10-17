package com.jdbc.dao;

import java.util.List;

import com.jdbc.model.Admin_users;


public interface Admin_usersDao {
	
//	public void createAdmin_users(Admin_users admin_users);

	public List<Admin_users> readAdmin_users();

	public List<Admin_users> findAdmin_usersById(int admin_id);

	public int updateAdmin_users(Admin_users student);

	public int deleteAdmin_users(int admin_id);
//	remaining the functionality of delete admin_users

	public int createAdmin_usersNew(Admin_users admin_users);
}
