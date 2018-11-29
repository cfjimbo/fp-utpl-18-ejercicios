/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.util.Scanner; // Importamos el objeto Scanner.

public class ClaseDemo2 {

    int suma; // Variable global.

    public void presentar_variable() { // Metodo void para presentar la variable.
        System.out.printf("%d\n", suma); // Mensaje.
    }
    public int ingresar_variable(){ // Metodo entero para ingresar la variable.
        Scanner entrada = new Scanner(System.in); // Se le asigna a la variable entrada el objeto Scanner.
        System.out.println("Ingrese un valor"); // Mensaje.
        int n = entrada.nextInt(); // Ingresa un valor entero.
        return n; // Retorna n variable entero.
    }

    public void agregar_restar_valor(int x) { // Metodo para restar el valor.
        suma = suma - x; // Resta. Proceso.
    }
    public void agregar_sumar_valor(int x) { // Metodo void para agregar el valor.
        suma = suma + x; // Suma. Proceso.
    }
}
