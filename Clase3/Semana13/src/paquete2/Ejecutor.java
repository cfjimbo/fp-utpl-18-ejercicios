/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
/**
 *
 * @author Usuario
 */
public class Ejecutor {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.presentar_variable();
        d.agregar_valor (20);
        d.agregar_valor (10, 2);
        d.presentar_variable();
        d.agregar_valor (20,3);
        d.agregar_valor();
        d.presentar_variable ();
}
}
