package com.ajaysamgir.microservice.device;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.ajaysamgir.microservice.device.repository.DeviceRepository;
import com.ajaysamgir.microservice.device.service.DeviceService;
import com.ajaysamgir.microservice.device.service.impl.DeviceServiceImpl;

@Configuration
public class AppConfig {
	
	@Autowired
	private DeviceRepository deviceRepository;
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	@Bean
	public DeviceService getDeviceService() {
		return new DeviceServiceImpl(deviceRepository);
	}
}
