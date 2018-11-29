/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package josecalva;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class JoseCalva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x;
        System.out.println("Ingrese la primera calificación: ");
        x = entrada.nextInt();
        int y;
        System.out.println("Ingrese la segunda calificación: ");
        y = entrada.nextInt();
        int z;
        System.out.println("Ingrese la tercera calificación: ");
        z = entrada.nextInt();
        int a;
        System.out.println("Ingrese la cuarta calificación: ");
        a = entrada.nextInt();
        int b;
        System.out.println("Ingrese la quinta calificación: ");
        b = entrada.nextInt();
        int calificacion = 0;
        int promedio = 0;
        
        String puntuacion = "";
        if (calificacion >= 90 && calificacion <= 100) {
            puntuacion = "A";
            if (calificacion >= 80 && calificacion < 90) {
                puntuacion = "B";
                if (calificacion >= 70 && calificacion < 80) {
                    puntuacion = "C";
                    if (calificacion >= 0 && calificacion < 70) {
                        puntuacion = "D";
                    }
                }
            }
        }
        System.out.printf("Calificación/tValor\n");
        for (int i = 1; i < calificacion; i++) {
            System.out.printf("\nCalificación %s/t%s\n",i++,calificacion);
        }
    }
    }

