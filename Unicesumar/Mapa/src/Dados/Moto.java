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
public class Moto extends Automovel {
    
    public Moto() {
        super(2, 0);
    }
    
    @Override
    public void acelerar() {
        if (this.motor) {
            this.velocidadeAtual += 20;  
            if (this.velocidadeAtual > 110) {
                System.out.println("Velocidade de " + this.velocidadeAtual + " acima do limite permitido.");
            }
        } else {
            System.out.println("A moto está desligada e não é possível acelerar.");
        }
}
}
