package com.rbleek.seagull;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SeagullApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeagullApplication.class, args);
	}

	@RestController
	public class Controller {

		@GetMapping("/")
		public String get() {
			return "I take your fries.";
		}
	}
}
