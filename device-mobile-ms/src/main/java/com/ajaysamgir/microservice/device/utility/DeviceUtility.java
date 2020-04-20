package com.ajaysamgir.microservice.device.utility;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

import com.ajaysamgir.microservice.device.domain.Device;
import com.ajaysamgir.microservice.device.vo.DeviceVO;

public class DeviceUtility {

	private static Function<Device, DeviceVO> fromDevice = device -> new DeviceVO(device);

	static Function<DeviceVO, Device> fromDeviceVO = deviceVO -> new Device(deviceVO);
	
	public static Device getDeviceDomain() {
		Supplier<Device> deviceSupplier = () -> new Device();
		return deviceSupplier.get();
	}

	public static Device getDeviceDomain(DeviceVO deviceVO) {
		return fromDeviceVO.apply(deviceVO);
	}

	public static DeviceVO fromDeviceDomain(Device device) {
		return fromDevice.apply(device);
	}

	public static List<DeviceVO> fromDeviceDomainList(List<Device> deviceList) {		
		List<DeviceVO> deviceVOList = new ArrayList<>();
		for (Device device : deviceList) {
			deviceVOList.add(fromDevice.apply(device));
		}
		return deviceVOList;
	}
}
