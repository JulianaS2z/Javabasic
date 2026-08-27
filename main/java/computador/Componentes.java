package computador;

public abstract class Componentes {
    protected String marca;
    protected String modelo;
    private String capacidade_de_armazenamento;

    public Componentes(String marca, String modelo, String capacidade_de_armazenamento) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidade_de_armazenamento = capacidade_de_armazenamento;
    }

    public Componentes(String marca, String modelo) {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCapacidade_de_armazenamento() {
        return capacidade_de_armazenamento;
    }

    public void setCapacidade_de_armazenamento(String capacidade_de_armazenamento) {
        this.capacidade_de_armazenamento = capacidade_de_armazenamento;
    }

    @Override
    public String toString() {
        return "Componentes{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", capacidade_de_armazenamento='" + capacidade_de_armazenamento + '\'' +
                '}';
    }
}

