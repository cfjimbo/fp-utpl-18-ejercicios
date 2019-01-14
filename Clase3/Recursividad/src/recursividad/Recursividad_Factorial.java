package recursividad;

import java.util.Scanner;

public class Recursividad_Factorial {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = entrada.nextInt();
        entrada.close();

        System.out.println("\nEl factorial recursivo de " + num + " es: " + factorial(num));
    }

    public static int factorial(int num) {
        if (num < 0) {
            return 0;
        } else {
            if (num == 0) {
                return 1;
            } else {
                return num * factorial(num - 1);
            }
        }
    }
}
