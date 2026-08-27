package org.example.empresa;

import unidade_federativa.Sexo;

public class Funcionario {
    private int id;
    private String nome;
    private String salario;
    private Setor setor;
    private Sexo sexo;

    public Funcionario(int id, String nome, String salario, Setor setor, Sexo sexo) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.setor = setor;
        this.sexo = sexo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id: "  + id + "\n" +
                "nome:  " + nome + "\n" +
                "salario: "+ salario + "\n" +
                "setor:  " + setor + "\n" +
                "sexo: " + sexo;
    }
}
