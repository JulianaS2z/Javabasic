package com.example.projeto.service;

import com.example.projeto.dto.ClienteResponseDTO;
import com.example.projeto.entity.ClienteEntity;
import com.example.projeto.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public List<ClienteResponseDTO> listarTodos() {
        return repository
                .findAll()
                .stream()

                .map(cliente -> new ClienteResponseDTO(cliente.getNome(), cliente.getEmail(), cliente.getTelefone()))
                .toList();
    }

    public ClienteEntity salvarCliente(ClienteResponseDTO dto) {
        // Corrigido: Usando o método findByEmail que adicionamos no Repository
        if (repository.findByEmail(dto.getEmail()).isPresent()) {
            throw new IllegalArgumentException("Cliente já cadastrado");
        }

        ClienteEntity novoCliente = new ClienteEntity();
        novoCliente.setNome(dto.getNome());
        novoCliente.setEmail(dto.getEmail());
        novoCliente.setTelefone(dto.getTelefone());

        return repository.save(novoCliente);
    }
}
