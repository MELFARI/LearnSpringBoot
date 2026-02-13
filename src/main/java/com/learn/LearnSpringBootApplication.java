package com.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LearnSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringBootApplication.class, args);
	}
	@GetMapping
	public String helloWorld() {
		return "Hello bro I am learning Spring Boot";
	}

}



