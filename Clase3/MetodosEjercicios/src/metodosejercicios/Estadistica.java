/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosejercicios;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Estadistica {

    public double obtener_promedio(double[] notas) {
        double suma = 0; // Reinicializo la variable
        for (int i = 0; i < notas.length; i++) { //Empieza el ciclo for
            suma = suma + notas[i]; // Acumulo la suma de las notas
        }
        double promedio = suma / notas.length; // Claculo promedio
        return promedio; // retorno promedio
    }

    public double obtener_mayor_nota(double[] notas) {
        double mayor = 0; // Reinicializo la variable
        for (int i = 0; i < notas.length; i++) { //Empieza el ciclo for
            if(notas[i]>mayor){ // notas en la posición i es mayor a variable mayor entonces
                mayor = notas[i]; // Encuentro el menor de las notas
            }
        }
        return mayor; // Retorno mayor
    }

    public double obtener_menor_nota(double[] notas) {
        double menor = notas[0]; // Empiezo en la posición 0
        for (int i = 0; i < notas.length; i++) { //Empieza el ciclo for
            if(notas[i]<menor){ // notas en la posición i es menor a variable menor entonces
                menor = notas[i]; // Encuentro el menor de las notas
            }
        }
        return menor; // retorno menor
    }
}
