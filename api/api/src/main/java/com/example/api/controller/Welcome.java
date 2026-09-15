package com.example.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class Welcome {

        @RequestMapping("/")
        public String mensagem() {
            return "Bem-vindo!";

        }

        @RequestMapping("/dev")
        public String dev() {
            return "Feito por: Juliana Santos";
        }

        @RequestMapping("/turma")
        public String turma() {
            return "turma: 99160";
        }

        @RequestMapping("/curso")
        public String curso() {
            return "curso de ADS";
        }
    }
