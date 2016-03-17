package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.bean.User;
import com.spring.service.LoginService;

@RestController
@RequestMapping(value="/loginRest")
public class LoginController {
	@Autowired
	LoginService loginService;
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public ResponseEntity<String> isUserValid(@RequestBody User user) {
		// Call the DB to check if the user login details are correct or not.
		System.out.println("One Controller : " + user.getEmailAddress());
		User userAccount = loginService.getUser(user.getEmailAddress());
		if(userAccount!=null && (userAccount.getEmailAddress().equals(user.getEmailAddress()) && userAccount.getPassword().equals(user.getPassword())))
			return new ResponseEntity<String>("{\"status\":\"Login Success\"}", HttpStatus.OK);
		else
			return new ResponseEntity<String>("{\"status\":\"Login Failed\"}", HttpStatus.BAD_REQUEST);
	}
}
