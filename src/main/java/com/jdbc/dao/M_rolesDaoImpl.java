package com.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


import com.jdbc.model.M_roles;



public class M_rolesDaoImpl implements M_rolesDao {

	private JdbcTemplate jdbcTemplate;

	public M_rolesDaoImpl(DataSource datasource) {
		jdbcTemplate = new JdbcTemplate(datasource);
	}

	@Override
	public List<M_roles> readM_roles() {
		List<M_roles> m_rolesList = jdbcTemplate.query("SELECT *FROM m_roles", new RowMapper<M_roles>() {

			@Override
			public M_roles mapRow(ResultSet rs, int rowNum) throws SQLException {
				M_roles m_roles = new M_roles();
				
				Timestamp updateTimestamp = new Timestamp(System.currentTimeMillis());
				m_roles.setRole_id(rs.getString("role_id"));
				m_roles.setRole(rs.getString("role"));
				m_roles.setRole_description(rs.getString("role_description"));
				m_roles.setUpdate_by(rs.getString("update_by"));
				m_roles.setUpdate_timestamp(updateTimestamp);
				
				return m_roles;
			}
		});
		return m_rolesList;
	}

}
