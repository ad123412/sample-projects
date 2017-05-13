package com.ada.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.ada.spring.app.repository"})
@EntityScan(basePackages = {"com.ada.spring.app.model"})
public class BootstrapDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootstrapDemoApplication.class, args);
	}
}
