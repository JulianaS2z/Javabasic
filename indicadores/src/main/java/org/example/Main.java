package org.example;

public class Main {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int totalPessoas = 0;
        double somaSalarios = 0;
        int maiorIdade = 0;
        int menorIdade = 999;
        int mulheresSalarioAlto = 0;

        char continuar = 'S';

        System.out.println("=== Indicadores Estatísticos ===");

        while (continuar == 'S') {

            System.out.println("\n===========Indicadores regionais via menu de console======");
            System.out.println(" 1ª|Adicionar Pessoa  | ");
            System.out.println(" 2ª|Exibir resultados | ");
            System.out.println(" 3ª|Sair | ");
            System.out.print("> Escolha uma opção: ");

            int codigo = scanner.nextInt();

            if (codigo == 1) {

                System.out.print("Digite sua idade: ");
                int idade = scanner.nextInt();

                // VALIDAÇÃO: Bloqueia menores de 18 anos
                while (idade < 18) {
                    System.out.println("Acesso negado (Apenas maiores de 18 anos).");
                    System.out.print("Digite sua idade novamente: ");
                    idade = scanner.nextInt();
                }

                System.out.print("Informe seu sexo (M/F): ");
                char sexo = scanner.next().toUpperCase().charAt(0);

                System.out.print("Informe seu Salário: ");
                double salario = scanner.nextDouble();

                totalPessoas++;
                somaSalarios += salario;

                if (idade > maiorIdade) {
                    maiorIdade = idade;
                }
                if (idade < menorIdade) {
                    menorIdade = idade;
                }
                if (sexo == 'F' && salario >= 5000.00) {
                    mulheresSalarioAlto++;
                }

                System.out.println("> Registro incluído. Retornando ao menu...");
            } else if (codigo == 2) {
                System.out.println("\n========== RESULTADOS ==========");
                if (totalPessoas == 0) {
                    System.out.println("Nenhuma pessoa cadastrada ainda.");
                } else {
                    double mediaSalarial = somaSalarios / totalPessoas;
                    System.out.printf("• Média salarial do grupo: R$ %.2f\n", mediaSalarial);
                    System.out.println("• Maior idade registrada: " + maiorIdade);
                    System.out.println("• Menor idade registrada: " + menorIdade);
                    System.out.println("• Mulheres com salário >= R$ 5.000,00: " + mulheresSalarioAlto);
                }
                System.out.println("=============================================");
            } else if (codigo == 3) {
                System.out.println("Encerrando o sistema...");
                break;
            } else {
                System.out.println("Código inválido!");
                continue;
            }

            System.out.print("Deseja voltar ao menu? (S/N): ");
            continuar = scanner.next().toUpperCase().charAt(0);
        }

        System.out.println("Finalizado, até a próxima!");
        scanner.close();
    }
}
