package com.bl.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloRestController {
	
	@RequestMapping(value = {"","/","/home"})
	public String sayHello() {
		return "Hello from Bridgelabs";
	}
}
