package com.intnzu.tech.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.intnzu.tech.app.model.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	Session session = null;
	Transaction tx = null;

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean addEmployee(Employee employee) {

		boolean flag = false;
		Integer i1 = 0;

		try {
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			i1 = (Integer) session.save(employee);

			System.out.println("Employee is created with Id ::" + i1);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}
		if (i1 != 0)
			flag = true;

		return flag;
	}

	@Override
	public List<Employee> getAllEmployee() {

		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		System.out.println("Before ");
		List<Employee> list = session.createQuery("from Employee").list();
		System.out.println("After");
		return list;
	}

}
