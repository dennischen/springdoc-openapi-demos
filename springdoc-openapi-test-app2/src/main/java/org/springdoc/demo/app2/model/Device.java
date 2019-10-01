package org.springdoc.demo.app2.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;

import io.swagger.v3.oas.annotations.media.Schema;

public class Device {

	String uuid;
	String name;
	@Schema(ref = "#/components/schemas/DeviceType")
	DeviceType type;

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DeviceType getType() {
		return type;
	}

	public void setType(DeviceType type) {
		this.type = type;
	}

}
