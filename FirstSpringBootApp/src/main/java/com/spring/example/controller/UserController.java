package com.spring.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.example.model.User;
import com.spring.example.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService service;
	
	@GetMapping("/all")
	public List<User> getAllUsers(){
		return service.getAllUsers();
	}

	@PostMapping("/users")
	public void createUser(@RequestBody User user) {
	  service.createUser(user);
	}
}
