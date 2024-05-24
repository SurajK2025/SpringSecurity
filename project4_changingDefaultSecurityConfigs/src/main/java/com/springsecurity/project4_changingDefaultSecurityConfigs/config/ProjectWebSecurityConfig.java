package com.springsecurity.project4_changingDefaultSecurityConfigs.config;

import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectWebSecurityConfig {

	@Bean
	SecurityFilterChain customSecurityFilterChain(HttpSecurity http) throws Exception {
//		http.authorizeHttpRequests()
//			.requestMatchers("/myAccountDetails", "/myBalance", "/myCards", "/myContacts", "/myLoans").authenticated()
//			.requestMatchers("/myNotices").permitAll()
//			.and()
//			.formLogin()
//			.and()
//			.httpBasic();
		
//		http.authorizeHttpRequests(requests -> 
//		requests.requestMatchers("/myAccountDetails", "/myBalance", "/myCards", "/myContacts", "/myLoans").authenticated()
//				.requestMatchers("/myNotices").permitAll());
		
//		http.authorizeHttpRequests((requests) -> requests.anyRequest().denyAll());
		
		http.authorizeHttpRequests((requests) -> requests.anyRequest().permitAll());
		http.formLogin(withDefaults());
		http.httpBasic(withDefaults());
		return http.build();
	}
}
