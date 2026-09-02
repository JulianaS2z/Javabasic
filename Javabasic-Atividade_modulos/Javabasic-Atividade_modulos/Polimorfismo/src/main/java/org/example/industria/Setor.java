package org.example.industria;

public enum Setor {
    GESTAO_DE_PESSOAS("Gestão de Pessoas"),
    FINANCEIRO ("Financeiro"),
    OPERACOES ("Operaçoes");

    private String nome;

    Setor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
