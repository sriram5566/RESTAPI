package com.example.day1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Name {

    @GetMapping("/get")
    public String getName() {
        String studentName = "IamNeo"; 
        return "Welcome " + studentName + "!";
    }
}