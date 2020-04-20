package com.ajaysamgir.microservice.device.vo;

import javax.validation.constraints.NotBlank;

import com.ajaysamgir.microservice.device.domain.DeviceConfiguration;

public class DeviceVO {

	private String id;

	@NotBlank(message = "{deviceName.not-null}")
	private String name;

	private String type;

	@NotBlank(message = "{manufacturer.not-null}")
	private String manufacturer;

	private DeviceConfiguration deviceConfiguration;

	private String modelNumber;

	public DeviceVO() {
	}

	public DeviceVO(String id, String name, String type, String manufacturer, DeviceConfiguration deviceConfiguration,
			String modelNumber) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.manufacturer = manufacturer;
		this.deviceConfiguration = deviceConfiguration;
		this.modelNumber = modelNumber;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public DeviceConfiguration getDeviceConfiguration() {
		return deviceConfiguration;
	}

	public void setDeviceConfiguration(DeviceConfiguration deviceConfiguration) {
		this.deviceConfiguration = deviceConfiguration;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}
}
