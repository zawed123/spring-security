package com.security.springbasicsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/noAuth/rest")
public class UserController {

    @GetMapping("/sayHi")
    public String sayHi()
    {
        return "Hi Welcome to spring security";
    }
}
