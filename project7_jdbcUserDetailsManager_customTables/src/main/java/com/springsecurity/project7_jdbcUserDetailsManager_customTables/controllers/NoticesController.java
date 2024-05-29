package com.springsecurity.project7_jdbcUserDetailsManager_customTables.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticesController {

	@GetMapping("/myNotices")
	public String getMyNotices() {
		return "My Notices";
	}
}
