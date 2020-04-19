package com.ajaysamgir.microservice.device.service.impl;

import java.util.Optional;

import com.ajaysamgir.microservice.device.domain.Device;
import com.ajaysamgir.microservice.device.repository.DeviceRepository;
import com.ajaysamgir.microservice.device.service.DeviceService;
import com.ajaysamgir.microservice.device.utility.DeviceUtility;
import com.ajaysamgir.microservice.device.vo.DeviceVO;

public class DeviceServiceImpl implements DeviceService {
	private DeviceRepository repository;

	public DeviceServiceImpl(DeviceRepository repository) {
		this.repository = repository;
	}

	@Override
	public Optional<DeviceVO> createDevice(DeviceVO deviceVO) {
		Device device = repository.save(DeviceUtility.getDeviceDomain(deviceVO));
		return device != null ? DeviceUtility.fromDeviceDomain(device) : Optional.empty();
	}
}
