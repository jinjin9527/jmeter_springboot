package com.sylinx.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello1")
    @ResponseStatus(HttpStatus.OK)
    public String hello1(){
        return "jmeterhello1";
    }
}
