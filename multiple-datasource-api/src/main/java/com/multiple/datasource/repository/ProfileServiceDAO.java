package com.multiple.datasource.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProfileServiceDAO {

	@Autowired
	@Qualifier("jdbcProfileService")
	public JdbcTemplate jdbcTemplate;
	
	public int getCount_from_Profile() {
		 return jdbcTemplate.queryForObject("Select count(*) from tasks",Integer.class);
	}
}
