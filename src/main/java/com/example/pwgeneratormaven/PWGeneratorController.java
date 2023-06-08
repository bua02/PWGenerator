package com.example.pwgeneratormaven;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PWGeneratorController {
    private final PWGenerator monitor = new PWGenerator();

    @RequestMapping(value = "/api/passwordGenerator", method = RequestMethod.GET)
    @ResponseBody
    public String generatePassword(){
        if (monitor.getMonitorMessage() == null || monitor.getMonitorMessage().isEmpty()) {
            return "No message set";
        }

        return monitor.getMonitorMessage();
    }
}
