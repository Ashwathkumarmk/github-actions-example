package com.ashwath.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
@GetMapping("/welcome")
    public String welcomeMsg(){
        return "HELLO ASHWATH M K WELCOME TO GITHUB ACTION CICD PIPELINE";
    }
}
