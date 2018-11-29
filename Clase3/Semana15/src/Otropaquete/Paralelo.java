/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Otropaquete;

/**
 *
 * @author Usuario
 */
public class Paralelo { // class Paralelo.

    private Estudiante[] estudiantes; // Lista unidimensional String de uso privado a variable estudiantes.

    public void agregar_estudiantes(Estudiante[] lista) { // Void método agregar_estudiantes y añado la lista a ingresar de la clase Estudiante.
        estudiantes = lista; // Variable estudiantes ingresa la lista.
    }

    public void presentar_datos() { // Void método presentar_datos.
        System.out.println("Lista Estudiantes"); // Imprimo el reporte.
        System.out.printf("%-30s%s\n", "Nombres", "Promedio"); // Imprimo encabezado Nombres, Promedio.
        for (int i = 0; i < estudiantes.length; i++) { // Inicio for.
            System.out.printf("%-30s%.2f\n", estudiantes[i].obtener_nombres(), estudiantes[i].obtener_promedio()); // Imprimo los estudiantes en la posición i del método obtener_valores y tambien del método obtener_promedio.
        }
        System.out.printf("Promedio del paralelo = %.2f\n", promedio_paralelo()); // Imprimo el promedio del paralelo con 2 decimales.
    }

    public double promedio_paralelo() { // Double método promedio_paralelo.
        double suma = 0; // variable double suma inicializada en 0.
        double promedio = 0; // variable double promedio inicializada en 0.

        for (int i = 0; i < estudiantes.length; i++) { // Inicio for.
            suma = suma + estudiantes[i].obtener_promedio(); // 
        }
        promedio = suma / estudiantes.length; // Calculo el promedio de todos los estudiantes.
        return promedio; // Retorna el promedio.
    }
}
