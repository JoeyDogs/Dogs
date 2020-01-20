package com.joey.dog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DogdemoApplication {

	public static void main(String[] args) {
		System.out.println("here");
		SpringApplication.run(DogdemoApplication.class, args);
	}

}
