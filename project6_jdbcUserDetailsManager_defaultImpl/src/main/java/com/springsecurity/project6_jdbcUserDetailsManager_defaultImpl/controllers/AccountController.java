package com.springsecurity.project6_jdbcUserDetailsManager_defaultImpl.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

	@GetMapping("/myAccountDetails")
	public String getMyAccountDetails() {
		return "My Account Details";
	}
}
