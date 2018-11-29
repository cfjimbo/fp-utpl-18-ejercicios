/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estudiar;

/**
 *
 * @author Usuario
 */
public class Persona {

    /**
     * @param args the command line arguments
     */
    String nombre;
    String apellido;
    int edad;

    public void imprimir() {
        System.out.printf("Mi nombre es: %s\n", nombre);
        System.out.printf("Mi apellido es: %s\n", apellido);
        System.out.printf("Mi  Mi edad es: %d\n", edad);
    }

    public void obtener_edad() {
        if (edad > 18) {
            edad = 18;
        }
    }
}
