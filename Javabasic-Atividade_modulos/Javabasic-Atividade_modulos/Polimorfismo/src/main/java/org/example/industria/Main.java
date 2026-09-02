package org.example.industria;

public class Main {
    static void main() {

        Motoboy motoboy = new Motoboy("Juju", "25/06/2004",Sexo.FEMININO,Setor.GESTAO_DE_PESSOAS,2.220,"a");
        Diretor diretor = new Diretor("Maria","30/04/2004",Sexo.FEMININO,Setor.GESTAO_DE_PESSOAS,5.500);

        System.out.println(motoboy);
        System.out.println(diretor);
    }
}
