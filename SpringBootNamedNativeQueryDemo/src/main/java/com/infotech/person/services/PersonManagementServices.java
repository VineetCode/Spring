package com.infotech.person.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotech.person.dao.PersonManagementDAO;
import com.infotech.person.entity.Person;

@Service
public class PersonManagementServices {
	
	@Autowired
	private PersonManagementDAO personManagementDAO;

	public List<Person> getPersonInfoByLastName(String lastName) {
		return personManagementDAO.getPersonInfoByLastName(lastName);
	}

	public List<Person> getPersonInfoByEmailAndFirstName(String email, String firstName) {
		return personManagementDAO.getPersonInfoByEmailAndFirstName(email, firstName);
	}
	

}
