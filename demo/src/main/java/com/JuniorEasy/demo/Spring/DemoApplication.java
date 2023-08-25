package com.JuniorEasy.demo.Spring;

import com.JuniorEasy.demo.Spring.model.Model;
import com.JuniorEasy.demo.Spring.repostiroy.NumberRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner run(NumberRepository numberRepository) {
		return args -> {

			Model number = new Model();
			number.setNumber1(0.0);
			number.setNumber2(0.0);
			numberRepository.save(number);

		};
	}
	}