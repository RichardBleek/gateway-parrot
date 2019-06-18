package com.rbleek.parrot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ParrotApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParrotApplication.class, args);
	}

	@RestController
	public class ParrotController {


		@GetMapping("/")
		public String noInput() {
			return parrot("say something");
		}

		@GetMapping("/{input}")
		public String parrot(@PathVariable("input") String input) {
			return input + "... " + input;
		}
	}
}
