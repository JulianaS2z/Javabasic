package veiculo;

public class Veiculo {

        private String placa;
        private String cor;
        private int numeroDePasageiros;
        private String VelocidadeMaxima;
        private int ConsumoMedio;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumeroDePasageiros() {
        return numeroDePasageiros;
    }

    public void setNumeroDePasageiros(int numeroDePasageiros) {
        this.numeroDePasageiros = numeroDePasageiros;
    }

    public String getVelocidadeMaxima() {
        return VelocidadeMaxima;
    }

    public void setVelocidadeMaxima(String velocidadeMaxima) {
        VelocidadeMaxima = velocidadeMaxima;
    }

    public int getConsumoMedio() {
        return ConsumoMedio;
    }

    public void setConsumoMedio(int consumoMedio) {
        ConsumoMedio = consumoMedio;
    }

    public Veiculo(String placa, String cor, int numeroDePasageiros, String velocidadeMaxima, int consumoMedio) {
        this.placa = placa;
        this.cor = cor;
        this.numeroDePasageiros = numeroDePasageiros;
        VelocidadeMaxima = velocidadeMaxima;
        ConsumoMedio = consumoMedio;


    }

    @Override
    public String toString() {
        return
                "placa='" + placa + '\n' +
                ", cor='" + cor + '\'' +
                ", numeroDePasageiros=" + numeroDePasageiros +
                ", VelocidadeMaxima='" + VelocidadeMaxima + '\'' +
                ", ConsumoMedio=" + ConsumoMedio +
                '}';
    }
}
