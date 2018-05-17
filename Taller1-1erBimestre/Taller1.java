/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Taller1 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int cantidad;
        double pasajes;
        double bar;
        double salidas;
        double suma=0;
        double suma1=0;
        double suma2=0;
        double total;
        boolean option = true;
        String cadena_final; 
        cadena_final= String.format("%s\t\t%s\t\t%s\t\t%s\t\t%s\t\n", "Persona", "Pasajes", "Bar", "Salidas", "Total");
        System.out.printf("Gastos Familia\n");
        System.out.println("Ingrese el número de los hijos");
        cantidad = entrada.nextInt();
        
        for (int contador = 1; contador <= cantidad; contador++){
            System.out.println("Ingrese lo que paga en Pasajes");
            pasajes = entrada.nextDouble();
            System.out.println("Ingrese lo que paga en Bar");
            bar = entrada.nextDouble();
            System.out.println("Ingrese lo que paga en Salidas");
            salidas = entrada.nextDouble();

            suma = suma + pasajes;
            suma1 = suma1 + bar;
            suma2 = suma2 + salidas;
            total = suma+suma1+suma2;
            cadena_final = String.format("%s%-10s\t%s\t\t%.1f\t\t%s\t\t%.1f\n", cadena_final, contador, pasajes, bar, salidas, total);
            entrada.nextLine();
            
        System.out.println("Gastos Familia");
        System.out.printf("Persona: %s\n",contador);
        System.out.println(" ");
        System.out.println(cadena_final);
        System.out.println(); //Imprime una nueva linea
        if (total>50){
                System.out.printf("El padre de familia le falta dinero\n", +total);
            }
            else{
                System.out.printf("El padre de familia le sobra dinero\n", +total);
            }
    }
    }
}
