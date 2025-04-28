package com.example.demo_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/messgage")
    public String getMessage(){
        return "hello-world";
    }
}
