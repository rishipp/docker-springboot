package com.example.rishi.dockercicddemo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class TestController {

    @GetMapping(value = "/{name}")
    public String getGreetings(@PathVariable String name){
        String greetings = "Hello " + name + "!";
        return greetings;
    }
}
