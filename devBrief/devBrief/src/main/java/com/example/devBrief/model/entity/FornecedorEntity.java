package com.example.devBrief.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tab_fornecedor")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class FornecedorEntity {

    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String telefone;

}
