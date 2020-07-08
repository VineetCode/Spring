package com.nt.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.nt.bean.User;

@Repository
public class UserDao {

	private static List<User> list = null;

	static {
		list = new ArrayList<User>();
		list.add(new User("Vineet", 30, "vs.cs@gmail.com", "India"));
		list.add(new User("Vikash", 40, "vk.cs@gmail.com", "Pakistain"));
		list.add(new User("Akshay", 50, "ak.cs@gmail.com", "SriLanka"));
		list.add(new User("Ranjeet", 60, "rk.cs@gmail.com", "Japan"));

	}// end of static blocks

	public List<User> getList() {
		return list;
	}

	public void createUser(User user) {
		list.add(user);
	}

}
