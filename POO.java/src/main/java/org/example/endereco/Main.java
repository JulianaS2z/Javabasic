package org.example.endereco;

import java.sql.SQLOutput;

public class Main {
    static void main() {
        Endereco endereco1 = new Endereco("Rua dos Bobos", "0","Salvador");
        Cliente cliente1 = new Cliente("Juliana",22,endereco1);
        Cliente cliente2 = new Cliente("Maria",22,endereco1);


        System.out.println("========================================================");
        System.out.println("======+++++Dados do Cliente  1º++++====");
        System.out.println(cliente1);

        System.out.println("========================================================");
        System.out.println("======+++++Dados do Cliente  2º++++====");
        System.out.println(cliente2);

    }

}
