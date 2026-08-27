package computador;

public class DispositivoDeArmazenamento extends Componentes {
    private String capacidade_de_armazenamento;

    public DispositivoDeArmazenamento(String marca, String modelo, String capacidade_de_armazenamento) {
        super(marca, modelo);
        this.capacidade_de_armazenamento = capacidade_de_armazenamento;
    }

    public String getCapacidade_de_armazenamento() {
        return capacidade_de_armazenamento;
    }

    public void setCapacidade_de_armazenamento(String capacidade_de_armazenamento) {
        this.capacidade_de_armazenamento = capacidade_de_armazenamento;
    }

    @Override
    public String toString() {
        return "DispositivoDeArmazenamento{" +
                "capacidade_de_armazenamento= " + super.getCapacidade_de_armazenamento()+
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
