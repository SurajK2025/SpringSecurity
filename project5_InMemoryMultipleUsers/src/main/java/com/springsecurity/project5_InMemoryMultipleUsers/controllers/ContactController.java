package com.springsecurity.project5_InMemoryMultipleUsers.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

	@GetMapping("/myContacts")
	public String getMyContacts() {
		return "My Contacts";
	}
}
