package com.multiple.datasource.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class DatabaseConfig {

	@Bean(name = "dbProfileService")
	@ConfigurationProperties(prefix = "spring.dbprofileservice")
	@Primary
	public DataSource createProfileServiceDataSource() {
		return DataSourceBuilder.create().build();
	}

	@Bean(name = "dbTaskService")
	@ConfigurationProperties(prefix = "spring.dbtaskservice")
	public DataSource createTaskServiceDataSource() {
		return DataSourceBuilder.create().build();
	}

	@Bean(name = "jdbcProfileService")
	@Autowired
	public JdbcTemplate createJdbcTemplate_ProfileService(@Qualifier("dbProfileService") DataSource profileServiceDS) {
		return new JdbcTemplate(profileServiceDS);
	}

	@Bean(name = "jdbcTaskService")
	@Autowired
	public JdbcTemplate createJdbcTemplate_TaskService(@Qualifier("dbTaskService") DataSource taskServiceDS) {
		return new JdbcTemplate(taskServiceDS);
	}

}
