package com.dp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

	@GetMapping("/hello")
	public String satHello() {
		return "hello world"; 
	}
	
	@GetMapping("/hi")
	public String sayHello1() {
		return "welcome to git hub"; 
	}
	
}
