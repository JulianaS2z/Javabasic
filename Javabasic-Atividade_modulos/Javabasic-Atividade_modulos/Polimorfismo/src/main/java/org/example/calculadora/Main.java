package org.example.calculadora;

public class Main {
    static void main() {

        double num1 = 10.0;
        double num2 = 5.0;


        OperacaoMatematica soma = new Soma();
        OperacaoMatematica subtracao = new Subtracao();
        OperacaoMatematica multiplicacao = new Multiplicacao();
        OperacaoMatematica divisao = new Divisao();


        System.out.println("Soma: " + soma.calcular(num1, num2));
        System.out.println("Subtração: " + subtracao.calcular(num1, num2));
        System.out.println("Multiplicação: " + multiplicacao.calcular(num1, num2));
        System.out.println("Divisão: " + divisao.calcular(num1, num2));
    }
}
