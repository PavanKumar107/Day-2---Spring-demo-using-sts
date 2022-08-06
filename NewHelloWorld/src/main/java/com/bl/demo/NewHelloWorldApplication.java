package com.bl.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NewHelloWorldApplication {

	public static void main(String[] args) {
		System.out.println("Hello from Bridgelabs");
		SpringApplication.run(NewHelloWorldApplication.class, args);
	}

}
