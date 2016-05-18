package com.executor.model;

import org.codehaus.jackson.annotate.JsonProperty;

public class User {

	@JsonProperty
	private String name;

	@JsonProperty
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String toString() {
		return "User name : " + name + ", PassWord : " + password;
	}

}
