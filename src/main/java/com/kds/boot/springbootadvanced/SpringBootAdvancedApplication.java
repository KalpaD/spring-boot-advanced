package com.kds.boot.springbootadvanced;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootAdvancedApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAdvancedApplication.class, args);
	}

	@Bean
	public ChuckNorrisQuotes chuckNorrisQuotes () {
		return new ChuckNorrisQuotes();
	}
}
