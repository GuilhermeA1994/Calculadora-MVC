
package com.mycompany.calculadora2;

import com.mycompany.calculadora2.visao.jFrTela;


public class Calculadora2 {
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFrTela().setVisible(true);
            }
        });
        
    }
    
}
