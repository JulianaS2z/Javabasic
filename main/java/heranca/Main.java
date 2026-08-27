package heranca;

public class Main {
    static void main() {


        Cliente cliente1 = new Cliente("Juju", 20, "10/12/2026", Forma_de_pagamento.DEBITO);
        Funcionario funcionario1 = new Funcionario("Juju2",22,2,"ADM","2.220,00");

        System.out.println(cliente1);
        System.out.println(funcionario1);

    }
}
