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
public class Caminhao extends Automovel {
    
    public Caminhao() {
        super(4, 2);
    }

    @Override
    public void acelerar() {
        if (this.motor) {
            this.velocidadeAtual += 5;
            if (this.velocidadeAtual > 80) {
                System.out.println("Velocidade de " + this.velocidadeAtual + " acima do limite permitido.");
            }
        } else {
            System.out.println("O Caminhão está desligado e não é possível acelerar.");
        }
    }
    
}
