package com.spring.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.spring.starter.repository")
public class SpringStarter1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringStarter1Application.class, args);
	}
}
