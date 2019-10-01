package org.springdoc.demo.app2.api;

import org.springdoc.demo.app2.model.Device;
import org.springdoc.demo.app2.model.Pet;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "device-api", description = "the device API")

public interface DeviceApi {

	@Operation(summary = "Find device by uuid", description = "Returns a single device", security = {
			@SecurityRequirement(name = "XSPACE_TOKEN") })
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = Device.class))),
			@ApiResponse(responseCode = "400"),
			@ApiResponse(responseCode = "404", description = "device not found") })
	@GetMapping(value = "/device/{uuid}", produces = { "application/xml", "application/json" })
	default Device getDeviceById(
			@Parameter(description = "uuid of pet to return", required = true) @PathVariable("uuid") String uuid) {
		return null;
	}
	
	@Operation(summary = "Find device by uuid", description = "Returns a single device", security = {
			@SecurityRequirement(name = "api_key") })
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = Device.class))),
			@ApiResponse(responseCode = "400"),
			@ApiResponse(responseCode = "404", description = "device not found") })
	@GetMapping(value = "/device2/{uuid}", produces = { "application/xml", "application/json" })
	default Device getDeviceById2(
			@Parameter(description = "uuid of pet to return", required = true) @PathVariable("uuid") String uuid,
			@Parameter() @RequestParam("a_xyz") String a,
			@Parameter() @RequestParam("c_ijk") String c,
			@Parameter() @RequestParam("b_nmp") String b) {
		return null;
	}
}
