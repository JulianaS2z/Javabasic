package com.example.senai.service;

import com.example.senai.entity.ClienteEntity;
import com.example.senai.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository repository;

    public List<ClienteEntity> listarTodos() {
        return repository.findAll();
    }

    public ClienteEntity salvarCliente(ClienteEntity cliente) {

        if(repository.findByEmail(cliente.getEmail()).isPresent()) {
            throw new IllegalArgumentException("Cliente não encontrado.");
        }
        return repository.save(cliente);
    }
}
