package com.example.springbootdockerize;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootDockerizeApplication {

	@GetMapping("/test")
	public String test() {
		return "hello docker bhai";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerizeApplication.class, args);
	}

}
