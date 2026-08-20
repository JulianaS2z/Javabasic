package org.example;

public class Nota2 {
    public static void main(String[] args) {
        String nome = "Juliana";
        double a = 5.6;
        double b = 5.0;
        double c = 5.0;

        double soma = (a + b + c);
        double media = soma / 3;

        if (media >= 7) {
            System.out.println("Aluno aprovado");
        } else if (media >= 5) {
            System.out.println("Aluno verificação suplementar");
        } else {
            System.out.println("Aluno Reprovado");
        }
    }
}

