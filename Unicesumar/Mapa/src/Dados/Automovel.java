/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

/**
 *
 * @author andreluisp - RA: 1504190-5
 */
public class Automovel {
    public boolean motor; /* atributo que identifica se o motor está ligado ou desligado */
    public int rodas; /* atributo que define o número de rodas */
    public int portas; /* atributo que define o número de portas */
    public int velocidadeAtual; /* atributo que define a velocidade atual */
    public String fabricante; /* atributo que define o fabricante do automóvel */
    public String modelo; /* atributo que define o modelo do automóvel */
    public static final double VALOR_PNEU = 150.00;
    
    /* método construtor que define automaticamente o motor para desligado e velocidade para zero 
       sem passar por parâmetro os outros atributos criados especificamente por mim */
    
    public Automovel(int rodas, int portas) {
        this.motor = false;
        this.rodas = rodas;
        this.portas = portas;
        this.velocidadeAtual = 0;
        this.fabricante = "";
        this.modelo = "";
    }
    
    public void ligar() {
        this.motor = true;
    }
    
    public void desligar() {
        this.motor = false;
    }
    
    public void acelerar() {
    }
    
    public void diminuir() {
    }
    
    public void trocarPneus() {
        System.out.println("O valor para a troca de pneus é de R$ " + (this.rodas * VALOR_PNEU));
    }
    
    public void cadastraFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    
    public void cadastraModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void exibeEstado() {
        if (this.motor) {
            System.out.println("O veículo está ligado e possui velocidade atual de " + this.velocidadeAtual + "km/h.");
        } else {
            System.out.println("O veículo está desligado.");
        }
    }
}
