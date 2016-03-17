package com.spring.bean;

import org.springframework.stereotype.Component;

@Component
public class User {
	private String emailAddress;
	private String password;
	
	public User() {
		
	}
	
	public User(String emailAddress, String password) {
		this.emailAddress = emailAddress;
		this.password = password;
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	
}
