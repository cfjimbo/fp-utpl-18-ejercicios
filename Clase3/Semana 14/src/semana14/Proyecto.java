/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana14;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Proyecto {

    /*public static void main(String[] args) {
        Persona p = new Persona();
        //System.out.println(p.nombre);
        //p.nombre = "Luis";
        //System.out.println(p.nombre);
        p.imprimir();
        p.nombre = "Christian";
        p.apellido = "Jimbo";
        p.imprimir();
        p.edad = 50;
        p.obtener_nombre_mayusculas();
        p.obtener_apellido_minusculas();
        p.obtener_edad();
        p.imprimir();
    }*/
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    Persona[] paralelo1 = new Persona [3];
    for (int i = 0; i < paralelo1.length; i++){
        Persona p = new Persona();
        System.out.println("Ingrese su nombre");
        p.nombre = entrada.nextLine();
        System.out.println("Ingrese su apellido");
        p.apellido= entrada.nextLine();
        System.out.println("Ingrese su edad");
        p.edad = entrada.nextInt();
        paralelo1[i] = p;
    }
    int suma = 0;
    double promedio = 0;
    for (int i = 0; i < paralelo1.length; i++){
        Persona p = paralelo1[i];
        suma = suma + p.obtener_edad();
    }
    promedio = suma/paralelo1.length;
    System.out.printf("El promedio de las edades es: %.2f", promedio);
    }
}
