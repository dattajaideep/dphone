package com.bajaj.dphone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DphoneApplication {

	public static void main(String[] args) {

		SpringApplication.run(DphoneApplication.class, args);
		System.out.println("server running in port 8080");
	}

}
