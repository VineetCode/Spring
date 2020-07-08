package com.imnzu.tech.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.imnzu.tech.app.model.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO
{
	Session session=null;
	Transaction tx=null;
	
	@Autowired
	private SessionFactory sessionfactory;
	
	@Override
	public boolean addEmployee(Employee employee) {
		boolean flag=false;
		Integer i=0;
		
		try {
			session=sessionfactory.openSession();
			tx=session.beginTransaction();
			i=(Integer)session.save(employee);
			System.out.println("Employee is created with Id ::" + i);
			tx.commit();
		}
		catch (Exception e) {
			tx.rollback();
		}
		if (i != 0)
			flag = true;
		return false;
	}

	@Override
	public List<Employee> getAllEmployee() {

		session = sessionfactory.openSession();
		tx = session.beginTransaction();
		System.out.println("Before ");
		List<Employee> list = session.createQuery("from Employee").list();
		System.out.println("After");
		return list;
	}
	

}
