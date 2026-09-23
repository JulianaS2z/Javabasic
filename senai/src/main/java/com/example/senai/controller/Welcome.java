package com.example.senai.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

    @GetMapping("/")
    public String bemVindo() {
        return "Bem-vindo!";

    }

    @GetMapping("Dev/")
    public String dev() {
        return "Feito: Jujubis";
    }
}