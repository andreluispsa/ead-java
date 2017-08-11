package com.br.udemy.javamasterclass;

public class PC {

    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawlogo();
    }

    private void drawlogo() {
        //Fancy Graphics
        monitor.drawPixelAt(50,100,"red");
    }

}
