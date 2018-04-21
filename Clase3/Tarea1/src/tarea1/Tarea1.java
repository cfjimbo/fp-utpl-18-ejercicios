/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 *
 * @author Usuario
 */
public class Tarea1 {
public static void main (String [] args){
        Ejercicio1(3,2);
        Ejercicio2(3,2);
        Ejercicio3(3,2);
        Ejercicio4(3,2);
        Ejercicio5(3,2);
    }
    public static void Ejercicio4 (int cantidad, double precio) {
        double valor_a_pagar=cantidad*precio;
        if (cantidad==1){
           valor_a_pagar=valor_a_pagar-(valor_a_pagar*50)/100;
        }
        if (cantidad==2){
            valor_a_pagar=valor_a_pagar-(valor_a_pagar*70)/100;
        }
        if (cantidad>=3){
            valor_a_pagar=valor_a_pagar-(valor_a_pagar*80)/100;
        }
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.DOWN);
        System.out.println("Su valor final a cancelar es :" +df.format(valor_a_pagar));
}

    private static void Ejercicio1(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void Ejercicio2(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void Ejercicio3(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void Ejercicio5(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
