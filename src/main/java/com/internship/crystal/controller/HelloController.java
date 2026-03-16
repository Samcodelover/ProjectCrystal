package com.internship.crystal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // This tells Java: "This class handles web requests"
public class HelloController {

    @GetMapping("/hello") // This tells Java: "If someone goes to /hello, run this"
    public String sayHello() {
        return "Hello World! Sam's server is officially live.";
    }
}
