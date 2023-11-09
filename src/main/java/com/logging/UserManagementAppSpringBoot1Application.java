package com.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserManagementAppSpringBoot1Application {
	private static final Logger logger = LoggerFactory.getLogger(UserManagementAppSpringBoot1Application.class);

	public static void main(String[] args) {
		SpringApplication.run(UserManagementAppSpringBoot1Application.class, args);
		System.out.println("Hello.............");
		// Example usage of the logger
		logger.trace("this is an trace msg");
		logger.debug("this is an debug msg");
		logger.info("this is an info msg");
		logger.warn("this is an warning msg");
		logger.error("this is an error msg");
	}
}
