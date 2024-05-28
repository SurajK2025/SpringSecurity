package com.springsecurity.project6_jdbcUserDetailsManager_defaultImpl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.userdetails.jdbc.JdbcDaoImpl;

@SpringBootApplication
public class Project6JdbcUserDetailsManagerDefaultImplApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project6JdbcUserDetailsManagerDefaultImplApplication.class, args);
	}
}