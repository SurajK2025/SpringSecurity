package com.springsecurity.project5_InMemoryMultipleUsers.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController {

	@GetMapping("/myCards")
	public String getMyCards() {
		return "My Cards";
	}
}
