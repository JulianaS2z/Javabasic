package com.example.api.repository;

import com.example.api.entity.FuncionarioEntitiy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface FuncionarioRepository extends JpaRepository<FuncionarioEntitiy, Long> {
}
