package com.executor.listener;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

@Service
public class ContextListener {

	@PostConstruct
	public void init(){
		startAgent();
	}
	
	public void startAgent(){
		
	}
}
