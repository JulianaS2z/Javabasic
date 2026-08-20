package Visibilidade;

public class Clientes {


      private String nome;
      private int idade;

    public Clientes(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // MÉTODOS

        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public int getIdade() {
                return idade;
        }

        public void setIdade(int idade) {
                this.idade = idade;
        }
}
