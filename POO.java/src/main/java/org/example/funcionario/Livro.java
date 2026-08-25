package org.example.funcionario;

public class Livro {

    private String titulo;
    private String autor;
    private int numeroDepaginas;
    private double preco;

    public Livro(String titulo, String autor, int numeroDepaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDepaginas = numeroDepaginas;
        this.preco = preco;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroDepaginas() {
        return numeroDepaginas;
    }

    public void setNumeroDepaginas(int numeroDepaginas) {
        this.numeroDepaginas = numeroDepaginas;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}












