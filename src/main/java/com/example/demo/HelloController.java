package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    @ResponseBody
    public String hello(@RequestParam(defaultValue = "Malek") String yourname){
        return "Greetings "+ yourname +  ", welcome to Spring Booot!";
    }
    
}
