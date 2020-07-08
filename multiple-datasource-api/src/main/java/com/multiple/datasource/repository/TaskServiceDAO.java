package com.multiple.datasource.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TaskServiceDAO {

	@Autowired
	@Qualifier("jdbcTaskService")
	public JdbcTemplate jdbcTemplate;
	
	public int getCount_from_tasks() {
		return jdbcTemplate.queryForObject("Select count(*) from tasks",Integer.class);
	}
	
	
}
