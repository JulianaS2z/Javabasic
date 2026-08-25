package veiculo;

public class Livro {

    private String titulo;
    private String autor;
    private String isbm;
    private int numeroDepaginas;
    private double valorDeCompra;

    public Livro(String titulo, String autor, String isbm, int numeroDepaginas, double valorDeCompra) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbm = isbm;
        this.numeroDepaginas = numeroDepaginas;
        this.valorDeCompra = valorDeCompra;
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

    public String getIsbm() {
        return isbm;
    }

    public void setIsbm(String isbm) {
        this.isbm = isbm;
    }

    public int getNumeroDepaginas() {
        return numeroDepaginas;
    }

    public void setNumeroDepaginas(int numeroDepaginas) {
        this.numeroDepaginas = numeroDepaginas;
    }

    public double getValorDeCompra() {
        return valorDeCompra;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", isbm='" + isbm + '\'' +
                ", numeroDepaginas=" + numeroDepaginas +
                ", valorDeCompra=" + valorDeCompra +
                '}';
    }

    public void setValorDeCompra(double valorDeCompra) {
        this.valorDeCompra = valorDeCompra;


    }
}












