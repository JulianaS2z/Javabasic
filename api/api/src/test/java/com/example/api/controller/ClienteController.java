package com.example.api.controller;

import com.example.api.dto.ClienteRequestDTO;
import com.example.api.dto.ClienteResponseDTO;
import com.example.api.service.ClienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired

    private ClienteService service;

    @GetMapping
    public ResponseEntity<List<ClienteResponseDTO>> listarTodos() {
        return ResponseEntity
                .ok()
                .body(service.listarTodos());

    }
    @PostMapping
    public ResponseEntity<Map<?,?>>salvar(
            @Valid @RequestBody ClienteRequestDTO dto) {
        service.salvar(dto);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("Mensagem", "Cliente cadastrado com sucesso"));

    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<?,?>>atualizar(
            @PathVariable Long id,
            @Valid @RequestBody ClienteRequestDTO dto) {
        service.atualizar(id, dto);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("Mensagem", "Cliente atualizado com sucesso"));
    }

//    @DeleteMapping("/{id}")
//    public ResponseEntity<Map<?,?>>excluir(
//        service.excluir(id);
//        return ResponseEntity
//                .status(HttpStatus.OK)
//                .body(Map.of("mensagem","produto excluído com sucesso."));
//
//}
}