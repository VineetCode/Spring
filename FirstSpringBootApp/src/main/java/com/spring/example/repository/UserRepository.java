package com.spring.example.repository;


import org.springframework.data.repository.CrudRepository;

import com.spring.example.model.User;

public interface UserRepository extends CrudRepository<User,Integer> {

}
