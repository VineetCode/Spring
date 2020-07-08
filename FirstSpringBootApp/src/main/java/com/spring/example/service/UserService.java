package com.spring.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.example.model.User;
import com.spring.example.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> getAllUsers(){
		List<User> userRecords = new ArrayList<>(); 
		repository.findAll().forEach(userRecords::add);
		return userRecords;
	}
	
	public void createUser(User user) {
		repository.save(user);
	}
	

}
