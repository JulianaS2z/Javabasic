package org.example.conta.bancaria;

import org.example.endereco.Endereco;

public class Funcionario {

    private String codigo_do_funcionario;
    private String nome;
    private Endereco endereco;
    private String telefone;
    private String email;
    private Banco banco;

    public Funcionario(String codigo_do_funcionario, String nome, Endereco endereco, String telefone, String email, Banco banco) {
        this.codigo_do_funcionario = codigo_do_funcionario;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.banco = banco;
    }

    public String getCodigo_do_funcionario() {
        return codigo_do_funcionario;
    }

    public void setCodigo_do_funcionario(String codigo_do_funcionario) {
        this.codigo_do_funcionario = codigo_do_funcionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }
    @Override
    public String toString() {
        return "codigo_do_funcionario: " + codigo_do_funcionario + "\n" +
                "nome: " + nome + "\n" +
                "endereco: " + endereco + "\n" +
                "telefone: " + telefone + "\n" +
                "email: " + email + "\n" +
                "banco: " + banco;
    }
}