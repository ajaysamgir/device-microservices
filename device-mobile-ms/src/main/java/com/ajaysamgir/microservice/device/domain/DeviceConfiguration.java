package com.ajaysamgir.microservice.device.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class DeviceConfiguration {

	@Id
	private String id;

	private String memory;

	private String storage;

	private String os;

	private String osVersion;

	private String battery;

	public DeviceConfiguration() {
		super();
	}

	public DeviceConfiguration(String memory, String storage, String os, String osVersion, String battery) {
		super();
		this.memory = memory;
		this.storage = storage;
		this.os = os;
		this.osVersion = osVersion;
		this.battery = battery;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMemory() {
		return memory;
	}

	public void setMemory(String memory) {
		this.memory = memory;
	}

	public String getStorage() {
		return storage;
	}

	public void setStorage(String storage) {
		this.storage = storage;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getOsVersion() {
		return osVersion;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

	public String getBattery() {
		return battery;
	}

	public void setBattery(String battery) {
		this.battery = battery;
	}
}
