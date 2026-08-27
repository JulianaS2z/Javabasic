package computador;

public class Placa_mae extends Componentes{
    private String soquete;

    public Placa_mae(String marca, String modelo, String capacidade_de_armazenamento, String soquete) {
        super(marca, modelo, capacidade_de_armazenamento);
        this.soquete = soquete;
    }

    public String getSoquete() {
        return soquete;
    }

    public void setSoquete(String soquete) {
        this.soquete = soquete;
    }

    @Override
    public String toString() {
        return "Placa_mae{" +
                "soquete='" + soquete + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
