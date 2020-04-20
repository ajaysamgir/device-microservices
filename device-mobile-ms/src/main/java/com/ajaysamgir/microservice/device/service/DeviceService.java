package com.ajaysamgir.microservice.device.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ajaysamgir.microservice.device.vo.DeviceVO;

@Service
public interface DeviceService {

	Optional<DeviceVO> createDevice(DeviceVO deviceVO);

	Optional<List<DeviceVO>> getAllDevices();

	Optional<DeviceVO> updateDevice(DeviceVO deviceVO);

	Optional<DeviceVO> getDeviceById(String id);
	
}
