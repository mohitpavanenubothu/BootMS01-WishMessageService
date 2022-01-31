package com.sbms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class BootMs01WishMessageServiceApplication {

	public static void main(String[] args) {
		log.info("Inside stater class for Jenkins test");
		SpringApplication.run(BootMs01WishMessageServiceApplication.class, args);
	}

}
