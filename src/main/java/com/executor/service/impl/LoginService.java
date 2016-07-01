package com.executor.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.executor.dao.ILoginDao;
import com.executor.model.User;
import com.executor.service.ILoginService;

@Service
public class LoginService implements ILoginService {

	@Autowired
	ILoginDao loginDao;

	@Override
	public boolean checkUser(User user) {
		return loginDao.checkUser(user);
	}

}
