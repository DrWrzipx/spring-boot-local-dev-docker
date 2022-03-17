package com.trantorinc.springbootlocaldevdocker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class ExampleService {
    
    @RequestMapping(value = "/schedule", method = RequestMethod.GET)
    public String getSchedule() {
        return "Your schedule: M-F 9-5";
    }

}
