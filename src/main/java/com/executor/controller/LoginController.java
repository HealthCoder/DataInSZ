package com.executor.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.executor.model.User;
import com.executor.service.ILoginService;

@Controller
public class LoginController {

	@Resource
	ILoginService loginService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String index(Model model) {
		return "/login.jsp";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String job(@ModelAttribute("user") User user) {
		if (loginService.checkUser(user)) {
			return "/index.jsp";
		}
		return "/login.jsp";
	}
}
