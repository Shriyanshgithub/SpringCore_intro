package com.capgemini.springcoreIntro.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/sayHello")
public class MyController {

    @GetMapping
    public String sayHello(){
        return "Hello";
    }

    @GetMapping("/hello1")
    public String hello(Model model){
        model.addAttribute("message", "say hello from bridgeLabz");
        return "hello";
    }
}
