package com.executor.controller.login;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.executor.constants.ConstantsUtil;
import com.executor.model.User;
import com.executor.service.login.ILoginService;

@Controller
public class LoginController {

	@Autowired
	ILoginService loginService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String index() {
		return ConstantsUtil.LOG_IN_JSP;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String job(@ModelAttribute("user") User user, HttpSession httpSession) {
		if (loginService.checkUser(user)) {
			httpSession.setAttribute(ConstantsUtil.SESSION_LOGIN, ConstantsUtil.SESSION_LOGIN_YES);
			return ConstantsUtil.INDEX_JSP;
		}
		return ConstantsUtil.LOG_IN_JSP;
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession httpSession) {
		httpSession.setAttribute(ConstantsUtil.SESSION_LOGIN, ConstantsUtil.SESSION_LOGIN_NO);
		return ConstantsUtil.LOG_IN_JSP;
	}

}
