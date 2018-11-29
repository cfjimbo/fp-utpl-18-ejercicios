/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebafactura;

public class PruebaFactura {

    public static void main(String[] args) {
        Factura fact = new Factura("dos", "Es métalica con un grosor de 15 cm", 3, 12.11);
        
        System.out.println(fact.getNumPieza());
        System.out.println(fact.getDescPieza());
        System.out.println(fact.getCantArticulos());
        System.out.println(fact.getPrecioxArt());
        System.out.println(fact.obtenerMontoFactura());
    }
}
