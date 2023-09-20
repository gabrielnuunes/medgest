package com.medgest.springbootmedgest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootMedgestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMedgestApplication.class, args);
	}

	@GetMapping("/")
	public String ola() {
		return "Olá mundo!";
	}

}
