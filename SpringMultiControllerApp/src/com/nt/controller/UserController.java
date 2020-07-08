package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nt.bean.User;

@Controller
public class UserController {
	@RequestMapping(value = "/listUser", method = RequestMethod.GET)
	public ModelAndView listUsers() {
		return new ModelAndView("listUser", "listMessage", "List of Users in the Company");
	}

	@RequestMapping(value = "/saveUser", method = RequestMethod.GET)
	public ModelAndView saveUsers(User user) {
		return new ModelAndView("saveUser", "saveMessage", "List of User save in the Message");

	}

	@RequestMapping(value = "/deleteuser", method = RequestMethod.GET)
	public ModelAndView delteUsers(User user) {
		return new ModelAndView("deleteUser", "deleteMessage", "List of deleted User in the List");
	}

}// end of UserController class
