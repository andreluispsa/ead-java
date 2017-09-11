package com.br.unicesumar;


public class Main {

    static void mandarParaFazenda(Animal animal) {
            System.out.println("O animal " + animal.getNome() + " está na fazenda");
    }
    static void alimentar(TemFome algoQueTemFome) {
            algoQueTemFome.comer();
    }
    static void fazerFrangoAssado(Galinha galinha) {
            System.out.println("Fazendo frango assado");
    }

    public static void main(String[] args) {
/*        Cessna c = new Cessna();
        c.voar();*/
        Galinha galinha = new Galinha();
        mandarParaFazenda(galinha);
        alimentar(galinha);
        fazerFrangoAssado(galinha);
    }
}
