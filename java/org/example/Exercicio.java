package org.example;

public class Exercicio {
    public static void main(String[] args) {

        String nomeUsuario = "Juliana";
        int senha = 123;


        boolean resultadoNome = nomeUsuario.equals("Juliana");
        boolean resultadoSenha = (senha == 123);

        if (resultadoSenha && resultadoSenha) {
            System.out.println("Bem-vindo, usuário logado!" + resultadoNome);
        } else {
            System.out.println("Nome de usuário ou senha inválidos " + resultadoNome);
        }
    }
}