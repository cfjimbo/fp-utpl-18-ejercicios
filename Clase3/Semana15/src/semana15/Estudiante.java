/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana15;

/**
 *
 * @author Usuario
 */
public class Estudiante { // class Estudiante.
    private String nombre; // Cadena de uso privado variable nombre.
    public void presentar_datos(){ // Void metodo presentar_datos.
        System.out.printf("%s", nombre); // Imprime el nombre.
    }
    public void agregar_nombre(String n){ // Void metodo agregar_nombre.
        nombre = n.toUpperCase(); // nombre se convierte en mayùsculas.
    }
}
