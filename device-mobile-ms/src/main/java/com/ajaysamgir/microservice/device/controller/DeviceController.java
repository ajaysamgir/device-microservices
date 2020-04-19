package com.ajaysamgir.microservice.device.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
	public String test() {
		return "Request hiting to BE";
	}
	
	@PostMapping("/new")
	public ResponseEntity<?> createDevice(@RequestBody DeviceVO deviceVO) {
		Optional<DeviceVO> response = deviceService.createDevice(deviceVO);
		return ResponseEntity.of(response);
	}

}
