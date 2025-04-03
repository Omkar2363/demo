package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoController {

    @GetMapping("/test")
    public String testDemo(){
        return "Demo tested Successfully";
    }


    @GetMapping("/test2")
    public String testDemo2(){
        return "Demo tested Successfully again";
    }
}
