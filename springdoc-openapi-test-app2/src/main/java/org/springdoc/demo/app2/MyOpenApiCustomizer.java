package org.springdoc.demo.app2;

import java.util.Optional;

import org.springdoc.api.OpenApiCustomiser;
import org.springdoc.demo.app2.model.ADevice;
import org.springdoc.demo.app2.model.Device;
import org.springdoc.demo.app2.model.DeviceType;
import org.springframework.stereotype.Component;

import io.swagger.v3.core.util.AnnotationsUtils;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.media.Schema;

@Component
public class MyOpenApiCustomizer implements OpenApiCustomiser {

	@Override
	public void customise(OpenAPI openApi) {
		Components components = openApi.getComponents();
		
//		AnnotationsUtils.resolveSchemaFromType(ADevice.class, openApi.getComponents(), null);
		Class<?> clz = DeviceType.class;
		Optional<? extends Schema> o = AnnotationsUtils.getSchema(null, null, false, clz, components, null);
		if(o.isPresent()) {
			Schema schema = o.get();
			String name = schema.getName();
			if(name==null) {
				name = clz.getSimpleName();
			}
			components.addSchemas(name, schema);
		}
		

	}
}