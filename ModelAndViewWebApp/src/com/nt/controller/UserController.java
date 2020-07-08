package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nt.bean.User;
import com.nt.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/listUsers", method = RequestMethod.GET)
	
	public ModelAndView getListUserDetails() {
		System.out.println("controller");
		ModelAndView modelAndView = new ModelAndView("UserList");
		List<User> userList = userService.getUserList();
		modelAndView.addObject("userLists", userList);
		return modelAndView;
	}

}// end of UserController
