package com.example.demo.controlle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoController {

    @GetMapping("/test")
    public String testDemo(){
        return "Demo tested Successfully";
    }
}
