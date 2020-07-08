package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nt.service.WelcomeService;

@Controller
@RequestMapping(value = "/")
public class WelcomeController {

	@Autowired
	public WelcomeService service;

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView welcome() {
		return new ModelAndView("welcomePage", "welcomeMessage", service.welcomeMessage());
	}

	@RequestMapping(value = "/welcomeAgain", method = RequestMethod.GET)
	public ModelAndView welcomeAgain() {
		return new ModelAndView("welcomeAgainPage", "welcomeAgainMessage", service.welcomeAgainMessage());
	}
}//end of WelcomeController class
