package com.webdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.webdemo.accessingdatamysql.User;
import com.webdemo.accessingdatamysql.UserRepository;


@RestController
public class LoginAPI {
	@Autowired
	private UserRepository userRepository;
	
	// insert
	@PostMapping("/api/login")
	public User login(@RequestBody User userDetails) {
		System.out.println("Called the method login in Login API");
		userRepository.save(userDetails);
		
		return userDetails;
	}
	
	// select
	// delete
	// update

}