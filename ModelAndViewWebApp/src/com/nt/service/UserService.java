package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bean.User;
import com.nt.dao.UserDAO;

@Service
public class UserService {
	
	@Autowired
	private UserDAO userDao;
	
	public List<User> getUserList(){
		System.out.println("Service");
		return userDao.getList();
		
	}//end of getUserList() method

}//end of UserService.class
