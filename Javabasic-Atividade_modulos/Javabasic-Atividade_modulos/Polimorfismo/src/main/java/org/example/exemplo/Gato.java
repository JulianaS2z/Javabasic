package org.example.exemplo;

public class Gato implements Animal{
    @Override
    public String emitirSom() {
        return "Miauu";
    }

    @Override
    public String comer() {
        return "Ração Felina";
    }
}
