/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

import java.util.Scanner; // Importamos el objeto Scanner.

/**
 *
 * @author Usuario
 */
public class Ejecutor {

    public static void main(String[] args) {
        Ejercicio4 d = new Ejercicio4(); // Creamos el objeto de tipo Ejercicio4.
        Scanner entrada = new Scanner(System.in); // Importamos el objeto Scanner.

        int[][] productos = new int[5][6]; // Arreglo global bidimensional. Entero.
        double[] precios = new double[6]; // Arreglo global unidimensional. Double or Float.

        System.out.printf("\n%30s\n", "**Registro de Costos**"); // Mensaje.

        for (int contador = 0; contador < precios.length; contador++) { // Inicio Primer for.
            System.out.printf("\nProducto %d: ", contador + 1); // Mensaje del Producto.
            System.out.printf("\n\tPrecio Unitario: "); // Mensaje del Precio Unitario.
            precios[contador] = entrada.nextDouble(); // Ingresa el usuario.
        }

        System.out.printf("\n%30s\n", "**Cantidad de Productos**"); // Mensaje.

        for (int filas = 0; filas < productos.length; filas++) { // Inicio Primer for.
            System.out.printf("\nVendedor %d\n", filas + 1); // Mensaje del Vendedor.
            for (int columnas = 0; columnas < productos[filas].length; columnas++) { // Inicio el 2do for.
                System.out.printf("\tProducto %d: ", columnas + 1); // Mensaje del Producto.
                productos[filas][columnas] = entrada.nextInt(); // Ingresa el usuario.
            }
        }
        d.Agregar_Valores(productos, precios); // Llamamos al metodo y le enviamos dos parametros.
        d.Agregar_Reporte(); // Llamamos al metodo Agregar_Reporte.
    }
}
