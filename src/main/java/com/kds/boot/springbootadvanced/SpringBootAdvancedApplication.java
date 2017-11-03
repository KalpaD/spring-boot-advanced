package com.kds.boot.springbootadvanced;

import com.kds.boot.springbootadvanced.config.DataSourceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

// This annotation only do the component scan from com.kds.boot.springbootadvanced -> sub
// packages if we want more scan locations we need to tell spring.
// @ComponentScan can alter this default behaviour and allow us to add more package locations.

// @ImportResource() we can use this annotation to load xml based spring configuration.
@SpringBootApplication
@EnableConfigurationProperties(DataSourceConfig.class)
public class SpringBootAdvancedApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAdvancedApplication.class, args);
	}

}
