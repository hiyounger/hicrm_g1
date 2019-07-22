package com.jingtang.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("hello")
    public String hello(){
        return "holy 23";
    }
    @GetMapping("test")
    public String test(){
        return "te2s3242222t";
    }

    @GetMapping("t")
    public String test1(){
        return "test";
    }

    @GetMapping("t2")
    public String test12(){
        return "tes22t";
    }


    @GetMapping("t3")
    public String test13(){
        return "tes2233t";
    }
}
