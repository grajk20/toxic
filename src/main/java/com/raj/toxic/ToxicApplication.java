package com.raj.toxic;

import com.raj.toxic.controller.InitialToxicController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ToxicApplication {

	private static final Logger log = LoggerFactory.getLogger(InitialToxicController.class);

	public static void main(String[] args) {
		SpringApplication.run(ToxicApplication.class, args);
		log.info("Application started Successfully");

	}
}
