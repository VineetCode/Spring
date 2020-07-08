package com.intnzu.tech.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intnzu.tech.app.dao.EmployeeDAO;
import com.intnzu.tech.app.model.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeDAO employeeDAO;

	public boolean addEmployee(Employee employee) {
		boolean flag=employeeDAO.addEmployee(employee);
		return flag;
	}

	

	public List<Employee> getAllEmployees() {
		
		return employeeDAO.getAllEmployee();
	}

	
	
	
}
