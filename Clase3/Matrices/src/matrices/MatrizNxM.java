/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;

public class MatrizNxM {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;
        double suma;
        double[][] matriz = {{0.0, 0.1, 0.2, 0.3}, {1.0, 1.1, 1.2, 1.3}, {2.0, 2.1, 2.2, 2.3}, {3.0, 3.1, 3.2, 3.3}};
        int [] rf = new int[n];
        int [] rc = new int[m];
        for(int i = 0; i < n;i++){
            for(int j = 0; j<m; j++){
                suma = rf[i] + rc[j];
            }
        }
        System.out.println(suma);
    }
}

