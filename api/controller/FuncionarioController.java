package com.example.api.controller;

import com.example.api.entity.FuncionarioEntitiy;
import com.example.api.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

    @RestController
    @RequestMapping("/funcionarios")
    public class FuncionarioController {

        @Autowired
        private FuncionarioRepository repository;

        @GetMapping
        public List<FuncionarioEntitiy> listarTodos() {
            return repository.findAll();
        }

        @PostMapping
        public ResponseEntity<Map<String, Object>> salvar(@RequestBody FuncionarioEntitiy funcionario) {
            repository.save(funcionario);
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(Map.of("mensagem", "Funcionário salvo com sucesso!"));
        }
    }
