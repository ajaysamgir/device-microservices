package com.ajaysamgir.microservice.device.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.NonNull;

@Document
public class Device {

	@Id
	private String id;

	@NonNull
	private String name;

	private String type;

	@NonNull
	private String manufacturer;

	private DeviceConfiguration deviceConfiguration;

	@NonNull
	private String modelNumber;

	public Device() {
	}

	public Device(String name, String type, String manufacturer, DeviceConfiguration deviceConfiguration,
			String modelNumber) {
		super();
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
