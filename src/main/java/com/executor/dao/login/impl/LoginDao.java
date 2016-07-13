package com.executor.dao.login.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.executor.dao.login.ILoginDao;
import com.executor.model.User;

@Repository
public class LoginDao implements ILoginDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public boolean checkUser(final User user) {

		String querySql = "select * from user where username = (?) and password = (?)";
		
		List<Map<String, String>> result = jdbcTemplate.query(querySql, new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setObject(1, user.getName());
				ps.setObject(2, user.getPassword());
			}

			}, new RowMapper<Map<String, String>>(){

			@Override
			public Map<String, String> mapRow(ResultSet rs, int rowNum) throws SQLException {
				Map<String, String> map= new HashMap<String, String>();
				map.put("username", rs.getString("username"));
				map.put("password", rs.getString("password"));
				return null;
			}
			
		});
		
		return !result.isEmpty();
	}

}
