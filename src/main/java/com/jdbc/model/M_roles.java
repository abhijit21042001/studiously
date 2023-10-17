package com.jdbc.model;

import java.util.Date;

public class M_roles {

	private String	role_id	;
	private String role;
	private String role_description;
	private String update_by;
	private Date  update_timestamp;
	
	
	public String getRole_id() {
		return role_id;
	}
	public void setRole_id(String role_id) {
		this.role_id = role_id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getRole_description() {
		return role_description;
	}
	public void setRole_description(String role_description) {
		this.role_description = role_description;
	}
	public String getUpdate_by() {
		return update_by;
	}
	public void setUpdate_by(String update_by) {
		this.update_by = update_by;
	}
	public Date getUpdate_timestamp() {
		return update_timestamp;
	}
	public void setUpdate_timestamp(Date update_timestamp) {
		this.update_timestamp = update_timestamp;
	}
	public M_roles(String role_id, String role, String role_description, String update_by, Date update_timestamp) {
		super();
		this.role_id = role_id;
		this.role = role;
		this.role_description = role_description;
		this.update_by = update_by;
		this.update_timestamp = update_timestamp;
	}
	public M_roles() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "M_roles [role_id=" + role_id + ", role=" + role + ", role_description=" + role_description
				+ ", update_by=" + update_by + ", update_timestamp=" + update_timestamp + "]";
	}
	
	
}
