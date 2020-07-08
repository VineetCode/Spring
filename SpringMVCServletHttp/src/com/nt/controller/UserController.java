package com.nt.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nt.bean.User;

@Controller
public class UserController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String registerPage() {
		return "register";

	}// end of registerPage() method

	@RequestMapping(value = "/registerSuccess", method = RequestMethod.POST)
	public ModelAndView registerSucces(HttpServletRequest req, HttpServletResponse res) {

		// Read the form data
		String name = req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));
		String email = req.getParameter("email");
		String country = req.getParameter("country");

		// create User object and set values to them
		User user = new User();
		user.setName(name);
		user.setAge(age);
		user.setEmail(email);
		user.setCountry(country);

		// Create ModelAndView object
		ModelAndView modelAndView = new ModelAndView("registerSuccess");
		modelAndView.addObject("user", user);

		return modelAndView;
	}

	/*
	 * @RequestMapping(value = "/registerSuccess", method = RequestMethod.POST)
	 * public ModelAndView registerSucces(@RequestParam("name") String
	 * name, @RequestParam("age") int age,
	 * 
	 * @RequestParam("email") String email, @RequestParam(value = "country")
	 * String country) {
	 * 
	 * // create User object User user = new User(); user.setName(name);
	 * user.setAge(age); user.setEmail(email); user.setCountry(country);
	 * 
	 * ModelAndView modelAndView = new ModelAndView("registerSuccess");
	 * modelAndView.addObject("user", user);
	 * 
	 * return modelAndView; }
	 */

	/*
	 * @RequestMapping(value = "/registerSuccess", method = RequestMethod.POST)
	 * public ModelAndView registerSucces(@RequestParam Map<String,String> map)
	 * {
	 * 
	 * User user = new User(); user.setName(map.get("name"));
	 * user.setAge(Integer.parseInt(map.get("age")));
	 * user.setEmail(map.get("email")); user.setCountry(map.get("country"));
	 * 
	 * ModelAndView modelAndView = new ModelAndView("registerSuccess");
	 * modelAndView.addObject("user", user);
	 * 
	 * return modelAndView; }
	 * 
	 */

}
