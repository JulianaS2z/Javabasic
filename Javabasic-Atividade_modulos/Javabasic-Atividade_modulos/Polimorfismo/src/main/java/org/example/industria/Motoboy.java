package org.example.industria;

public class Motoboy extends Funcionario {
    private String cnh;

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public Motoboy(String nome, String dataDeNascimento, Sexo sexo, Setor setor, double salarioBase, String cnh) {
        super(nome, dataDeNascimento, sexo, setor, salarioBase);
        this.cnh = cnh;


    }

    @Override
    public String toString() {
        return "Motoboy{" +
                "cnh='" + cnh + '\'' +
                ", nome='" + nome + '\'' +
                ", dataDeNascimento='" + dataDeNascimento + '\'' +
                ", sexo=" + sexo +
                ", setor=" + setor +
                ", salarioBase=" + salarioBase +
                ", SalaárioBase= "+this.salarioBase +
                '}';
    }
}
