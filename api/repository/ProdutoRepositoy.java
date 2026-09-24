package com.example.api.repository;

import com.example.api.entity.ClienteEntity;
import com.example.api.entity.ProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProdutoRepositoy extends JpaRepository<ProdutoEntity, Long> {
    Optional<ClienteEntity> findByNome(String nome);
}
