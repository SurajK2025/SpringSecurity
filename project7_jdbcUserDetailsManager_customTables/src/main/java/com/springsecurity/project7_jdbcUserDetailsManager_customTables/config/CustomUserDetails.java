package com.springsecurity.project7_jdbcUserDetailsManager_customTables.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.springsecurity.project7_jdbcUserDetailsManager_customTables.models.Customer;
import com.springsecurity.project7_jdbcUserDetailsManager_customTables.repositories.CustomerRepository;

@Service
public class CustomUserDetails implements UserDetailsService {
	
	@Autowired
	public CustomerRepository customerRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		String userName = null, password = null;
		List<GrantedAuthority> authorities = null;
		List<Customer> customers = this.customerRepository.findByEmail(username);
		
		if(customers.size() > 0) {
			userName = customers.get(0).getEmail();
			password = customers.get(0).getPwd();
			authorities = new ArrayList<>();
			authorities.add(new SimpleGrantedAuthority(customers.get(0).getRole()));
		}
		else {
			throw new UsernameNotFoundException("User details not found for user: "+username);
		}
		
		return new User(userName, password, authorities);
	}
}
