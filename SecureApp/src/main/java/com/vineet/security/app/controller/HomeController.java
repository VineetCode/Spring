package com.vineet.security.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String getName() {
	 return "home.jsp";	
	}

}//end of HomeController.java
