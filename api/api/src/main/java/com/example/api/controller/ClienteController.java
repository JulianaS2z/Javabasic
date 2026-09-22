package com.example.api.controller;


import com.example.api.entity.ClienteEntity;
import com.example.api.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/clientes")

public class ClienteController {
    @Autowired
    private ClienteRepository repository;


    @GetMapping
    public List<ClienteEntity> listarTodos() {
    return repository.findAll();
    }

    @PostMapping
    public ResponseEntity<ClienteEntity> salvar (@RequestBody
    ClienteEntity cliente) {
        repository.save(cliente);
        return ResponseEntity.created(null).body(cliente);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String,Object>> atualizar(@PathVariable Long id, @RequestBody ClienteEntity cliente){
        if (!repository.existsById(id)) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body(Map.of("mensagem", "cliente não encontrado"));

        }

        cliente.setId(id);
        repository.save(cliente);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("Mensagem", "Cliente atualizado com sucesso"));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String,Object>> delete(@PathVariable Long id) {
        if (!repository.existsById(id)) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body(Map.of("Mensagem", "Cliente não encontrado"));
        }
        repository.deleteById(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("mensagem", "Cliente deletado com sucesso"));
    }
}

