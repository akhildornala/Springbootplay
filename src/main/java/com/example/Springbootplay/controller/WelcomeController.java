package com.example.Springbootplay.controller;

import com.example.Springbootplay.config.SampleConfig;
import com.example.Springbootplay.config.TestConfiguration;
import com.example.Springbootplay.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class WelcomeController {

    @Qualifier("firstbean")
    @Autowired(required = false)
    Employee e1;

    @Qualifier("secondbean")
    @Autowired(required = false)
    Employee e2;

    @Autowired(required = false)
    SampleConfig sc1;

    @Autowired(required = false)
    SampleConfig sc2;

    @GetMapping("/{name}")
    public String welcome(@PathVariable("name") String name) {
        System.out.println(e1 == e2);
        System.out.println(sc1 == sc2);
        return "hey bro " + name;
    }

    @GetMapping("/{hubby}/{wife}")
    public String couple(@PathVariable String hubby, @PathVariable String wife) {
        return "we are couple " + hubby + " and " + wife;
    }



}
