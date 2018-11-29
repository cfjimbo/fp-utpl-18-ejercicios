/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenbimestralestructura1;

import java.util.Arrays;

public class ExamenBimestralEstructura1 {

    public static void main(String[] args) {
        int[][] n = {{1, 0, 2, 3, -4}, {1, 2, 4, -4, -2}, {5, 4, 1, -4, 2}, {4, 2, -3, 5, -5}, {-5, 3, 2, -1, -1}};
        visualizarMatriz(n);
        Diagonal_Secundaria(n);
        Base(n);
        Exponente(n);
    }

    public static void leer(int[][] n) {

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[0].length; j++) {
                if (n[i][j]>=5 && n[i][j]<=5) {
                    System.out.println("\t" + n[i][j]);
                } else{
                    System.out.println(0);
                }
            }
        }
    }

    static void visualizarMatriz(int[][] n) {
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                System.out.print("\t" + n[i][j]);
            }
            System.out.println();
        }
    }
    public static void Diagonal_Secundaria(int[][] n) {
        int [] diagonal_Secundaria = new int [5];
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                if (i + j == n.length - 1) {
                    diagonal_Secundaria[i] = n[i][j];
                }
            }
        }
        System.out.println(Arrays.toString(diagonal_Secundaria));
    }
    
    public static void Base(int[][] n) {
        int [] base = new int [10];
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                if (n[i][j] < i+j ) {
                    base[i] = n[i][j];
                }
            }
        }
        System.out.println(Arrays.toString(base));
    }
    
    public static void Exponente(int [][] n){
        int [] exponente = new int [10];
        for (int j = 1; j < n.length; j++) {
            for (int i = 1; i < n.length; i++) {
                if (n[i][j] >= i+j) {
                    exponente[i] = n[j][i];
                }
            }
        }
        System.out.println(Arrays.toString(exponente));
    }
}
