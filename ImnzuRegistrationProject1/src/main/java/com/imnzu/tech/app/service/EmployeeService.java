package com.imnzu.tech.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imnzu.tech.app.dao.EmployeeDAO;
import com.imnzu.tech.app.model.Employee;

@Service
public class EmployeeService 
{
	@Autowired
	private EmployeeDAO employeedao;
	
	public boolean addEmployee(Employee employee)
	{
		boolean flag=employeedao.addEmployee(employee);
		return flag;
		
	}
public List<Employee> getAllEmployees() {
		
		return employeedao.getAllEmployee();
	}
}
