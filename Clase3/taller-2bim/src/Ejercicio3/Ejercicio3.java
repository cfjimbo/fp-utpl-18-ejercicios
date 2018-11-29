/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author Usuario
 */
public class Ejercicio3 {

    public void boleto(int a, int b) {                       
        System.out.println("Pase de Abordo"); // Mensaje
        switch (a) { // Inicio del Switch
            case 1: // En caso de ser 1.
                System.out.printf("Nro. de Asiento: %d\n", b + 1); // Presenta el numero del asiento.
                System.out.printf("Sección: Primera Clase\n"); // Presenta la seccion en la que esta. Primera Clase.
                break;
            case 2: // En caso de ser 2.
                System.out.printf("Nro. de Asiento: %d\n", b + 1); // Se presenta el numero del asiento.
                System.out.printf("Seccion: Clase Economica\n"); // Presenta la seccion en la que esta. Primera Economica.
        }
    }

    public void lista_asientos(boolean[] x) {
        System.out.println("Lista de Asientos"); // Mensaje
        for (int i = 0; i < x.length; i++) { // Inicio del Primer for. 
            if (x[i]==true) { // Condicion. Determina si el asiento esta ocupado o no.
                System.out.printf("Asiento #%d: Ocupado\n",i+1); // Mensaje.
        }
            else{ // Caso contrario
                System.out.printf("Asiento #%d: Disponible\n",i+1); // Mensaje
            }
    }
    }
}