package com.example.app.dao;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import com.example.app.entity.Person;

public interface PersonManagementDAO extends CrudRepository<Person, Integer>{

	 List<Person> findByLastName(String lastName, Pageable pageRequest);
	

}
