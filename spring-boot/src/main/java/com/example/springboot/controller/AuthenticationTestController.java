package com.example.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/example/authentication/endpoints")
public class AuthenticationTestController {

    @RequestMapping("/without-role")
    public String withoutRole() {
        return "without validation role";
    }

    

}