package com.example.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.app.dao.PersonManagementDAO;
import com.example.app.entity.Person;

@Service
public class PersonManagementServices {

	@Autowired
	private PersonManagementDAO personManagementDAO;

	
	public List<Person> findByLastName(String lastName, PageRequest pageRequest) {
		return personManagementDAO.findByLastName(lastName,pageRequest);
	}


	public void createPerons(List<Person> person_list) {
       personManagementDAO.save(person_list);		
	}


	
}
