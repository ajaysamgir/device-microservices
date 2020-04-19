package com.ajaysamgir.microservice.device.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajaysamgir.microservice.device.service.DeviceService;
import com.ajaysamgir.microservice.device.vo.DeviceVO;

@RestController
@RequestMapping("/device/api")
public class DeviceController {

	@Autowired
	private DeviceService deviceService;

	@GetMapping("/")
	public ResponseEntity<?> getAllDevices() {
		Optional<List<DeviceVO>> response = deviceService.getAllDevices();
		return ResponseEntity.ok(response);
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> getDevice(@PathVariable String id) {
		Optional<List<DeviceVO>> response = deviceService.getAllDevices();
		return ResponseEntity.ok(response);
	}

	@PostMapping("/")
	public ResponseEntity<?> createDevice(@RequestBody DeviceVO deviceVO) {
		Optional<DeviceVO> response = deviceService.createDevice(deviceVO);
		return ResponseEntity.of(response);
	}

	@PutMapping("/{id}")
	public ResponseEntity<?> updateDevice(@RequestBody DeviceVO deviceVO) {
		Optional<DeviceVO> response = deviceService.updateDevice(deviceVO);
		return ResponseEntity.of(response);
	}

}
