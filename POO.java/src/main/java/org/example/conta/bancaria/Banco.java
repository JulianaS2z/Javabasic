package org.example.conta.bancaria;

public class Banco {

        private String banco;
        private int agencia;
        private int numero_da_conta;
        private String tipo_de_conta;
        private String saldo_atual;
        private String limite_disponivel;

    public Banco(String banco, int agencia, int numero_da_conta, String tipo_de_conta, String saldo_atual, String limite_disponivel) {
        this.banco = banco;
        this.agencia = agencia;
        this.numero_da_conta = numero_da_conta;
        this.tipo_de_conta = tipo_de_conta;
        this.saldo_atual = saldo_atual;
        this.limite_disponivel = limite_disponivel;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero_da_conta() {
        return numero_da_conta;
    }

    public void setNumero_da_conta(int numero_da_conta) {
        this.numero_da_conta = numero_da_conta;
    }

    public String getTipo_de_conta() {
        return tipo_de_conta;
    }

    public void setTipo_de_conta(String tipo_de_conta) {
        this.tipo_de_conta = tipo_de_conta;
    }

    public String getSaldo_atual() {
        return saldo_atual;
    }

    public void setSaldo_atual(String saldo_atual) {
        this.saldo_atual = saldo_atual;
    }

    public String getLimite_disponivel() {
        return limite_disponivel;
    }

    public void setLimite_disponivel(String limite_disponivel) {
        this.limite_disponivel = limite_disponivel;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "banco='" + banco + '\'' +
                ", agencia=" + agencia +
                ", numero_da_conta=" + numero_da_conta +
                ", tipo_de_conta='" + tipo_de_conta + '\'' +
                ", saldo_atual='" + saldo_atual + '\'' +
                ", limite_disponivel='" + limite_disponivel + '\'' +
                '}';
    }
}




