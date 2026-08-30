package org.example.funcionario;

public class Main {
    static void main(String[] args) {

        Endereco end1 = new Endereco("404-84555", "Salvador", "Casa", "Rua dos bobos", "0");
        Endereco end2 = new Endereco("555-8545", "São Paulo", "Apartamento", "Rua dos loucos", "10");

        Engenheiro engenheiro1 = new Engenheiro("Maria@email.com", end1, "Maria", 55555, "CREA/BA 11223");
        Medico medico1 = new Medico("Nilson@gmail.com", end2, "Nilson",5750,"CRM 123124");

        System.out.println("===+++++ ENGENHEIRO ++++++===");
        System.out.println(engenheiro1);

        System.out.println("\n===+++++ MÉDICO +++++++===");
        System.out.println(medico1);
    }
}




