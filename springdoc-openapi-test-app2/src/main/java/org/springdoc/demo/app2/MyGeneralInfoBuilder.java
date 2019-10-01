package org.springdoc.demo.app2;

import java.util.Map;

import org.springdoc.core.GeneralInfoBuilder;
import org.springdoc.core.SecurityParser;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@Primary
public class MyGeneralInfoBuilder extends GeneralInfoBuilder {

	private ApplicationContext context;
	public MyGeneralInfoBuilder(ApplicationContext context, SecurityParser securityParser) {
		super(context, securityParser);
		this.context = context;
	}
	
	@Override
	public Map<String, Object> getRestControllersMap() {
		Map<String, Object> m= context.getBeansWithAnnotation(RestController.class);
		m.remove("openApiResource");
		m.forEach((k,v)->{System.out.println(">>>>>>getRestControllersMap>"+k+","+v);});
		
		return m;
	}

	@Override
	public Map<String, Object> getRequestMappingMap() {
		Map<String, Object> m =  context.getBeansWithAnnotation(RequestMapping.class);
//		m.remove("deviceApiController");
		m.remove("petApiController");
		m.remove("storeApiController");
		m.remove("userApiController");
		m.remove("basicErrorController");
		m.forEach((k,v)->{System.out.println(">>>>>>getRequestMappingMap>"+k+","+v);});
		return m;
	}

}