package com.example.newyatra;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


public class car{
    @GetMapping("/mycar")
    public String getData(){
        return "Please book your ticket";
    }

}