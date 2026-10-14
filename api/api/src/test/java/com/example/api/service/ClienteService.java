package com.example.api.service;

import com.example.api.dto.ClienteRequestDTO;
import com.example.api.dto.ClienteResponseDTO;
import com.example.api.entity.ClienteEntity;
import com.example.api.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    // Read - GET
    public List<ClienteResponseDTO> listarTodos() {
        return repository.findAll()
                .stream()
                .map(cliente -> new ClienteResponseDTO(cliente.getNome(), cliente.getEmail(), cliente.getTelefone()))
                .toList();
    }

    // Insert - POST
    public ClienteEntity salvar(ClienteRequestDTO dto) {
        if (repository.findByEmail(dto.getEmail()).isPresent()) {
            throw new IllegalArgumentException("Cliente já cadastrado.");
        }

        ClienteEntity novoCliente = new ClienteEntity();
        novoCliente.setNome(dto.getNome());
        novoCliente.setEmail(dto.getEmail());
        novoCliente.setTelefone(dto.getTelefone());
        return repository.save(novoCliente);
    }

    // Update - PUT
    public ClienteEntity atualizar(Long id, ClienteRequestDTO dto) {
        if (!repository.existsById(id)) {
            throw new IllegalArgumentException("Cliente não encontrado.");
        }

        ClienteEntity novoCliente = new ClienteEntity();
        novoCliente.setId(id);
        novoCliente.setNome(dto.getNome());
        novoCliente.setEmail(dto.getEmail());
        novoCliente.setTelefone(dto.getTelefone());

        return repository.save(novoCliente);
    }

    public void deletar(Long id) {
        if (!repository.existsById(id))
            throw new IllegalArgumentException("Cliente não encontrado.");

        repository.deleteById(id);
    }
}