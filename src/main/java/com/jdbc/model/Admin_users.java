package com.jdbc.model;

import java.sql.Timestamp;

public class Admin_users {
	private int admin_id;
	private String name;
	private String user_name;
	private String email;
	private String mobile_number;
	private String passwd;
	private Timestamp reg_timestamp;
	private String update_by ;
	private Timestamp update_timestamp;
	private String account_status_code;
	private String email_verification_code;
	private String mobile_verification_code;
	private String division;
	private String department;
	private String designation;
	private int unit;
		
		public int getAdmin_id() {
			return admin_id;
		}
		public void setAdmin_id(int admin_id) {
			this.admin_id = admin_id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public String getUser_name() {
			return user_name;
		}
		public void setUser_name(String user_name) {
			this.user_name = user_name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getMobile_number() {
			return mobile_number;
		}
		public void setMobile_number(String mobile_number) {
			this.mobile_number = mobile_number;
		}
		public String getPasswd() {
			return passwd;
		}
		public void setPasswd(String passwd) {
			this.passwd = passwd;
		}
		public Timestamp getReg_timestamp() {
			return reg_timestamp;
		}
		public void setReg_timestamp(Timestamp reg_timestamp) {
			this.reg_timestamp = reg_timestamp;
		}
		public String getUpdate_by() {
			return update_by;
		}
		public void setUpdate_by(String update_by) {
			this.update_by = update_by;
		}
		public Timestamp getUpdate_timestamp() {
			return update_timestamp;
		}
		public void setUpdate_timestamp(Timestamp update_timestamp) {
			this.update_timestamp = update_timestamp;
		}
		public String getAccount_status_code() {
			return account_status_code;
		}
		public void setAccount_status_code(String account_status_code) {
			this.account_status_code = account_status_code;
		}
		public String getEmail_verification_code() {
			return email_verification_code;
		}
		public void setEmail_verification_code(String email_verification_code) {
			this.email_verification_code = email_verification_code;
		}
		public String getMobile_verification_code() {
			return mobile_verification_code;
		}
		public void setMobile_verification_code(String mobile_verification_code) {
			this.mobile_verification_code = mobile_verification_code;
		}
		public String getDivision() {
			return division;
		}
		public void setDivision(String division) {
			this.division = division;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		public String getDesignation() {
			return designation;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}
		public int getUnit() {
			return unit;
		}
		public void setUnit(int unit) {
			this.unit = unit;
		}
		
		/*
		 * public Admin_users(int admin_id, String name, String user_name, String email,
		 * String mobile_number, String passwd, Date reg_timestamp, String update_by,
		 * Date update_timestamp, String account_status_code, String
		 * email_verification_code, String mobile_verification_code, String division,
		 * String department, String designation, int unit) { super();
		 * this.admin_id=admin_id; this.name = name; this.user_name = user_name;
		 * this.email = email; this.mobile_number = mobile_number; this.passwd = passwd;
		 * this.reg_timestamp = reg_timestamp; this.update_by = update_by;
		 * this.update_timestamp = update_timestamp; this.account_status_code =
		 * account_status_code; this.email_verification_code = email_verification_code;
		 * this.mobile_verification_code = mobile_verification_code; this.division =
		 * division; this.department = department; this.designation = designation;
		 * this.unit = unit; }
		 * 
		 * public Admin_users() { super(); // TODO Auto-generated constructor stub }
		 */
		
		@Override
		public String toString() {
			return "Admin_users [admin_id="+ admin_id +", name=" + name + ",  user_name="
					+ user_name + ", email=" + email + ", mobile_number=" + mobile_number + ", passwd=" + passwd
					+ ", reg_timestamp=" + reg_timestamp + ", update_by=" + update_by + ", update_timestamp="
					+ update_timestamp + ", account_status_code=" + account_status_code + ", email_verification_code="
					+ email_verification_code + ", mobile_verification_code=" + mobile_verification_code + ", division="
					+ division + ", department=" + department + ", designation=" + designation + ", unit=" + unit + "]";
		}
		
		
		
		
}
