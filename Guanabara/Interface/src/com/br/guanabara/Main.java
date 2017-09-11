package com.br.guanabara;

public class Main {

    public static void main(String[] args) {
        ControleRemoto controle = new ControleRemoto();
        controle.abrirMenu();
        controle.play();
        controle.maisVolume();
        controle.ligar();
        controle.maisVolume();
        controle.abrirMenu();
    }
}
