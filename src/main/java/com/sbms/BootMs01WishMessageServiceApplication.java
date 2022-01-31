package com.sbms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class BootMs01WishMessageServiceApplication {

	public static void main(String[] args) {
		log.info("Spring Boot Jenkins test 1");
		SpringApplication.run(BootMs01WishMessageServiceApplication.class, args);
		log.info("Spring Boot Jenkins test 2");
		log.info("Spring Boot Jenkins test 3");
	}

}
