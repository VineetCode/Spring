package com.imnzu.tech.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.imnzu.tech.app.model.Employee;
import com.imnzu.tech.app.service.EmployeeService;


@RestController
@RequestMapping(value="/employee")
public class EmployeeController 
{
	@Autowired 
	private EmployeeService employeeservice;
	
	@PostMapping(value="/addEmployee")
	
	@ResponseBody
	public ResponseEntity<String> addEmployee(@RequestBody Employee employee) {
	   	boolean flag=employeeservice.addEmployee(employee);
	   	
	   	if (flag == false) {
			return new ResponseEntity<String>("This Employee already exists", HttpStatus.CONFLICT);
		}
	   	HttpHeaders httpHeaders = new HttpHeaders();
		return new ResponseEntity<String>(httpHeaders, HttpStatus.CREATED);
	  
	}
 	
   	@GetMapping(value="/getAllEmployee")
   	public ResponseEntity<List<Employee>> getAllEmployees( ){		
		List<Employee> employeeList=employeeservice.getAllEmployees();
		return new ResponseEntity<List<Employee>>(employeeList, HttpStatus.OK);
	
   	}

}
