package org.example.funcionario;

public class Medico extends Funcionario {
    private String crm;

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public Medico(String email, Endereco endereco, String nome, float salario, String crm) {
        super(email, endereco, nome, salario);
        this.crm = crm;


    }

    @Override
    public String toString() {
        return "Medico{" +
                "crm='" + crm + '\'' +
                ", email='" + email + '\'' +
                ", endereco=" + endereco +
                ", nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}