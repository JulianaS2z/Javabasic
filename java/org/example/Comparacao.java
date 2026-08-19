package org.example;

public class Comparacao {
    public static void main (String[] args) {

        String nomeUsuario = "Juliana";
        int senha = 123;

        boolean resultadoNome = nomeUsuario.equals("Juliana");
        boolean resultadoSenha = (senha == 123);

        System.out.println("O nome do usuario está correto? " + resultadoNome);
        System.out.println("A senha está correta? " + resultadoSenha);
    }
}
