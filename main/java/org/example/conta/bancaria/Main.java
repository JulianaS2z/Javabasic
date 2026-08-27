package org.example.conta.bancaria;

import org.example.endereco.Endereco;

public class Main {
    static void main() {

        Banco banco1 = new Banco("Nubank",1011,12345,"poupança","negativo","0");
        Endereco endereco1 = new Endereco("Rua dos Bobos", "0","Salvador");
        Funcionario funcionario1 = new Funcionario("11","jujubis",endereco1,"7199610-5069","juju@gmail.com",banco1);

        System.out.println(funcionario1);

    }
}
