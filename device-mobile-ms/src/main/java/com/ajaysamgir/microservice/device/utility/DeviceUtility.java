package com.ajaysamgir.microservice.device.utility;

import java.util.ArrayList;
import java.util.List;
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

	public static DeviceVO fromDeviceDomain(Device device) {
		Supplier<DeviceVO> deviceVOSupplier = () -> new DeviceVO(device.getId(), device.getName(), device.getType(),
				device.getManufacturer(), device.getDeviceConfiguration(), device.getModelNumber());
		return deviceVOSupplier.get();
	}

	public static List<DeviceVO> fromDeviceDomainList(List<Device> deviceList) {
		List<DeviceVO> deviceVOList = new ArrayList<>();
		for (Device device : deviceList) {
			deviceVOList.add(fromDeviceDomain(device));
		}
		return deviceVOList;
	}
}
