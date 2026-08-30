package org.example.funcionario;

public class Engenheiro extends Funcionario {
    private String crea;

    public Engenheiro(String email, Endereco endereco, String nome, float salario, String crea) {
        super(email, endereco, nome, salario);
        this.crea = crea;
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    @Override
    public String toString() {
        return "Engenheiro{" +
                "crea='" + crea + '\'' +
                ", email='" + email + '\'' +
                ", endereco=" + endereco +
                ", nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}