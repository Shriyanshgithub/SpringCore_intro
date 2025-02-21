package com.capgemini.springcoreIntro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sayHello")
public class MyController {

    @GetMapping
    public String sayHello(){
        return "Hello from BridgeLabz";
    }
}
