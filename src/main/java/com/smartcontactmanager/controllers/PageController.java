package com.smartcontactmanager.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {

    @GetMapping(value = "/home")
    public String home(){
        return "Home Page";
    }
}
