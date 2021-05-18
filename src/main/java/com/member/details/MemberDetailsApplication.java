package com.member.details;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MemberDetailsApplication {
	
	private static final Logger LOGGER=LoggerFactory.getLogger(MemberDetailsApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MemberDetailsApplication.class, args);
		
		LOGGER.info("Simple log statement:application started");
	}
}
