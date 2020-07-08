package com.infotech.person.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.infotech.person.entity.Person;

public interface PersonManagementDAO  extends CrudRepository<Person,Integer>{
	
    List<Person> getPersonInfoByLastName(String lastName);
    
    List<Person> getPersonInfoByEmailAndFirstName(String email,String firstName);
}
