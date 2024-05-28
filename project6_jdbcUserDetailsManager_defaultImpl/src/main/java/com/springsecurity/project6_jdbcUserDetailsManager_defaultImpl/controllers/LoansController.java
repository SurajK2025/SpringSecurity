package com.springsecurity.project6_jdbcUserDetailsManager_defaultImpl.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansController {
	
	@GetMapping("/myLoans")
	public String getMyLoans() {
		return "My Loans";
	}
}
