/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Arreglos {

    public static void main(String[] args) {
        /*
        int[] myArray1 = new int[10];
        MetodosArreglos op = new MetodosArreglos();
        op.leerArreglo(myArray1);
        op.presentarArreglo(myArray1);
        op.Secuencial(myArray1, 0);
        
        
        Scanner entrada = new Scanner(System.in);
        int x;
        System.out.println("Ingrese los elementos: ");
        x = entrada.nextInt();
        System.out.println("_____MENÚ_____");
        
        System.out.println("1. ");
        int ev;
        System.out.println("Ingrese los elementos validos");
        ev = entrada.nextInt();
        System.out.println("Escoga una opción");
        //Switch
        int leer;
        System.out.println("1. Solo leer el arreglo");
        leer = entrada.nextInt();
        System.out.println("Escoja el tipo de empleado al que pertenece(1,2,3,4)");
        tipo = entrada.nextInt();
        System.out.println("Ingrese el numero de hijos del empleado");
        hijos = entrada.nextInt();
        */
        int[] arreglo = new int[]{1,3,2,0,5,4,6};
        Burbuja(arreglo);
    }
    
    /*public static void presentar() {
        int respuesta, elemento;
        MetodosArreglos op = new MetodosArreglos();
        respuesta = op.Secuencial(myArray1, elemento);
    } 
    */
    public static void Burbuja(int [] x){
        int aux;
        for(int i=x.length-1;i>0;i--){
            for(int j=0; j < i; j++){
                if(x[j]>x[j+1]){
                    aux = x[j];
                    x[j] = x[j+1];
                    x[j+1] = aux;
                }
                System.out.println(x[j]);
            }
            System.out.println(x[i]);
        }
        System.out.println();
    }
}
