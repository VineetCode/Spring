package com.nt.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.nt.bean.User;
@Repository
public class UserDAO {
	
	private static List<User> list=null;
	
	static{
		System.out.println("open static block");
		list=new ArrayList<User>();
		list.add(new User("Vineet",30,"vs.cs@gmail.com","India"));
		list.add(new User("Vikash",40,"vk.cs@gmail.com","Pakistain"));
		list.add(new User("Akshay",50,"ak.cs@gmail.com","SriLanka"));
		list.add(new User("Ranjeet",60,"rk.cs@gmail.com","Japan"));
		System.out.println("end static block");
	}//end of static blocks

	
	public List<User> getList(){
		return list;
	}
}//end of DAO class
