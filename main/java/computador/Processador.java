package computador;

public class Processador extends Componentes {
    private String frequencia;

    public Processador(String marca, String modelo, String capacidade_de_armazenamento, String frequencia) {
        super(marca, modelo, capacidade_de_armazenamento);
        this.frequencia = frequencia;
    }

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }

    @Override
    public String toString() {
        return "Processador{" +
                "frequencia='" + frequencia + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
