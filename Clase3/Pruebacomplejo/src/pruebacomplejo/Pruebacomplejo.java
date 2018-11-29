/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacomplejo;

public class Pruebacomplejo {

    public static void main(String[] args) {
        
        Complejo a = new Complejo(1.0, 1.0);
        Complejo b = new Complejo(3.0, 3.0);
        Complejo c;
        
        c = a.sumar(b);
        System.out.println(a + " + " + b + " = " + c);
        c = a.restar(b);
        
        if (b.equals(c)) {
            System.out.println(b + " igual que " + c);
        } else {
            System.out.println(b + " distinto que " + c);
        }
    }
}
