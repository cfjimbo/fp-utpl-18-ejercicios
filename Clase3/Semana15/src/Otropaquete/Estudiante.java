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
public class Estudiante { // class Estudiante.
    private String nombres; // Cadena de uso privado variable nombres.
    private double [] notas; // Lista unidimensional double de uso privado a variable notas.
    public void agregar_nombres(String n){ // Método agregar_nombres y añado una cadena a ingresar.
        nombres = n.toUpperCase(); // variable nombres se convierte en mayúsculas todo.
    }
    public void agregar_notas(double [] nuevas_notas){ // Método agregar_notas y añado una lista double a ingresar.
        notas = nuevas_notas; // variable notas se le añade a las notas ingresadas en la lista.
    }
    public void presentar_datos(){ // Método presentar_datos.
        System.out.printf("Mi nombre es %s\n mi promedio es %f\n", nombres,obtener_promedio()); // Imprimo una cadena con las variables nombres y el método obtener_promedio.
    }
    public double obtener_promedio(){ // Método obtener_promedio double.
        double suma = 0; // variable double suma inicializada en 0.
        double promedio = 0; // variable double promedio inicializada en 0.
        for (int i = 0; i < notas.length; i++){ // Inicio for.
            suma = suma + notas [i]; // Acumulo la suma de las notas en la posición i en la variable suma.
            promedio = suma/notas.length; // Calculo el promedio de cada estudiante.
        }
        return promedio; // Retorna el promedio.
    }
    public String obtener_nombres(){ // Método obtener_nombres String (cadena).
        return nombres; // Retorna los nombres.
    }
}
