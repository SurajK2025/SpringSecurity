package com.springsecurity.project6_jdbcUserDetailsManager_defaultImpl.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController {

	@GetMapping("/myCards")
	public String getMyCards() {
		return "My Cards";
	}
}
