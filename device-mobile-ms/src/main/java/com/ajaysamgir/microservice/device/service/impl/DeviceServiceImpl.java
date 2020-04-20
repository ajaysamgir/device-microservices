package com.ajaysamgir.microservice.device.service.impl;

import java.util.List;
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
		return device != null ? Optional.of(DeviceUtility.fromDeviceDomain(device)) : Optional.empty();
	}

	@Override
	public Optional<List<DeviceVO>> getAllDevices() {
		List<Device> deviceList = repository.findAll();
		return deviceList != null ? Optional.of(DeviceUtility.fromDeviceDomainList(deviceList)) : Optional.empty();
	}

	@Override
	public Optional<DeviceVO> updateDevice(DeviceVO deviceVO) {
		if (repository.findById(deviceVO.getId()) != null) {
			Device device = repository.save(DeviceUtility.getDeviceDomain(deviceVO));
			return Optional.of(DeviceUtility.fromDeviceDomain(device));
		}
		return Optional.empty();
	}

	@Override
	public Optional<DeviceVO> getDeviceById(String id) {
		Optional<Device> device = repository.findById(id);
		return device != null ? Optional.of(DeviceUtility.fromDeviceDomain(device.get())) : Optional.empty();
	}
}
