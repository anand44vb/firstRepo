package com.javasampleapproach.angular4mongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
public class SpringBootAngular4MongoDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAngular4MongoDbApplication.class, args);
	}
}
