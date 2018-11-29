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
public class ClaseDemo3 {

    int[][] calificaciones; // variable global

    public void agregar_calificaciones(int[][] c) { // Ingreso un arreglo entero bidimensional c
        this.calificaciones = c; // 
    }

    public int obtener_calificacion_baja() { // Empezamos con la primera parte del Reporte. int
        int lim = calificaciones.length;
        int min = calificaciones[0][0];

        for (int i = 0; i < lim; i++) { // Inicio for
            for (int j = 0; j < calificaciones[i].length; j++) { // Inicio 2do for

                if (calificaciones[i][j] < min) { // Condición. Calificaciones en la posicion i,j deben ser menor a min para determinar la minima calificacion.
                    min = calificaciones[i][j];
                }
            }
        }

        return min; // Retorna el valor min (entero)
    }

    public int obtener_calificacion_alta() { // Empezamos con la seguda parte del Reporte. int
        int lim = calificaciones.length; // entero lim igual a la cantidad de valores en calificaciones
        int max = 0; // reinicializo la variable

        for (int i = 0; i < lim; i++) { // Inicio for
            for (int j = 0; j < calificaciones[i].length; j++) { // Inicio 2do for
                if (calificaciones[i][j] < max) { // Condición. Calificaciones en la posicion i,j deben ser menor a max para determinar la máxima calificacion.
                    max = calificaciones[i][j];
                }
            }
        }
        return max; // Retorna el valor max (entero).
    }

    public void presentar_distribucion() { // Empezamos con la 3ra parte del Reporte. Distribución.
        /*
        Se declara un contador para cada intervalo
         */

        int p = 0, o = 0, i = 0, u = 0, y = 0, t = 0, r = 0, e = 0, w = 0, q = 0, l = 0, k = 0; // Variables que se reinicializan

        for (int fila = 0; fila < calificaciones.length; fila++) { // Comparamos el Primer for con fila y la cantidad de valores de calificaciones.
            for (int columna = 0; columna < calificaciones[fila].length; columna++) { // Comparamos el 2do for con columna y la cantidad de valores de calificaciones en la posición fila.
                int v = calificaciones[fila][columna]; // Variable entera en arreglo bidimensional.

                if (v <= 100) { // Condiciones para los rangos presentados.
                    p += 1;
                } else if (v > 100 && v <= 110) {
                    o += 1;
                } else if (v > 110 && v <= 120) {
                    i += 1;
                } else if (v > 120 && v <= 130) {
                    u += 1;
                } else if (v > 130 && v <= 140) {
                    y += 1;
                } else if (v > 140 && v <= 150) {
                    t += 1;
                } else if (v > 150 && v <= 160) {
                    r += 1;
                } else if (v > 160 && v <= 170) {
                    e += 1;
                } else if (v > 170 && v <= 180) {
                    w += 1;
                } else if (v > 180 && v <= 190) {
                    q += 1;
                } else if (v > 190 && v < 200) {
                    l += 1;
                } else if (v >= 200) {
                    k += 1;
                }

            } // Fin Primer for
        }// Fin 2do for
        // Luego presenta el numero de calificaciones en cada intervalo.
        System.out.printf("0-100: %d\n100-109: %d\n110-119: %d\n120-129: %d\n130-139: %d\n"
                + "140-149: %d\n150-159: %d\n160-169: %d\n170-179: %d\n180-189: %d\n"
                + "190-199: %d\n200: %d\n", p, o, i, u, y, t, r, e, w, q, l, k);
    }
}
