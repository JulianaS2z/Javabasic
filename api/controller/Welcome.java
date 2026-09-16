package com.example.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//RC
@RestController
public class Welcome {
    @GetMapping("/")
    public String bemVindo() {
        return "Bem-vindo";
    }

    @GetMapping("/DEV")
    public String dev() {
        return "Feito por: Jujubis";
    }
}

