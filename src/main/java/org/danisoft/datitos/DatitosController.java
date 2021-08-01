package org.danisoft.datitos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DatitosController {

    private final PersonService service;

    public DatitosController(PersonService service) {
        this.service = service;
    }

    @GetMapping(path = "/datitos/person")
    @ResponseBody String personEndpoint() {
        return service.getPersonName();
    }
}
