/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guanabara;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Locale;

/**
 *
 * @author andreluisp
 */
public class Guanabara {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Locale loc = Locale.getDefault();
        System.out.println(loc.getDisplayLanguage());
        System.out.println(loc.getLanguage());
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println(d.width + " X " + d.height);
        
    }
    
}
