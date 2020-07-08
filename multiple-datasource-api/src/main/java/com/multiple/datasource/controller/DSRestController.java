package com.multiple.datasource.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.multiple.datasource.repository.ProfileServiceDAO;
import com.multiple.datasource.repository.TaskServiceDAO;

@RestController
@RequestMapping("/dataSource")
public class DSRestController {

	@Autowired
	public ProfileServiceDAO profileServiceDAO;

	@Autowired
	public TaskServiceDAO taskServiceDAO;

	@RequestMapping(value = "/usersCount")
	public String userCount_from_ProfileService() {
		return "Count from Users Table :"+profileServiceDAO.getCount_from_Profile();
	}

	@RequestMapping(value = "/tasksCount")
	public String tasksCount_from_TaskService() {
		return "Count from Tasks Table :"+taskServiceDAO.getCount_from_tasks();
	}
}
