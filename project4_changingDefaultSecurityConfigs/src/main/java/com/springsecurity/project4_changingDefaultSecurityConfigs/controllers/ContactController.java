package com.springsecurity.project4_changingDefaultSecurityConfigs.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

	@GetMapping("/myContacts")
	public String getMyContacts() {
		return "My Contacts";
	}
}
