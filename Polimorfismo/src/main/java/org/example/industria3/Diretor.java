package org.example.industria3;

import org.example.industria2.Bonificacao;

public class Diretor extends CargoDeConfianca implements Contratacao{
    private final double PREMIO = 1.1;

    public Diretor(String nome, String cpf, String rg, Sexo sexo, double salarioBase, String dataNascimento, String dataAdmissao, Bonificacao bonificacao) {
        super(nome, cpf, rg, sexo, salarioBase, dataNascimento, dataAdmissao, bonificacao);
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "PREMIO=" + PREMIO +
                ", bonificacao=" + bonificacao +
                '}';
    }

    public double getPREMIO() {
        return PREMIO;

    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Admitir Funcionário: "+ funcionario.getNome());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Demitir Funcionário: "+ funcionario.getNome());

    }
}
