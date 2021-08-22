package com.personal.first.springProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/")
    public String home(){
        return "Hello World!";
    }

    @GetMapping("/hello")
    public String sayHello(@RequestParam(defaultValue = "World" , required = false) String name , Model model){
        model.addAttribute("user",name);
        return "Hello guys";
    }
}
