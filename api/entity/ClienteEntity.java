package com.example.api.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "table_clientes")
public class ClienteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String endereco;

    @Column(nullable = false)
    private String whatssap;

    public ClienteEntity() {
    }

    public ClienteEntity(Long id, String nome, String email, String endereco, String whatssap) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.whatssap = whatssap;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getWhatssap() {
        return whatssap;
    }

    public void setWhatssap(String whatssap) {
        this.whatssap = whatssap;
    }
}
