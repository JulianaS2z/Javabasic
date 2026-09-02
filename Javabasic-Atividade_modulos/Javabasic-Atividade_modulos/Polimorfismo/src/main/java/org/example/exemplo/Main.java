package org.example.exemplo;

public class Main {
    static void main() {

        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        System.out.println("Rex: "+ cachorro.emitirSom() + "\nAlimento: "+ cachorro.comer() + "\n");
        System.out.println("Simba: "+ gato.emitirSom() + "\nAlimento: "+ gato.comer() + "\n");

    }
}
