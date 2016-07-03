package com.executor.singleInstance;

import java.util.HashMap;
import java.util.Map;

public class SessionManager {

	private static SessionManager instance = new SessionManager();
	
	private final Map<String, String> sessionMap = new HashMap<String, String>(256);
	
	private SessionManager(){}
	
	public SessionManager getInstance(){
		return instance;
	}
	
	
	
}
