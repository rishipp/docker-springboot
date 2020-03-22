package com.example.rishi.dockercicddemo.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DeafultController {

    @GetMapping(produces = MediaType.TEXT_PLAIN_VALUE)
    public String health(){
        return "Hello from default";
    }
}
