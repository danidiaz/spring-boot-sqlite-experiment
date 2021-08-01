package org.danisoft.datitos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DatitosController {

    @GetMapping(path = "/datitos")
    @ResponseBody String datitosEndpoint() {
        return "hola";
    }
}
