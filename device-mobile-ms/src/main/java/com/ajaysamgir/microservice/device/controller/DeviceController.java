package com.ajaysamgir.microservice.device.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ajaysamgir.microservice.device.service.DeviceService;
import com.ajaysamgir.microservice.device.vo.DeviceVO;

@RestController
@RequestMapping("/device/api")
public class DeviceController {

	@Autowired
	private DeviceService deviceService;

	@GetMapping("/")
	public ResponseEntity<List<DeviceVO>> getAllDevices() {
		Optional<List<DeviceVO>> response = deviceService.getAllDevices();
		return new ResponseEntity<List<DeviceVO>>(response.get(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<DeviceVO> getDevice(@PathVariable String id) {
		Optional<DeviceVO> response = deviceService.getDeviceById(id);
		return new ResponseEntity<DeviceVO>(response.get(), HttpStatus.OK);
	}

	@PostMapping("/")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<DeviceVO> createDevice(@Valid @RequestBody DeviceVO deviceVO) {
		Optional<DeviceVO> response = deviceService.createDevice(deviceVO);
		return new ResponseEntity<DeviceVO>(response.get(), HttpStatus.OK);
	}

	@PutMapping("/{id}")
	public ResponseEntity<DeviceVO> updateDevice(@Valid @RequestBody DeviceVO deviceVO) {
		Optional<DeviceVO> response = deviceService.updateDevice(deviceVO);
		return new ResponseEntity<DeviceVO>(response.get(), HttpStatus.OK);
	}

}
