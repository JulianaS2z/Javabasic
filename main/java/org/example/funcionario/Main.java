package org.example.funcionario;

public class Main {
    static void main() {
        // Instanciar classes

        Livro livro1 = new Livro ("A menina que roubava livros", "Markus Zusak",258);
        Funcionario funcionario1 = new Funcionario("Juju","115.285.245-58","25/06/2004");


        System.out.println("========Dados do Livro=========");
        System.out.println("Titulo: "+livro1.getTitulo());
        System.out.println("Autor: "+livro1.getAutor());
        System.out.println("Número de Páginas: "+livro1.getNumeroDepaginas());
        System.out.println("========++++++++++++++=========");

        System.out.println("================Dados do Funcionário====================");
        System.out.println("Nome: "+funcionario1.getNome());
        System.out.println("CPF: "+funcionario1.getCpf());
        System.out.println("Data de nascimento: "+funcionario1.getDataDeNascimento());
        System.out.println("E-mail: "+funcionario1.getEmail());
        System.out.println("====++++++++++++++==========+++++++++++++++++===========");
    }
}
