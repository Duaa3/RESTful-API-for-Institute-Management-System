package com.InstituteManagementSystem.InMS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// The @SpringBootApplication annotation enables Spring Boot features for this application
// It also enables component scanning and auto-configuration of the application context
@SpringBootApplication
public class InMSApplication {

	public static void main(String[] args) {
		SpringApplication.run(InMSApplication.class, args);
	}

}
