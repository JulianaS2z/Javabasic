package org.example;

import java.util.Scanner;

public class Vetores {
    static void main() {
        double somar1 = 0;
        int contar = 0;
        Scanner ler = new Scanner(System.in);
        double[] notas = new double[2];

        for (int i = 0; i < 2; i++) {
            boolean rodando = true;


            while (rodando) {
                System.out.print("Digite a " + (i + 1) + "ª nota (0 a 10): ");
                double notaDigitada = ler.nextDouble();
                ler.nextLine();


                if (notaDigitada >= 0 && notaDigitada <= 10) {
                    notas[i] = notaDigitada;
                    somar1 += notaDigitada;
                    contar++;
                    rodando = false;
                } else {
                    System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
                }
            }
        }


        System.out.println("\nExibindo as notas gravadas: ");
        for (double nota : notas) {
            System.out.println("Nota: " + nota);
        }

        System.out.println("\nMedia: " + (somar1 / contar));
        ler.close();
    }
}