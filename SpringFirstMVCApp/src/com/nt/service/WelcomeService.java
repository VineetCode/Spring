package com.nt.service;

import org.springframework.stereotype.Service;

@Service
public class WelcomeService {

	
	 public String welcomeMessage(){
		 return  "Welcome to Spring MVC application !!!";
	 }
	 
	 public String welcomeAgainMessage(){
		 return "Welcome to Spring MVC Application Once Again !!!";
	 }
}//end of WelcomeService class
