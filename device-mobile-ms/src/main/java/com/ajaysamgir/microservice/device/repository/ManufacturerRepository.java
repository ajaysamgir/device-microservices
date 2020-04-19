package com.ajaysamgir.microservice.device.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ajaysamgir.microservice.device.domain.Manufacturer;

@Repository
public interface ManufacturerRepository extends MongoRepository<Manufacturer, Long> {

}
