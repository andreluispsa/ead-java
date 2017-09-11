package com.br.guanabara;

public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = true;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
        System.out.println("Ligando o controle...");
    }

    @Override
    public void desligar() {
        this.setLigado(false);
        System.out.println("Desligando o controle...");
    }

    @Override
    public void abrirMenu() {
        System.out.println("------ MENU -----");
        System.out.println("Está ligado? " + this.isLigado());
        System.out.println("Está tocando? " + this.isTocando());
        System.out.print("Volume: " + this.getVolume() + " ");
        for (int i = 0; i < this.getVolume(); i+=10) {
            System.out.print("|");
        }
        System.out.println("");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if (this.isLigado()) {
            this.setVolume((this.getVolume()+5));
            System.out.println("Aumentando volume...");
        } else {
            System.out.println("Ops... Controle desligado.");
        }
    }

    @Override
    public void menosVolume() {
        if (this.isLigado()) {
            this.setVolume(this.getVolume()-5);
            System.out.println("Diminuindo volume...");
        } else {
            System.out.println("Ops... Controle desligado.");
        }

    }

    @Override
    public void ligarMudo() {
        if (this.isLigado() && this.getVolume() > 0) {
            this.setVolume(0);
            System.out.println("Mute ligado.");
        }
    }

    @Override
    public void desligarMudo() {
        if (this.isLigado() && this.getVolume() == 0) {
            this.setVolume(50);
            System.out.println("Mute desligado.");
        }

    }

    @Override
    public void play() {
        if (this.isLigado() && !this.isTocando()) {
            this.setTocando(true);
            System.out.println("Dado PLAY com sucesso");
        }
    }

    @Override
    public void pause() {
        if (this.isLigado() && this.isTocando()) {
            this.setTocando(false);
            System.out.println("Dado PAUSE com sucesso");
        }
    }
}
