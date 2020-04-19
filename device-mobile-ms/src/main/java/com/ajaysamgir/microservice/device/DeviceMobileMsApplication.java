package com.ajaysamgir.microservice.device;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@Configuration
@ComponentScan(basePackages = {"com.ajaysamgir.microservice.device", "com.ajaysamgir.microservice.device.controller", "com.ajaysamgir.microservice.device.service"})
@EnableMongoRepositories
public class DeviceMobileMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeviceMobileMsApplication.class, args);
	}

}
