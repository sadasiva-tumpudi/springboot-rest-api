package com.practicexample.springboot.rest.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {

    @GetMapping("/hello")
    public String HelloWorld() {
        return "Hello World from Spring Boot REST API!";
    }
}
