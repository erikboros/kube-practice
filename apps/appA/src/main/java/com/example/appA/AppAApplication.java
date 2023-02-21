package com.example.appA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppAApplication {

	public static int counter = 0;

	public static void main(String[] args) {
		SpringApplication.run(AppAApplication.class, args);
	}

}
