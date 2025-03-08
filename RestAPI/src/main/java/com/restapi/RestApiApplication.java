package com.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//Required dependencies: Spring Boot Starter Web, Spring Boot Starter Data JPA, Lombok, H2 Database

//@SpringBootApplication: Main annotation for Spring Boot applications.
//Combines @Configuration, @EnableAutoConfiguration, and @ComponentScan.
@SpringBootApplication
public class RestApiApplication {

	public static void main(String[] args) {
		// Starts the Spring Boot application
		SpringApplication.run(RestApiApplication.class, args);
	}

}
