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
public class Taller2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num;
        String nombreP;
        double sueldo;
        int cantidad;
        double pasajes;
        double bar;
        double salidas;
        double suma = 0;
        double suma1 = 0;
        double suma2 = 0;
        double total = 0;
        double sobra;
        double falta;
        String cadena_final;
        cadena_final = "";
        
        System.out.println("Ingrese el número de Padres de Familia");
        num = entrada.nextInt();
        
        for(int j = 1; j <= num; j++){
            entrada.nextLine();
            
            System.out.println("Ingrese el apellido y nombre del Padre de Familia");
            nombreP = entrada.nextLine();   
            System.out.println("Ingrese el sueldo semanal");
            sueldo = entrada.nextInt();
            System.out.println("Ingrese el número de los hijos");
            cantidad = entrada.nextInt();
            cadena_final = String.format("%s\n\nReporte Gastos de Padre de Familia\n\nNombre del Padre de Familia: %s\nSueldo semanal:%.2f\nNumero Hijos:%d\n\n%s\t\t%s\t\t%s\t\t%s\n", cadena_final, nombreP, sueldo, cantidad,"Persona", "Pasajes", "Bar", "Salidas");
            
            for (int contador = 1; contador <= cantidad; contador++) {
                System.out.println("\nIngrese lo que paga en Pasajes");
                pasajes = entrada.nextDouble();
                System.out.println("Ingrese lo que paga en Bar");
                bar = entrada.nextDouble();
                System.out.println("Ingrese lo que paga en Salidas");
                salidas = entrada.nextDouble();

                suma = suma + pasajes;
                suma1 = suma1 + bar;
                suma2 = suma2 + salidas;
                
                total = suma + suma1 + suma2;
                
                falta = total - sueldo;
                sobra = sueldo - total;
                
                cadena_final = String.format("%s%s%d\t\t%s\t\t%.1f\t\t%.1f\n", cadena_final, "Hijo",contador, pasajes, bar, salidas);
            }
            cadena_final = String.format("%s%s\t\t%s\t\t%s\t\t%s\t\t\n", cadena_final, "total", suma, suma1, suma2);

            System.out.println(); //Imprime una nueva linea
            if (total == sueldo) {
                cadena_final = String.format("%s\n\nEl padre de familia %s le alcanza el dinero\n", cadena_final, nombreP);
            } if (total > sueldo){
                cadena_final = String.format("%s\n\nEl padre de familia %s le falta el dinero\n", cadena_final, nombreP);
            }
            else{
                cadena_final = String.format("%s\n\nEl padre de familia %s le sobra el dinero\n", cadena_final, nombreP);
            }
    }
    System.out.println(cadena_final);    
}
}
