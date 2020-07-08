package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nt.bean.User;
import com.nt.service.UserService;

@Controller
public class UserController {
    @Autowired
	public UserService service;

	public void setService(UserService service) {
		this.service = service;
	}

	@RequestMapping(value="/",method=RequestMethod.GET)
	public String register(){
		return "register";
	}
	
	@RequestMapping(value="/registerSuccess",method=RequestMethod.POST)
	public String addUser(@RequestParam("name") String name,
			              @RequestParam("age") int age,
			              @RequestParam("email") String email,
			              @RequestParam("country") String country){
		//Create User object
		User user=new User();
		user.setName(name);
		user.setAge(age);
		user.setEmail(email);
		user.setCountry(country);
		
		service.createUser(user);
		
		return "redirect:/listUser";
	}
	@RequestMapping(value="/listUser", method=RequestMethod.GET)
	public ModelAndView getAllUserList(){
		//Create ModelAndView Object
		ModelAndView modelAndView=new ModelAndView("UserList");
		 List<User> user =service.getAllList();
		 modelAndView.addObject("userLists",user);
		 return modelAndView;
	}
	
}
