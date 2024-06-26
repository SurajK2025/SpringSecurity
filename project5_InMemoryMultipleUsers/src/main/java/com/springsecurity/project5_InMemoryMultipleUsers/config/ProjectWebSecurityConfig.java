package com.springsecurity.project5_InMemoryMultipleUsers.config;

import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectWebSecurityConfig {

	@Bean
	SecurityFilterChain customSecurityFilterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(requests -> 
				requests.requestMatchers("/myAccountDetails", "/myBalance", "/myCards", "/myContacts", "/myLoans").authenticated()
						.requestMatchers("/myNotices").permitAll());
		http.formLogin(withDefaults());
		http.httpBasic(withDefaults());
		return http.build();
	}
	
	@Bean
	public InMemoryUserDetailsManager userDetailsService() {
//		Approach1: Using withDefaultPasswordEncoder() method.
//		UserDetails admin = User.withDefaultPasswordEncoder()
//				.username("admin")
//				.password("admin")
//				.authorities("admin")
//				.build();
//		
//		UserDetails user1 = User.withDefaultPasswordEncoder()
//				.username("user1")
//				.password("user1")
//				.authorities("view")
//				.build();
//		
//		return new InMemoryUserDetailsManager(admin, user1);
		
//		Approach2: Using NoOpPasswordEncoder
		UserDetails admin = User.withUsername("admin")
				.password("admin")
				.authorities("admin")
				.build();
		
		UserDetails user1 = User.withUsername("user1")
				.password("user1")
				.authorities("view")
				.build();
		
		return new InMemoryUserDetailsManager(admin, user1);
	}
	
	@Bean
	public  PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
}
