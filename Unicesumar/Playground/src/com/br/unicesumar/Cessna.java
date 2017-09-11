package com.br.unicesumar;

public class Cessna extends Aviao {
    public Cessna() {
        tremDePouso = 3;
    }

    @Override
    protected void voar() {
        System.out.println("Cessna Voando...");
    }
}
