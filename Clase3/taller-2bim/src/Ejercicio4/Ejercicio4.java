/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

/**
 *
 * @author Usuario
 */
public class Ejercicio4 {

    // Arreglos globales.
    int[][] productos;
    double[] precios;

    public void Agregar_Valores(int[][] c, double[] d) { // Metodo que guarda los valores recibidos en los arreglos.
        this.productos = c;
        this.precios = d;
    }

    public void Agregar_Reporte() { // Metodo que permite generar el reporte.
        
        double total_ventas = 0; // Variables locales e inicializadas.
        String cadena = String.format("\n%60s\n\n%s\n\n", "****Reporte de Ventas****", "Precio Unitario de los productos"); // Valor inicial de la variable 'cadena' ****Reporte de Ventas****.

        for (int contador = 0; contador < this.precios.length; contador++) { // Inicio el Primer for.
            cadena = String.format("%s%s %d: %.2f\n", cadena, "Producto", contador + 1, precios[contador]); // Cambio local de la variable 'cadena'.
        }
        cadena = String.format("%s\n%25s%15s%15s%15s%15s%15s\n\n", cadena, "Prod1", "Prod2", "Prod3", "Prod4", "Prod5", "Prod6"); // Cambio local de la variable 'cadena'.

        for (int filas = 0; filas < this.productos.length; filas++) { // Inicio el 2do for.
            // Variables locales inicializadas. Float or Double.
            double suma = 0;
            double total = 1;

            cadena = String.format("%s%s %-11d", cadena, "Vendedor", filas + 1); // Cambio local de la variable 'cadena'.

            for (int columnas = 0; columnas < this.productos[filas].length; columnas++) { // Inicio el 3er for.
                total = this.precios[filas] * this.productos[filas][columnas];// Multiplica el precio unitario de cada producto por la cantidad de cada producto en filas, columnas y se guarda en la variable total.
                suma = suma + total;
                cadena = String.format("%s%-15.2f", cadena, total); // Cambio local de la variable 'cadena'.
            }
            total_ventas = total_ventas + total; // Acumula los totales de ventas.
            cadena = String.format("%s%s %d: %.2f\n", cadena, "Tot. Vendedor", filas + 1, suma); // Cambio local de la variable 'cadena'.
        }
        cadena = String.format("%s\n%s%.2f", cadena, "El total de las ventas es: ", total_ventas); // Valor final de la variable 'cadena'.
        System.out.println(cadena); // Presenta en pantalla la variable 'cadena'.
    }
}
