package org.example.industria3;

public enum Bonificacao {
    GERENTE(1.2),
    DIRETOR(1.4);

    private double valor;

    public double getValor() {
        return valor;
    }

    Bonificacao(double valor) {
        this.valor = valor;


    }
}