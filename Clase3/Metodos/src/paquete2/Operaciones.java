/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Operaciones {
    public void obtener_tablas_sumar(int numero, int limite){
        /*numero = 2
          limite = 5
            2+1=3
            2+2=4
            2+3=5
            +24=6
            2+5=7
        */
        Scanner entrada = new Scanner(System.in);
        int x;
        System.out.println("Ingrese el valor: ");
        x = entrada.nextInt();
        for(int i=1; i<=limite; i++){
            int suma = numero + i;
            System.out.printf("%d + %d = %d\n", numero, i, suma);
        }
    }
    public void obtener_tablas_mult(int numero, int limite){
        for(int i=1; i<=limite; i++){
            int mult = numero * i;
            System.out.printf("%d * %d = %d\n", numero, i, mult);
        }
    }
}
