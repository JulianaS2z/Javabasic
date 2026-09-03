package org.example.industria2;

public class Gerente extends CargodeConfianca implements Contratacao {
    public Gerente(String nome, String cpf, String dataNascimento, double salarioBase, Bonificacao bonificacao) {
        super(nome, cpf, dataNascimento, salarioBase, Bonificacao.GERENTE);
    }

    public double obterSalarioFinal(){
        return this.salarioBase * this.bonificacao.getValor();
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Gerente admitindo: " + funcionario.getNome());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Gerente demitindo: " + funcionario.getNome());
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "bonificacao=" + bonificacao +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", salarioBase=" + salarioBase +
                '}';
    }

}