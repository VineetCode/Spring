package com.vineet.security.app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {

	DaoAuthenticationProvider provider = new DaoAuthenticationProvider();

	public AuthenticationProvider authProvider() {
		return provider;
	}

	/*
	 * @Bean
	 * 
	 * @Override protected UserDetailsService userDetailsService() {
	 * List<UserDetails> user=new ArrayList<>();
	 * user.add(User.withDefaultPasswordEncoder().username("Vineet").password("1234"
	 * ).roles("USER").build());
	 * 
	 * return new InMemoryUserDetailsManager(user); }
	 */
}// end of AppSecurityConfig.java
