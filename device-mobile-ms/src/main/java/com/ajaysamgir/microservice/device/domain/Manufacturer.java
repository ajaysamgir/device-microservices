package com.ajaysamgir.microservice.device.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.NonNull;

@Document
public class Manufacturer {
	
	@Id
	private Long id;
	
	@NonNull
	private String name;
	
	private String series;
	
	private String origin;

	public Manufacturer() {
		super();
	}

	public Manufacturer(Long id, String name, String series, String origin) {
		super();
		this.id = id;
		this.name = name;
		this.series = series;
		this.origin = origin;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}
}
