package org.example.industria3;

public class Main {
    static void main(String[] args) {

        Gerente gerente = new Gerente("Chefe","111.111.111-55","11111111111",Sexo.FEMENINO,5.000,"25/05/2004","25/05/2023",Bonificacao.DIRETOR);
        Diretor diretor = new Diretor("teste","111.111.223-33","111.111.111-55",Sexo.FEMENINO,4.4444,"25/05/2004","25/04/2004", Bonificacao.DIRETOR);
    }
}
