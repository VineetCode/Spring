package com.vineet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.vineet.model.Customer;
import com.vineet.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	public CustomerService customerService;

	@GetMapping("/getAllCustomer")
	public List<Customer> getAllCustomer() {
		return customerService.getAllCustomer();
	}

	@GetMapping("/{id}")
	public Customer getCustomerById(@PathVariable("id") int id) {
		return customerService.getCustomerById(id);
	}

	@PostMapping("/add")
	public ResponseEntity<Void> addCustomer(@RequestBody Customer customer, UriComponentsBuilder builder) {
		Customer cust = customerService.addCustomer(customer);
		if (cust == null) {
			return ResponseEntity.noContent().build();
		}
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(builder.path("/customer/{id}").buildAndExpand(cust.getId()).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

	@PutMapping("/update")
	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer) {
		Customer customerById = customerService.getCustomerById(customer.getId());
		if (customerById == null) {
			return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		}
		customerService.updateCustomer(customerById);

		return new ResponseEntity<Customer>(customerById, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Customer> deleteCustomerById(@PathVariable("id") int id) {
		Customer c = customerService.getCustomerById(id);
		if (c == null)
			return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);

		customerService.deleteCustomer(id);

		return new ResponseEntity<Customer>(HttpStatus.NO_CONTENT);
	}
}// end of CustomerController class
