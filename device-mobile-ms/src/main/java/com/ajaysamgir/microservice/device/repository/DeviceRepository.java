package com.ajaysamgir.microservice.device.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

import com.ajaysamgir.microservice.device.domain.Device;

@Component
public interface DeviceRepository extends MongoRepository<Device, String>{

}
