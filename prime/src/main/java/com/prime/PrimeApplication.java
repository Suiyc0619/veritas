package com.prime;

import com.prime.model.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
public class PrimeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeApplication.class, args);
	}
}
