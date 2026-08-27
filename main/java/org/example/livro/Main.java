package org.example.livro;

public class Main {
    static void main() {

        Livro livro1 = new Livro("Pequeno Principe", "Antoine de Saint-Exupéry.", 125, 25.50);

        System.out.println("titulo: " + livro1.getTitulo());
        System.out.println("autor: " + livro1.getAutor());
        System.out.println("Número de páginas: " + livro1.getNumeroDepaginas());
        System.out.println("Preço: " + livro1.getPreco());
    }
}
