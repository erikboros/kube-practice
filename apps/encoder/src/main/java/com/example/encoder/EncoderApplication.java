package com.example.encoder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EncoderApplication {

	public static int counter = 0;

	public static void main(String[] args) {
		SpringApplication.run(EncoderApplication.class, args);
	}

}
