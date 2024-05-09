package com.kodnest.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {
	@GetMapping(value="/greet")
	public String greet() {
	return "welecome to new world of spring boot";	
	}

}
