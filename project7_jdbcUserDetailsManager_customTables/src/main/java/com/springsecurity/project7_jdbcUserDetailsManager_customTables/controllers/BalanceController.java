package com.springsecurity.project7_jdbcUserDetailsManager_customTables.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {

	@GetMapping("/myBalance")
	public String getMyBalance() {
		return "My Balance";
	}
}
