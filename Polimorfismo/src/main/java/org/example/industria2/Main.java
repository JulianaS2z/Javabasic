package org.example.industria2;

public class Main {
    static void main(String[] args) {

        Motoboy motoboy = new Motoboy("Nilson", "545.545.321-71", "25/04/2004", 55.550, "A54B");
        Gerente gerente = new Gerente("Maria", "123.345.55-69", "13/12/2002", 4.000, Bonificacao.DIRETOR);

        System.out.println(motoboy);
        System.out.println(gerente);

        System.out.println("--------Teste de Operações--------");
        gerente.admitir(motoboy);
        gerente.demitir(motoboy);



    }

}
