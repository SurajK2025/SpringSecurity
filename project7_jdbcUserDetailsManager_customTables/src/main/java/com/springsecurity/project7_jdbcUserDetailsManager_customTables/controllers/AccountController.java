package com.springsecurity.project7_jdbcUserDetailsManager_customTables.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

	@GetMapping("/myAccountDetails")
	public String getMyAccountDetails() {
		return "My Account Details";
	}
}
