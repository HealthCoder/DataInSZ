package com.executor.dao.login.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
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
	public boolean checkUser(User user) {
		List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from user where username = '"
				+ user.getName() + "'and password = '" + user.getPassword() + "';");
		return !list.isEmpty();
	}

}
