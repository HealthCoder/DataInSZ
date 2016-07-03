package com.executor.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.executor.constants.ConstantsUtil;

@Controller
public class JobController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(){
		return ConstantsUtil.INDEX_JSP;
	}
	
	@RequestMapping(value = "/index2", method = RequestMethod.GET)
	public String index2(){
		return ConstantsUtil.INDEX2_JSP;
	}

}
