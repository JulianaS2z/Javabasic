package com.example.projeto.controller;

import com.example.projeto.dto.ClienteResponseDTO;
import com.example.projeto.service.ClienteService;
import jakarta.validation.Valid;
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
    private ClienteService service;

    @GetMapping
    public ResponseEntity<List<ClienteResponseDTO>> listar() {
        return ResponseEntity
                .ok()
                .body(service.listarTodos());
    }

    @PostMapping
    public ResponseEntity<Map<String, String>> salvar(@Valid @RequestBody ClienteResponseDTO dto) {
        service.salvarCliente(dto);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("Mensagem", "Cliente cadastrado com sucesso"));
    }
}
