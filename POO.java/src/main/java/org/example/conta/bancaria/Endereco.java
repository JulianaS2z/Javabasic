package org.example.conta.bancaria;

public class Endereco {

    private String  Logradouro;
    private String  numero;
    private String  cidade;

    public Endereco(String logradouro, String numero, String cidade) {
        Logradouro = logradouro;
        this.numero = numero;
        this.cidade = cidade;
    }

    public String getLogradouro() {
        return Logradouro;
    }

    public void setLogradouro(String logradouro) {
        Logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "Logradouro='" + Logradouro + '\'' +
                ", numero='" + numero + '\'' +
                ", cidade='" + cidade + '\'' +
                '}';
    }
}






