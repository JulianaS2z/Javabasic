package br.com.pet_love.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name ="tab_servicos")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class ServicoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String descricao;

    @Column(nullable = false)
    private double duracaoMinutos;

    @Column(nullable = false)
    private double preco;

    }

