package org.springdoc.demo.app2.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;

import io.swagger.v3.oas.annotations.media.Schema;

public class ADevice extends Device{


	@Schema(ref = "#/components/schemas/DeviceType")
	public DeviceType getType() {
		return super.getType();
	}
}
