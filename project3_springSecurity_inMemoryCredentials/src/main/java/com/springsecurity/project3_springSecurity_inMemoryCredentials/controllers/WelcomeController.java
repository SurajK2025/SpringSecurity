package com.springsecurity.project3_springSecurity_inMemoryCredentials.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/welcome")
	public ResponseEntity<String> getWelcomeMessage() {
		return ResponseEntity.ok("Welcome to Spring Security - Inmemory Credentials");
	}
}