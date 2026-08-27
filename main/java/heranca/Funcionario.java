package heranca;

public class Funcionario extends Pessoa {
    private int matricula;
    private String Cargo;
    private String Salario;

    public Funcionario(String nome, int idade, int matricula, String cargo, String salario) {
        super(nome, idade);
        this.matricula = matricula;
        Cargo = cargo;
        Salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        Cargo = cargo;
    }

    public String getSalario() {
        return Salario;
    }

    public void setSalario(String salario) {
        Salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome= "+ super.getNome()+
                "idade= "+ super.getIdade()+
                "matricula=" + matricula +
                ", Cargo='" + Cargo + '\'' +
                ", Salario='" + Salario + '\'' +
                '}';
    }
}



