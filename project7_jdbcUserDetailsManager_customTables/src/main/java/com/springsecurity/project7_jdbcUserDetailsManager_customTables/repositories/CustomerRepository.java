package com.springsecurity.project7_jdbcUserDetailsManager_customTables.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springsecurity.project7_jdbcUserDetailsManager_customTables.models.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

	public List<Customer> findByEmail(String email);
}
