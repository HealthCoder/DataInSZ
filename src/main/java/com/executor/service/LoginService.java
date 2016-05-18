package com.executor.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.executor.dao.ILoginDao;
import com.executor.model.User;

@Controller
public class LoginService implements ILoginService {

	@Resource
	ILoginDao loginDao;
	
	@Override
	public boolean checkUser(User user) {
		return loginDao.checkUser(user);
	}

	
}
