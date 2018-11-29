/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;

import java.util.Scanner;

public class Ejercicio12 {
    Scanner teclado = new Scanner(System.in);
    int n =0;
    String nombre[]=new String [n];
    
    public void crearArreglo(){
        for(int i =0;i< nombre.length;i++){
            System.out.println("Ingrese los nombres de los alumnos");
            nombre[i]=teclado.nextLine();
        }
    }
    public void Buscar(){
        String nombuscar;
        System.out.println("Ingrese el nombre del alunmo a buscar");
        nombuscar=teclado.nextLine();
        for(int i =0;i< nombre.length;i++){
           if(nombuscar.equals( nombre[i])){
               System.out.println("El nombre del alumno si existe");
           }else {
               System.out.println("El nombre del alumno no existe");
           }
        }
    }
}

