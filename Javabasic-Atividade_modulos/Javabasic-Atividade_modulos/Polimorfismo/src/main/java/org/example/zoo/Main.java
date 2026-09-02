package org.example.zoo;

public class Main {
    static void main(){
    Cachorro cachorro = new Cachorro();
    Gato gato = new Gato();
    Galo galo = new Galo();
    Pato pato = new Pato();


        System.out.println("Cachorro: " + cachorro.emitirSom() + "\nAlimento: " + cachorro.comer() + "\n");
        System.out.println("Gato: "+ gato.emitirSom() + "\nAlimento: " + gato.comer() + "\n");
        System.out.println("Galo: "+ galo.emitirSom() + "\nAlimento: " + galo.comer() + "\n");
        System.out.println("Pato: "+ pato.emitirSom() + "\nAlimento: " + pato.comer() + "\n");
    }
}
