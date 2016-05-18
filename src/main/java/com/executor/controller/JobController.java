package com.executor.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.executor.service.IJobService;
import com.executor.service.JobService;

@Controller
public class JobController {
	
//	@Resource
//	HttpServletRequest request;
//	
//	@Resource
//	JdbcTemplate jdbcTemplate;
//	
//	@Resource
//	IJobService jobService;
//	
//	@RequestMapping(value = "/index")
//	public String home(Model model) {
//
//        List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from src");
//        Iterator it = list.iterator();
//        while(it.hasNext()){
//        	Map mapSql = (Map) it.next();
//        	System.out.println("ww key: " + mapSql.keySet());
//        	System.out.println("ww value: " + mapSql.values());
//        }
//
//	    return "/index.jsp";
//	}
//	
//	@RequestMapping(value = "/login", method = RequestMethod.POST)
//	public String job(){
//		String u = request.getParameter("username");
//		String p = request.getParameter("password");
//		System.out.println(u);
//		System.out.println(p);
//		return "true";
//	}
	
}
