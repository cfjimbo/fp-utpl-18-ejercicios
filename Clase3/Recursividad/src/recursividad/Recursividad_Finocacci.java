/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

import java.util.Scanner;

public class Recursividad_Finocacci {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.printf("Ingrese el número de elementos a mostrar en la serie: \n");
        int num = entrada.nextInt();
        entrada.close();

        for (int i = 0; i < num; i++) {
            System.out.print(funcionFibonacci(i) + ", ");
        }
        System.out.println("\nLa función Fibonacci de " + num + " es: " + funcionFibonacci(num));
    }

    public static int funcionFibonacci(int num) {
        if (num == 0 || num == 1) {
            return num;
        } else {
            if (num == 2) {
                return 1;
            } else {
                return funcionFibonacci(num - 1) + funcionFibonacci(num - 2);
            }
        }
    }
}
