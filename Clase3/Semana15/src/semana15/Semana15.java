/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana15; // Primer Paquete.

import java.util.Scanner; // Importa Scanner.

/**
 *
 * @author Usuario
 */
public class Semana15 { // Ejecutor.

    public static void main(String[] args) { // Main.
        Estudiante p = new Estudiante(); // Llamo a la clase Estudiante con la nueva variable asignada p.
        Scanner s = new Scanner(System.in); // Importo Scanner.
        String v = s.nextLine(); // Ingreso una cadena asignada en v.
        v = v.toUpperCase(); // Lo ingresado va a salir en mayùsculas.
        p.agregar_nombre(v); // Llamamos al mètodo agregar_nombre de la clase Estudiante.
        p.presentar_datos(); // Llamamos al mètodo presentar_datos de la clase Estudiante.
        
        Estudiante m = new Estudiante(); // m es asignada de la clase Estudiante.
        m.agregar_nombre("luis"); // Agrega el nombre Luis en el mètodo agregar_nombre.
    }
}
