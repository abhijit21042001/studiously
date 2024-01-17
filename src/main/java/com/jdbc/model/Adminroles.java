package com.jdbc.model;


import java.sql.Timestamp;




public class Adminroles {
		private int admin_role_id; 
		private String role_id;
		private String update_by;
		private Timestamp update_timestamp;
		private int admin_id;
		private boolean is_active;
		private boolean is_fullright;
		
		public int getAdmin_role_id() {
			return admin_role_id;
		}
		public void setAdmin_role_id(int admin_role_id) {
			this.admin_role_id = admin_role_id;
		}
		public String getRole_id() {
			return role_id;
		}
		public void setRole_id(String role_id) {
			this.role_id = role_id;
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
		public int getAdmin_id() {
			return admin_id;
		}
		public void setAdmin_id(int admin_id) {
			this.admin_id = admin_id;
		}
		public boolean isIs_active() {
			return is_active;
		}
		public void setIs_active(boolean is_active) {
			this.is_active = is_active;
		}
		public boolean isIs_fullright() {
			return is_fullright;
		}
		public void setIs_fullright(boolean is_fullright) {
			this.is_fullright = is_fullright;
		}
		
		public Adminroles(int admin_role_id, String role_id, String update_by, Timestamp update_timestamp, int admin_id,
				boolean is_active, boolean is_fullright) {
			super();
			this.admin_role_id = admin_role_id;
			this.role_id = role_id;
			this.update_by = update_by;
			this.update_timestamp = update_timestamp;
			this.admin_id = admin_id;
			this.is_active = is_active;
			this.is_fullright = is_fullright;
		}
		
		public Adminroles() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public String toString() {
			return "Adminroles [admin_role_id=" + admin_role_id + ", role_id=" + role_id + ", update_by=" + update_by
					+ ", update_timestamp=" + update_timestamp + ", admin_id=" + admin_id + ", is_active=" + is_active
					+ ", is_fullright=" + is_fullright + "]";
		}
		
		
}
