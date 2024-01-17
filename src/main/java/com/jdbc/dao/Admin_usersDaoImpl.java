package com.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.jdbc.model.Admin_users;

public class Admin_usersDaoImpl implements Admin_usersDao {
	private JdbcTemplate jdbcTemplate;
	public Admin_usersDaoImpl(DataSource dataSoruce) {
		jdbcTemplate = new JdbcTemplate(dataSoruce);
	}

//	implementation of the createAdminUser Method
	@Override
	public int createAdmin_usersNew(Admin_users admin_users){
		String sql="insert into admin_users(name,user_name,email,mobile_number,passwd,reg_timestamp,update_by ,update_timestamp,account_status_code,email_verification_code,mobile_verification_code, division,department,designation,unit) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		try {

			int counter = jdbcTemplate.update(sql,
					new Object[] {  admin_users.getName(),admin_users.getUser_name(),admin_users.getEmail(),admin_users.getMobile_number(),admin_users.getPasswd(),admin_users.getReg_timestamp(),admin_users.getUpdate_by(),admin_users.getUpdate_timestamp(),admin_users.getAccount_status_code(),admin_users.getEmail_verification_code(),admin_users.getMobile_verification_code(),admin_users.getDivision(),admin_users.getDepartment(),admin_users.getDesignation(),admin_users.getUnit() });

			return counter;

		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	
//	implementation for readAdmin_users from the Admin_usersList 
	@Override
	public List<Admin_users> readAdmin_users() {
		List<Admin_users> admin_usersList = jdbcTemplate.query("SELECT * FROM admin_users",
				new RowMapper<Admin_users>() {

					@Override
					public Admin_users mapRow(ResultSet rs, int rowNum) throws SQLException {

						Admin_users admin_users = new Admin_users();

						admin_users.setAdmin_id(rs.getInt("admin_id"));
						admin_users.setName(rs.getString("name"));
						admin_users.setUser_name(rs.getString("user_name"));
						admin_users.setEmail(rs.getString("email"));
						admin_users.setMobile_number(rs.getString("mobile_number"));
						admin_users.setPasswd(rs.getString("passwd"));
						admin_users.setReg_timestamp(rs.getTimestamp("reg_timestamp"));
						admin_users.setUpdate_by(rs.getString("update_by"));
						admin_users.setUpdate_timestamp(rs.getTimestamp("update_timestamp"));
						admin_users.setAccount_status_code(rs.getString("account_status_code"));
						admin_users.setEmail_verification_code(rs.getString("email_verification_code"));
						admin_users.setMobile_verification_code(rs.getString("mobile_verification_code"));
						admin_users.setDivision(rs.getString("division"));
						admin_users.setDepartment(rs.getString("department"));
						admin_users.setDesignation(rs.getString("designation"));
						admin_users.setUnit(rs.getInt("unit"));

						return admin_users;
					}
				});
		return admin_usersList;
	}


	@Override
	public List<Admin_users> findAdmin_usersById(int admin_id) {
		List<Admin_users> Ladmin_users = jdbcTemplate.query("SELECT * FROM admin_users where admin_id=?",
				new Object[] { admin_id }, new RowMapper<Admin_users>() {
					@Override
					public Admin_users mapRow(ResultSet rs,int rnum) throws SQLException {
						Admin_users admin_users = new Admin_users();
							admin_users.setAdmin_id(rs.getInt("admin_id"));
							admin_users.setName(rs.getString("name"));
							admin_users.setUser_name(rs.getString("user_name"));
							admin_users.setEmail(rs.getString("email"));
							admin_users.setMobile_number(rs.getString("mobile_number"));
							admin_users.setPasswd(rs.getString("passwd"));
							admin_users.setReg_timestamp(rs.getTimestamp("reg_timestamp"));
							admin_users.setUpdate_by(rs.getString("update_by"));
							admin_users.setUpdate_timestamp(rs.getTimestamp("update_timestamp"));
							admin_users.setAccount_status_code(rs.getString("account_status_code"));
							admin_users.setEmail_verification_code(rs.getString("email_verification_code"));
							admin_users.setMobile_verification_code(rs.getString("mobile_verification_code"));
							admin_users.setDivision(rs.getString("division"));
							admin_users.setDepartment(rs.getString("department"));
							admin_users.setDesignation(rs.getString("designation"));
							admin_users.setUnit(rs.getInt("unit"));
						
						return admin_users;
					}
				});
		return Ladmin_users;
	}

	
	@Override
	public int updateAdmin_users(Admin_users admin_users) {
		String sql = "UPDATE  admin_users SET admin_id=?, name=?,user_name=?,email=?,mobile_number=?,passwd=?,"
				+ "reg_timestamp=?,update_by=?,update_timestamp=?,account_status_code=?,email_verification_code=?,"
				+ "mobile_verification_code=?,division=?,department=?,designation=?,unit=? where admin_id=?";
		try {
		int counter=jdbcTemplate.update(sql, new Object[] { 
				admin_users.getAdmin_id(),
				admin_users.getName(), 
				admin_users.getUser_name(),
				admin_users.getEmail(), 
				admin_users.getMobile_number(), 
				admin_users.getPasswd(),
				admin_users.getReg_timestamp(), 
				admin_users.getUpdate_by(), 
				admin_users.getUpdate_timestamp(),
				admin_users.getAccount_status_code(), 
				admin_users.getEmail_verification_code(),
				admin_users.getMobile_verification_code(), 
				admin_users.getDivision(), 
				admin_users.getDepartment(),
				admin_users.getDesignation(), 
				admin_users.getUnit(), 
				admin_users.getAdmin_id() });
		return counter;
		}catch (Exception e) {
		e.printStackTrace();
		return 0;
		}
	}

//	implementation of the Delete AdminUser in the List but not used yet
	@Override
	public int deleteAdmin_users(int admin_id) {
		String sql = "delete from admin_users where admin_id=?";
		try {
			int counter = jdbcTemplate.update(sql, new Object[] { admin_id });
			return counter;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	
	
}

