package com.ashwath.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
@GetMapping("/welcome")
    public String welcomeMsg(){
        return "HELLO LOHITH N K WELCOME TO JENKINS CICD PIPELINE";
    }
}
