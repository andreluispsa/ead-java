/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapa;

import Dados.Moto;
import Dados.Caminhao;
import Dados.Carro;

/**
 *
 * @author andreluisp - RA: 1504190-5
 */
public class Mapa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro c1 = new Carro();
        Moto m1 = new Moto();
        Caminhao ca1 = new Caminhao();
        
        c1.ligar();
        m1.ligar();
        ca1.ligar();
        
        c1.acelerar();
        m1.acelerar();
        ca1.acelerar();
        
        c1.acelerar();
        m1.acelerar();
        ca1.acelerar();
        
        ca1.trocarPneus();
        
        c1.exibeEstado();
        m1.exibeEstado();
        ca1.exibeEstado();
        
    }
    
}
