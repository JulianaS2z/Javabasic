package org.example;
public class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        double totalComanda = 0;
        char continuar = 'S';

        System.out.println("=== SABOR & ARTE: SISTEMA DE PEDIDOS ===");

        while (continuar == 'S') {

            System.out.println("===========Cardápio============");
            System.out.println(" 1ª|Picanha        | - R$ 25,00");
            System.out.println(" 2ª|lasanha        | - R$ 20,00");
            System.out.println(" 3ª|Strogonoff     | - R$ 18,00");
            System.out.println(" 4ª|bife acebolado | - R$ 15,00");
            System.out.println(" 5ª|Pão com ovo    | - R$ 5,00");
            System.out.println("Escolha o código do prato: ");

            int codigo = scanner.nextInt();


            if (codigo == 1) totalComanda += 25.00;
            else if (codigo == 2) totalComanda += 20.00;
            else if (codigo == 3) totalComanda += 18.00;
            else if (codigo == 4) totalComanda += 15.00;
            else if (codigo == 5) totalComanda += 5.00;
            else {
                System.out.println("Código inválido!");
                continue;
            }

            System.out.println("Deseja adicionar outro prato? (S/N): ");
            continuar = scanner.next().toUpperCase().charAt(0);
        }

        System.out.println("==========TOTAL==========");

        System.out.printf("Valor Total a pagar: R$ %.2f\n", totalComanda);
        System.out.println("=========================");

        scanner.close();
    }
}
