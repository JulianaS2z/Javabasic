package com.example.API.service;

import com.example.API.entity.ProdutoEntity;
import com.example.API.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public List<ProdutoEntity> listarTodosProdutos() {
        return repository.findAll();
    }

    public ProdutoEntity salvar(ProdutoEntity produto) {
        if (repository.findBylote(produto.getLote()).isPresent()) {
            throw new IllegalArgumentException("produto já cadastrado");
        }
        return repository.save(produto);
    }

    public ProdutoEntity atualizarProduto(Long id, ProdutoEntity produto) {
        if (!repository.existsById(id)) {
            throw new IllegalArgumentException("produto não encontrado");
        }

        produto.setId(id);
        return repository.save(produto);
    }

    public void excluirProduto(Long id) {
        if (!repository.existsById(id)) {
            throw new IllegalArgumentException("produto não encontrado");
        }

        repository.deleteById(id);
    }

    // Correção: Agora o método executa a validação e salva no banco de dados
    public void salvarProduto(ProdutoEntity produto) {
        if (repository.findBylote(produto.getLote()).isPresent()) {
            throw new IllegalArgumentException("produto já cadastrado");
        }
        repository.save(produto);
    }
}
