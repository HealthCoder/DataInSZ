package com.executor.dao;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;

import com.executor.model.User;

@Controller
public class LoginDao implements ILoginDao {

	@Resource
	JdbcTemplate jdbcTemplate;

	@Override
	public boolean checkUser(User user) {
		List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from user where username = '"
				+ user.getName() + "'and password = '" + user.getPassword() + "';");
		return !list.isEmpty();
	}

}
