package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bean.User;
import com.nt.dao.UserDao;

@Service
public class UserService {
	
    @Autowired
	public UserDao dao;
	
	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	public List<User> getAllList() {
   		 return dao.getList();
	}

	public void createUser(User user) {
        dao.createUser(user);		
	}

}
