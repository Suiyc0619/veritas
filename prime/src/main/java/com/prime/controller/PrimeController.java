package com.prime.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeController {
    public String prime(){
        return "这是一个SpringBoot项目的完美开端！";
    }
}
