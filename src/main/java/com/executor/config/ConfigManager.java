package com.executor.config;

import java.io.IOException;
import java.util.Properties;

import org.springframework.core.io.support.PropertiesLoaderUtils;

public class ConfigManager {
	
	private static final ConfigManager instance = new ConfigManager();
	
	private static Properties props = new Properties();
	
	private ConfigManager(){
		try {
			props = PropertiesLoaderUtils.loadAllProperties("config.properties");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public ConfigManager getInstance(){
		return instance;
	}
	
	public String getProperty(String key){
		return props.getProperty(key);
	}
	
}
