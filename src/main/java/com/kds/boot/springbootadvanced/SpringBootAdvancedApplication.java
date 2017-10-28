package com.kds.boot.springbootadvanced;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

// This annotation only do the component scan from com.kds.boot.springbootadvanced -> sub
// packages if we want more scan locations we need to tell spring.
// @ComponentScan can alter this default behaviour and allow us to add more package locations.

// @ImportResource() we can use this annotation to load xml based spring configuration.
@SpringBootApplication
public class SpringBootAdvancedApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAdvancedApplication.class, args);
	}
}
