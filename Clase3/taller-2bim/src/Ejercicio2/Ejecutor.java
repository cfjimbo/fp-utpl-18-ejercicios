/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author Usuario
 */
public class Ejecutor {
    public static void main(String[] args) { // Principal
        int calificaciones[][] = { { 187, 196, 170, 100 }, // Calificaciones. Arreglo Bidimensional.
        { 168, 187, 190, 200 },
        { 194, 100, 190, 150 },
        { 100, 181, 182, 0 },
        { 183, 165, 185, 10 },
        { 178, 187, 165, 123 },
        { 185, 175, 183, 111 },
        { 191, 194, 100, 200 },
        { 176, 172, 184, 100 },
        { 187, 193, 173, 200} };
        ClaseDemo3 d = new ClaseDemo3(); // En d extraemos los metodos de la ClaseDemo3.
        d.agregar_calificaciones(calificaciones); // Se llama al metodo agregar_calificaciones y se le envia como parametro calificaiones.
        System.out.printf("La nota más alta de la matriz es: %d\n", d.obtener_calificacion_alta()); // Se presenta un mensaje en el resultado del metodo obtener_calificacion_alta y la calificación más alta.
        System.out.printf("La nota más baja de la matriz es: %d\n", d.obtener_calificacion_baja()); // Se presenta un mensaje en el resultado del metodo obtener_calificacion_baja y la calificación más baja.
        d.presentar_distribucion(); // Se llama al metodo presentar_distribucion
    }
}