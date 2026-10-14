package com.example.api.repository;

import com.example.api.entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {
    Optional<ClienteEntity> findByEmail(String email);
}
