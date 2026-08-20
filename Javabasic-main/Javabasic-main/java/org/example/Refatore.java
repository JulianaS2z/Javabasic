package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Refatore {
    static void main() {
        Scanner ler = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();
        String resposta;

        do {
            System.out.println("Digite uma nota: ");
            double notasdigitada = ler.nextDouble();

            if(notasdigitada >=0 && notasdigitada<= 10) {
                notas.add(notasdigitada);
            } else {
                System.out.println("Nota inválida!");
                resposta = "s";
                continue;
            }
                System.out.println("Deseja inserir mais um nota?");
                System.out.println("\nPressione a tecla N para sair ou S para continuar.");

            resposta= ler.next();
        }while (!resposta.equalsIgnoreCase("n"));
        System.out.println("\nExibindo as notas");
        for (double nota: notas){
            System.out.println("Nota:"+ nota);
        }
    }
}