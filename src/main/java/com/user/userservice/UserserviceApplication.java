package com.user.userservice;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class UserserviceApplication {

	public static Logger logger = LoggerFactory.getLogger(UserserviceApplication.class);

	@PostConstruct
	public void init(){
		logger.info("Application Started....");
	}

	@GetMapping
	public String sayHello()
	{
		return "Hello! How are you";
	}

	public static void main(String[] args) {
		logger.info("inside main method");
		SpringApplication.run(UserserviceApplication.class, args);
	}

}
