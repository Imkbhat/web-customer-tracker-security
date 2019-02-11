package com.luv2code.springdemo.springsecurity.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;


@Configuration
@EnableWebSecurity
public class DemoSecurityConfig 
			extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder builder) throws Exception {

	
		@SuppressWarnings("deprecation")
		UserBuilder user  = User.withDefaultPasswordEncoder();
		
		builder.inMemoryAuthentication().withUser(user.username("kiran").password("kiran123").roles("MANAGER"))
		.withUser(user.username("abc").password("abc123").roles("EMPLOYEE"))
		.withUser(user.username("xyz").password("xyz123").roles("ADMIN"));
	}

}
