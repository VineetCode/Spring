package com.imnzu.tech.app.dao;

import java.util.List;

import com.imnzu.tech.app.model.Employee;

public interface EmployeeDAO 
{
	public boolean addEmployee(Employee employee);
	public List<Employee> getAllEmployee();
}
