package com.spring.db;

import com.spring.bean.User;

public class MyStaticDB {
	public static User getUser(String emailAddress) {
		System.out.println("Inside DAO");
		if(emailAddress.equals("abc@xyz.com")) {
			return new User(emailAddress, "123");
		}
		return null;
	}
}
