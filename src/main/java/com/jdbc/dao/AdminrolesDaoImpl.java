package com.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.jdbc.model.Adminroles;

public class AdminrolesDaoImpl implements AdminrolesDao {

	private JdbcTemplate jdbcTemplate;

	public AdminrolesDaoImpl(DataSource datasource) {
		jdbcTemplate = new JdbcTemplate(datasource);
	}

//create methode for Adminroles	
	@Override
	public int createAdminroles(Adminroles adminroles) {
		String sql = "insert into adminroles(role_id,update_by,update_timestamp,admin_id,is_active,is_fullright) values(?,?,?,?,?,?)";
		try {
			int counter = jdbcTemplate.update(sql,
					new Object[] { adminroles.getRole_id(), adminroles.getUpdate_by(), adminroles.getUpdate_timestamp(),
							adminroles.getAdmin_id(), adminroles.isIs_active(), adminroles.isIs_fullright() });

			return counter;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	

//read method for adminroles
	@Override
	public List<Adminroles> readAdminroles() {
		List<Adminroles> adminrolesList = jdbcTemplate.query("SELECT *FROM adminroles", new RowMapper<Adminroles>() {

			@Override
			public Adminroles mapRow(ResultSet rs, int rowNum) throws SQLException {
				Adminroles adminroles = new Adminroles();

				adminroles.setAdmin_role_id(rs.getInt("admin_role_id"));
				adminroles.setRole_id(rs.getString("role_id"));
				adminroles.setUpdate_by(rs.getString("update_by"));
				adminroles.setUpdate_timestamp(rs.getDate("update_timestamp"));
				adminroles.setAdmin_id(rs.getInt("admin_id"));
				adminroles.setIs_active(rs.getBoolean("is_active"));
				adminroles.setIs_fullright(rs.getBoolean("is_fullright"));

				return adminroles;
			}
		});
		return adminrolesList;
	}
	
	

	@Override
	public List<Adminroles> findAdminrolesById(int admin_role_id) {

		List<Adminroles> Ladminroels = jdbcTemplate.query("SELECT * FROM adminroles where admin_role_id=?",
				new Object[] { admin_role_id }, new RowMapper<Adminroles>() {
					@Override
					public Adminroles mapRow(ResultSet rs, int rnum) throws SQLException {
						Adminroles adminroles = new Adminroles();

						adminroles.setAdmin_role_id(rs.getInt("admin_role_id"));
						adminroles.setRole_id(rs.getString("role_id"));
						adminroles.setUpdate_by(rs.getString("update_by"));
						adminroles.setUpdate_timestamp(rs.getDate("update_timestamp"));
						adminroles.setAdmin_id(rs.getInt("admin_id"));
						adminroles.setIs_active(rs.getBoolean("is_active"));
						adminroles.setIs_fullright(rs.getBoolean("is_fullright"));

						return adminroles;

					}
				});
		return Ladminroels;
	}
//*******------************-------**********-----------*********-------------*
// below functions like update is not used yet in the case of adminRoles 	
	@Override
	public int updateAdminroles(Adminroles adminroles) {
		String sql = "update adminroles set admin_role_id=?,role_id=?,update_by=?"
				+ "update_timestamp=?,admin_id=?,is_active=?,is_fullright=? where admin_role_id=?";
		try {
			int counter = jdbcTemplate.update(sql,
					new Object[] { adminroles.getAdmin_role_id(), adminroles.getRole_id(), adminroles.getUpdate_by(),
							adminroles.getUpdate_timestamp(), adminroles.getAdmin_id(), adminroles.isIs_active(),
							adminroles.isIs_fullright() });
			return counter;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
//This implementation is used in the AdinUsers Update AdminUsers	
	@Override
	public int deleteAdmin_users(int admin_role_id) {
		String sql = "delete from adminroles where admin_role_id=?";
		try {
			int counter = jdbcTemplate.update(sql, new Object[] { admin_role_id });
			return counter;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	

}
