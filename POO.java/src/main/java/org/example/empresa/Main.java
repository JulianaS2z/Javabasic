package org.example.empresa;

import unidade_federativa.Sexo;

public class Main {
    static void main() {

        Funcionario funcionario1 = new Funcionario(1, "Jujubis", "R$2.220,00", Setor.GESTAO_DE_PESSOAS, Sexo.FEMININO);
        System.out.println(funcionario1);

    }
}
