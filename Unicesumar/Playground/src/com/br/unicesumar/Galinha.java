package com.br.unicesumar;

public class Galinha extends Animal implements TemFome {

    @Override
    public String getNome() {
        return "Galinha";
    }
    @Override
    public void comer() {
        System.out.println("Galinha comendo milho");
    }
    @Override
    public void comerMuito() {
        System.out.println("Galinha comendo muito milho");
    }

}
