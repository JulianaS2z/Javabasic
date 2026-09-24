package com.example.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Welcome {

@RequestMapping("/")
    public String  bemVindo(){
    return "Bem-Vindo";
}

}
