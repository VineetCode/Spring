package com.intnzu.tech.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.intnzu.tech.app.services.EmployeeService;

@SpringBootApplication
public class RegistrationProjectAppApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(RegistrationProjectAppApplication.class, args);
	}
	
	
}
