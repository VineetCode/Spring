package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	public String register(Model model){
		model.addAttribute("user",new User());
		return "register";
	}
	
	@RequestMapping(value="/registerSuccess",method=RequestMethod.POST)
	public String addUser(@ModelAttribute("user") User user){
		 System.out.println("before");
		service.createUser(user);
		System.out.println("After");
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
