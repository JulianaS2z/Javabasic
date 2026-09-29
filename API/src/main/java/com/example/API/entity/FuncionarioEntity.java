package com.example.API.entity;

    import jakarta.persistence.*;
    import lombok.AllArgsConstructor;
    import lombok.Data;
    import lombok.NoArgsConstructor;

    @Entity
    @Table(name = "tab_funcionario")
    @Data
    @NoArgsConstructor
    @AllArgsConstructor

    public class FuncionarioEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String matricula;

    @Column(nullable = false)
    private String endereco;

    @Column(nullable = false)
    private int idade;

    @Column(nullable = false)
    private double salario;

    }
