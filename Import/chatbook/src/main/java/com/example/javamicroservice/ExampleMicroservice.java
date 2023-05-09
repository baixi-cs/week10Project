package com.example.javamicroservice;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/example-microservice")
public class ExampleMicroservice {

	@Value("${server.port}")
	private String port;

	@GetMapping("/port")
	public String example() {
		return "application is up on port : " + port;
	}


	public static void main(String[] args) {
		SpringApplication.run(ExampleMicroservice.class, args);
	}
}
