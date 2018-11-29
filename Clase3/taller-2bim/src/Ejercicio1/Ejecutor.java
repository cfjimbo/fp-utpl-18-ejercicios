/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.util.Scanner; // Importamos el objeto Scanner.

/**
 *
 * @author Usuario
 */
public class Ejecutor {

    public static void main(String[] args) { // Metodo Principal.
        ClaseDemo2 d = new ClaseDemo2(); // En d extraemos los metodos de la ClaseDemo2.
        Scanner entrada = new Scanner(System.in); // Se le asigna a la variable entrada el objeto Scanner.
        System.out.println("¿Desea agregar o restar un valor? (1/2)"); // Mensaje.
        int option = entrada.nextInt(); // Ingresa e usuario un valor entero.
        switch (option){ // Inicio del Switch.
            case 1: // En caso de ser 1.
                int x = d.ingresar_variable (); // Llamamos al metodo ingresar_variable de ClaseDemo2.
                d.agregar_sumar_valor(x); // Llamamos al metodo agregar_sumar_valor de ClaseDemo2 con un parametro x.
                d.presentar_variable(); // Llamamos al metodo presentar_variable de ClaseDemo2.
                break;
            case 2: // En caso de ser 2.
                int y = d.ingresar_variable(); // Llamamos al metodo ingresar_variable de ClaseDemo2.
                d.agregar_restar_valor(y); // Llamamos al metodo agregar_restar_valor de ClaseDemo2 con un parametro y.
                d.presentar_variable(); // Llamamos al metodo presentar_variable de ClaseDemo2.
                break;
        }
    }
}