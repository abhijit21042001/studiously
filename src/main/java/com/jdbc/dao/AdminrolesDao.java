package com.jdbc.dao;

import java.util.List;

import com.jdbc.model.Adminroles;



public interface AdminrolesDao {
	
	public int createAdminroles(Adminroles adminroles );

	public List<Adminroles> readAdminroles();

	public List<Adminroles> findAdminrolesById(int admin_role_id);

	public int updateAdminroles(Adminroles adminroles);

	public int deleteAdmin_users(int admin_role_id);

}
