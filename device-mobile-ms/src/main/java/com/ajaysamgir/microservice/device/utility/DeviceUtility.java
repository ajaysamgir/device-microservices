package com.ajaysamgir.microservice.device.utility;

import java.util.Optional;
import java.util.function.Supplier;

import com.ajaysamgir.microservice.device.domain.Device;
import com.ajaysamgir.microservice.device.vo.DeviceVO;

public class DeviceUtility {

	public static Device getDeviceDomain() {
		Supplier<Device> deviceSupplier = () -> new Device();
		return deviceSupplier.get();
	}

	public static Device getDeviceDomain(DeviceVO deviceVO) {
		Supplier<Device> deviceSupplier = () -> new Device(deviceVO.getName(), deviceVO.getType(),
				deviceVO.getManufacturer(), deviceVO.getDeviceConfiguration(), deviceVO.getModelNumber());
		return deviceSupplier.get();
	}

	public static Optional<DeviceVO> fromDeviceDomain(Device device) {
		Supplier<DeviceVO> deviceVOSupplier = () -> new DeviceVO(device.getName(), device.getType(),
				device.getManufacturer(), device.getDeviceConfiguration(), device.getModelNumber());
		return Optional.of(deviceVOSupplier.get());
	}
}
