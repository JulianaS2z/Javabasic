package com.example.api.controller;

import com.example.api.entity.FuncionarioEntity;
import com.example.api.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
// @RC
// @RM
public class FuncionarioController {
    @Autowired
    private FuncionarioRepository repository;

    // lISTAR TODOS FUNCIONARIOS
    @GetMapping
    public List<FuncionarioEntity>ListarTodos() {
        return repository.findAll();
    }

    // INSERIR UM FUNCIONARIO
    @PostMapping
    public ResponseEntity<FuncionarioEntity> salvar(@RequestBody FuncionarioEntity funcionario) {
        repository.save(funcionario);
        return ResponseEntity.created(null).body(funcionario);
    }

}
