package org.springdoc.demo.app2.api;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@javax.annotation.Generated(value = "org.springdoc.demo.app2.codegen.languages.SpringCodegen", date = "2019-07-11T00:09:29.839+02:00[Europe/Paris]")

@Controller
@RequestMapping("${openapi.openAPIPetstore.base-path:/}")
public class DeviceApiController implements DeviceApi {

//    private final PetApiDelegate delegate;

    public DeviceApiController(/*@org.springframework.beans.factory.annotation.Autowired(required = false) PetApiDelegate delegate*/) {
//        this.delegate = null;//Optional.ofNullable(delegate).orElse(new PetApiDelegate() {});
    }

//    @Override
//    public PetApiDelegate getDelegate() {
//        return delegate;
//    }

}
