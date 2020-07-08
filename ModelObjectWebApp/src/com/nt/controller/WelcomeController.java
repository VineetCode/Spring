package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {

	/*    Method-1
  =============
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcomePage(Model model) {
		model.addAttribute("welcomeMsg", "Welcome to Spring MVC Application!!!");
		model.addAttribute("welcomeHeader", "Welcome to Header Body in Web Page!!!");
		return "welcomePage";
	} 
	
	Method-2
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcomePage(Map<String,String> map) {
		map.put("welcomeMsg", "Welcome to Spring MVC Application!!!");
		map.put("welcomeHeader", "Welcome to Header Body in Web Page!!!");
		return "welcomePage";
	}
	
	@ModelAttribute
	public void modelData(Model model){
		model.addAttribute("welcomeMsg", "Welcome to Spring MVC Application!!!");
		model.addAttribute("welcomeHeader", "Welcome to Header Body in Web Page!!!");
	}
	
	 */
	
	@RequestMapping(value = "/")
	public String welcomePage(){
		return "welcomePage";
	}
	
	@ModelAttribute
	public void modelData(Map<String,String> map){
		map.put("welcomeMsg", "Welcome to Spring MVC Application!!!");
		map.put("welcomeHeader", "Welcome to Header Body in Web Page!!!");
	}
	
	
	
	
}// end of WelcomeController.class
