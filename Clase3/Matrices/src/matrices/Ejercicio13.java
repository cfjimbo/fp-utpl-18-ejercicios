/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;

import java.util.Scanner;

public class Ejercicio13 {

    public int[][] agregar_arreglo(int[][] n, int f, int c) {
        Scanner teclado = new Scanner(System.in);  
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("Ingrese el numero de la fila #%d, posicion %d:", i + 1, j + 1);
                int num = teclado.nextInt(); 
                n[i][j] = num;
            }
        }
        return n;

    }
    public void presentar_arreglo(int[][] n, int f, int c) {
        System.out.println("----arreglo---");
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf(" %d ", n[i][j]);

            }
            System.out.println();
        }

    }
   
    public int[][] multiplicacion(int[][] a, int[][] b) { 
        int m, n, k, L;
        m = a.length;
        n = b[0].length;
        k = b.length;
        L = b[0].length;
        int[][] mult = new int[m][L];
        int suma;
        int aux;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                suma = 0;
                for (int x = 0; x < m; x++) {
                    aux = a[i][x] * b[x][j];
                    suma = suma + aux;
                }
                mult[i][j] = suma;
            }
        }
        return mult;
    }

    public int[][] suma_(int[][] a, int[][] b) {
        int[][] suma = new int[a.length][a.length];
        for (int i = 0; i < suma.length; i++) {
            for (int j = 0; j < suma.length; j++) {
                suma[i][j] = a[i][j] + b[i][j];
            }
        }
        return suma;
    }

    public int[][] resta_(int[][] a, int[][] b) {
        int[][] resta = new int[a.length][a.length];
        for (int i = 0; i < resta.length; i++) {
            for (int j = 0; j < resta.length; j++) {
                resta[i][j] = a[i][j] - b[i][j];
            }
        }
        return resta;
    }

    public int[][] Escalar(int[][] arr, int x) { 
        int[][] resultado = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                resultado[i][j] = arr[i][j] * x;
            }
        }
        return resultado;
    }

    public int[][] transpuesta(int[][] lista) {
        int[][] trans = new int[lista.length][lista.length];
        int aux;
        for (int i = 0; i < lista.length; i++) {
            for (int j = i; j < lista[0].length; j++) {
                aux = lista[i][j];
                trans[i][j] = lista[j][i];
                trans[j][i] = aux;
            }
            System.out.println();
        }
        return trans;
    }
}
