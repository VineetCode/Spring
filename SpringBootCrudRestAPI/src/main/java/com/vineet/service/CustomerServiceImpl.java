package com.vineet.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.vineet.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	private static List<Customer> customers = new ArrayList<Customer>();
	static {
		customers.add(new Customer(101, "Vineet", "vineet@gmail.com", "vin_description"));
		customers.add(new Customer(102, "Vikash", "vikash@gmail.com", "vikash_description"));
		customers.add(new Customer(103, "Vipul", "vipul@gmail.com", "vipul_description"));
		customers.add(new Customer(104, "Kalyan", "kalyan@gmail.com", "kalyan_description"));
		customers.add(new Customer(105, "Sumit", "sumit@gmail.com", "sumit_description"));
	}

	@Override
	public List<Customer> getAllCustomer() {
		return customers;
	}

	@Override
	public Customer getCustomerById(int id) {
		for (Customer cust : customers) {
			if (cust.getId() == id)
				return cust;
		}
		return null;
	}

	@Override
	public Customer addCustomer(Customer customer) {
		Random random = new Random();
		int nextId = random.nextInt(1000) + 10;

		customer.setId(nextId);
		customers.add(customer);

		return customer;
	}

	@Override
	public void updateCustomer(Customer customer) {
		for (Customer cust : customers) {
			if (cust.getId() == customer.getId()) {
				cust.setId(customer.getId());
				cust.setName(customer.getName());
				cust.setEmail(customer.getEmail());
				cust.setDescription(customer.getDescription());
			} // end of if-block
		} // end of for-loop
	}// end of updateCustomer(-) method

	@Override
	public void deleteCustomer(int id) {
		for (Customer cust : customers) {
			if (cust.getId() == id) {
				customers.remove(cust);
				break;
			} // end of if-block
		} // end of for-loop

	}// end of deleteCustomer

}// end of CustomerServiceImpl.java
