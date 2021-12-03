package com.example.springblog.controller;

import com.example.springblog.entities.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public User hello(){
        return new User("New", "Pass", 1);
    }

}
