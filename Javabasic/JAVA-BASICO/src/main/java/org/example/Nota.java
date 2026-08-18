package org.example;

public class Nota {
    public static void main(String[] args) {
        // Dados da Juliana
        String nome = "Juliana";
        double a = 7.6;
        double b = 5.0;
        double somaJuliana = a + b;
        double mediaJuliana = somaJuliana / 2;

        System.out.println("Aluna: " + nome);
        System.out.println("Soma: " + somaJuliana);
        System.out.println("Média: " + mediaJuliana);
        System.out.println();

        // Dados do Kaique
        String nome2 = "Kaique";
        double c = 5.0;
        double d = 5.0;
        double somaKaique = c + d;
        double mediaKaique = somaKaique / 2;

        System.out.println("Aluno: " + nome2);
        System.out.println("Soma: " + somaKaique);
        System.out.println("Média: " + mediaKaique);
    }
}

