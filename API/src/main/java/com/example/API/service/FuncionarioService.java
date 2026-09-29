package com.example.API.service;

import com.example.API.entity.FuncionarioEntity;
import com.example.API.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository repository;

    public List<FuncionarioEntity> listarTodosFuncionarios() {
        return repository.findAll();
    }

    public FuncionarioEntity salvar(FuncionarioEntity funcionario) {
        if (repository.findByMatricula(funcionario.getMatricula()).isPresent()) {
            throw new IllegalArgumentException("funcionário já cadastrado");
        }
        return repository.save(funcionario);
    }

    public FuncionarioEntity atualizarFuncionario(Long id, FuncionarioEntity funcionario) {
        if (!repository.existsById(id)) {
            throw new IllegalArgumentException("funcionário não encontrado");
        }

        funcionario.setId(id);
        return repository.save(funcionario);
    }

    public void excluirFuncionario(Long id) {
        if (!repository.existsById(id)) {
            throw new IllegalArgumentException("funcionário não encontrado");
        }

        repository.deleteById(id);
    }

    public void salvarFuncionario(FuncionarioEntity funcionario) {
        if (repository.findByMatricula(funcionario.getMatricula()).isPresent()) {
            throw new IllegalArgumentException("funcionário já cadastrado");
        }
        repository.save(funcionario);
    }
}
