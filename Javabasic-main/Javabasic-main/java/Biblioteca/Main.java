package Biblioteca;

public class Main {
    static void main() {

        Livro livro1 = new Livro("Pequeno Prícipe", "Leornado de Caprio", 160, 35);

        System.out.println("Titulo: "+ livro1.getTitulo());
        System.out.println("autor: "+ livro1.getAutor());
        System.out.println("Número de páginas: "+ livro1.getNumero_de_paginas());
        System.out.println("PreçoR$: "+ livro1.getPreco());

        System.out.println("=====================================");


    }
}
