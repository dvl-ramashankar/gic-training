package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day16Application {
	private static final Logger logger = LoggerFactory.getLogger(Day16Application.class);

	public static void main(String[] args) {

		logger.info("This is a info message");
		SpringApplication.run(Day16Application.class, args);
	}

}
