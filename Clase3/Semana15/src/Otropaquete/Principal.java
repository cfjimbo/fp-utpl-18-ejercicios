/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Otropaquete; // Tercer Paquete.

/**
 *
 * @author Usuario
 */
public class Principal { // Ejecutor.

    public static void main(String[] args) { // Main.
        Estudiante [] lista_estudiantes = new Estudiante [2]; // Lista vacía donde se agrega 2 nombres de lista_estudiantes.
        
        String nombre = "Renè"; // Cadena ingresado con el nombre René.
        double [] mis_notas = {10.2,15.5,20}; // Lista con notas double.
        
        Estudiante n = new Estudiante (); // Llamo a la clase Estudiante con la nueva variable asignada n.
        n.agregar_nombres(nombre); // Llamo al método agregar_nombres de la clase Estudiante.
        n.agregar_notas(mis_notas); // Llamo al método agregar_notas de la clase Estudiante.
        
        Estudiante m = new Estudiante(); // Llamo a la clase Estudiante con la nueva variable asignada m.
        m.agregar_nombres("Christian"); // Llamo al método agregar_nombres de la clase Estudiante y le añado la cadena Christian.
        double [] notas2 = {20,19.5,18}; // Lista con notas double.
        m.agregar_notas(notas2); // Llamo al método agregar_notas de la clase Estudiante y le añado los valores double de notas2.
        
        lista_estudiantes[0] = m; // lista_estudiantes en la posición 0 asignada a m.
        lista_estudiantes[1] = n; // lista_estudiantes en la posición 0 asignada a n.
        
        Paralelo paralelo = new Paralelo(); // Llamo a la clase Paralelo con la nueva variable asignada paralelo.
        paralelo.agregar_estudiantes(lista_estudiantes); // Llamo al método agregar_estudiantes de la clase Paralelo y le añado la lista_estudiantes.
        paralelo.presentar_datos(); // Llamo al método presentar_datos de la clase Paralelo.
    }
}
