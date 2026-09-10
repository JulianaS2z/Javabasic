package com.example.api.controller;

import com.example.api.entity.ClienteEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import repository.ClienteRepository;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository repository;

    @GetMapping("/clientes")
        public List<ClienteEntity> listarTodos() {

        return repository.findAll();
    }
    @PostMapping("clientes")
    public ResponseEntity<ClienteEntity> salvar(@RequestBody ClienteEntity cliente ){
        repository.save(cliente);
        return ResponseEntity.created(null).body(cliente);
    }
}
