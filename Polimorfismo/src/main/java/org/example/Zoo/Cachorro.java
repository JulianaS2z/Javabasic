package org.example.Zoo;

public class Cachorro implements Animal {

    @Override
    public String comer() {
        return "Ração Canina";
    }

    @Override
    public String emitirSom() {
        return "Wouf Wouf!!";
    }
}

