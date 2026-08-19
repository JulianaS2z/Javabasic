package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Notas3 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        ArrayList<Double> notas = new ArrayList<>();

        for (int i = 0; i < 2; i++) {

            double nota;

            do {
                System.out.print("Digite a " + (i + 1) + "ª nota: ");
                nota = leitor.nextDouble();

                if (nota < 0 || nota > 10) {
                    System.out.println("Nota inválida! Digite uma nota entre 0 e 10.");
                }

            } while (nota < 0 || nota > 10);

            notas.add(nota);
        }

        double mediaFinal = calcularMedia(notas.get(0), notas.get(1));

        String status = definirStatus(mediaFinal);


        System.out.println("\n--- Boletim ---");
        System.out.println("Média final: " + mediaFinal);
        System.out.println("Status: " + status);

        leitor.close();
    }

    public static double calcularMedia(double n1, double n2) {
        double calculo = (n1 + n2) / 2;
        return calculo;
    }

    public static String definirStatus(double media) {

        if (media >= 7.0) {
            return "Aprovado";

        } else if (media >= 5.0) {
            return "Verificação Suplementar";

        } else {
            return "Reprovado";
        }
    }
}

