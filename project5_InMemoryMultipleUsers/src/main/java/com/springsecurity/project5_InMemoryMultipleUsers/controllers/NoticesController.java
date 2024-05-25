package com.springsecurity.project5_InMemoryMultipleUsers.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticesController {

	@GetMapping("/myNotices")
	public String getMyNotices() {
		return "My Notices";
	}
}
