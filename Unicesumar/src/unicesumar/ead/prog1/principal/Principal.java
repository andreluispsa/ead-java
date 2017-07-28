package unicesumar.ead.prog1.principal;

import java.util.Date;
import unicesumar.ead.prog1.dados.Pessoa;

public class Principal {

    public static void main(String[] args) {
        
        Pessoa pes = new Pessoa();
        Pessoa pes2 = new Pessoa("João", "(11) 932323233", 13);
        System.out.println(pes.mostrarDados());
        System.out.println(pes2.mostrarDados());
        System.out.println("#####################");
        pes.nome = "Maria";
        pes2.idade = 15;
        System.out.println(pes.mostrarDados());
        System.out.println(pes2.mostrarDados());
        System.out.println("#####################");
        
        //exemplo do uso do FOR
        int j = 0;
        for (int i = 0; i < 10; i++) {
            j = j + (1 * i);
            System.out.println("J = " + j);
        }
        
        //exemplo do uso do WHILE
        int i = 2;
        while (i < 20) {
            System.out.println("i = " + i);
            i = i + 2;
        }       
        
        //exemplo do uso do DO-WHILE
        i = 3;
        do {
            System.out.println("i = " + i);
            i = i + 2;
        } while (i < 30);
        
        Date data = new Date();
        System.out.println(data.toString());
    }
   
    
}
