package com.example.API.repository;

import com.example.API.entity.ProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoEntity, Long> {
    Optional<ProdutoEntity> findBylote (String lote);
}
