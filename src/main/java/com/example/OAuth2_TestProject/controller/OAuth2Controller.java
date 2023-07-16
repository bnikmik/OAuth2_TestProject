package com.example.OAuth2_TestProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OAuth2Controller {

    @GetMapping("/")
    public String getHelloWorld() {
        return "Hello World!!!";
    }

    @GetMapping("/bye")
    public String getBye() {
        return "Bye World!!!";
    }
}
