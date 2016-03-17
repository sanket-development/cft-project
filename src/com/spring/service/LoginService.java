package com.spring.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.db.MyStaticDB;
import com.spring.bean.User;

@Service("loginService")
@Transactional
public class LoginService {

	public User getUser(String emailAddress) {
		System.out.println("Validating User : "+emailAddress);
		
		// Here should be the service call to the json based database which will fetch and then return user details
		return MyStaticDB.getUser(emailAddress);
	}
}
