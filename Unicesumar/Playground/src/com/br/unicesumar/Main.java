package com.br.unicesumar;

public class Main {

    public static void main(String[] args) {

        Pessoa ellen = new Pessoa();
        ellen.nome = "Ellen";
        ellen.idade = 29;

        Pessoa paula = new Pessoa();
        paula.nome = "Paula";
        paula.idade = 36;

        paula = ellen;
        ellen.idade = 15;

        paula.falar();
    }
}
