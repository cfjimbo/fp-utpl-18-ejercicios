/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import java.util.Scanner; // Importamos el objeto Scanner.

/**
 *
 * @author Usuario
 */
public class Ejecutor { // Ejecutamos. Clase.

    public static void main(String[] args) { // Principal
        int alt; // Declaración de la variable alt.
        boolean option = true; // Declaración de la variable option y se la inicializa en true.
        int lim1 = 0; // Declaracion de la variable lim1.
        int lim2 = 7; // Declaracion de la variale lim2.
        Ejercicio3 d = new Ejercicio3(); // Se le asigna a la variable d el objeto Ejercicio3.
        Scanner entrada = new Scanner(System.in); // Se le asigna a la variable entrada el objeto Scanner.

        boolean[] asientos = new boolean[15]; // Se declara un arreglo de tipo booleano. asientos.
        for (int i = 0; i < asientos.length; i++) { // Se inicializa en false todas sus posiciones.
            asientos[i] = false;
        }

        do { // Inicio del ciclo Do-While
            System.out.printf("Por favor Ingrese el tipo de asiento (1.Primera clase/2.Clase Económica): "); // Mensaje
            alt = entrada.nextInt(); // Se almacena en la variable opt.
            switch (alt) { // Inicio del Switch.
                case 1: // En caso de que alt sea 1.
                    if (lim1 <= 7) { // Condición. Determina que el lim sea menor o igual a 7.
                        if (asientos[lim1] != true) { // Condición. Determina si el asiento esta ocupado o no.
                            asientos[lim1] = true; // En caso de ser afirmativa toma el valor de True.
                            d.boleto(alt, lim1); // Se llama al metodo boleto y se le envia los parametros alt y lim1.
                            lim1 = lim1 + 1; // La variable lim1 aumenta en 1.
                        }
                    } else { // Caso contrario
                        System.out.printf("No hay asientos disponibles\n"); // En el caso de ser falsa se presenta un mensaje de que ya no hay asientos disponibles.
                    }
                    break;
                case 2: // En caso de que alt sea 2.
                    if (lim2 <= 14) { // Condicion para determinar que lim2 sea menor o igual a 14.
                        if (asientos[lim2] != true) { // Condicion para determinar que asientos son falsa. Diferente de True !=.
                            asientos[lim2] = true; // Se convierte en True.
                            d.boleto(alt, lim2); // Se llama al metodo pase y se le envia los parametros alt y lim2.
                            lim2 = lim2 + 1; // La variable lim2 aumenta en 1.
                        }
                    } else {                                                
                        System.out.printf("No hay asientos disponibles\n"); // En el caso de ser falsa se presenta un mensaje de que ya no hay asientos disponibles.
                    }
                    break;
            }
            System.out.printf("Desea seguir registrando los asientos:(Si=1/No=0): "); // Mensaje el cual elije el usuario la opción. 
            int aux = entrada.nextInt(); // Se lee la opcion del usuario.
            if (aux == 0) { // condicion para determinar la decicion del usuario.
                option = false; // Si la condicion es verdadera option toma el valor de falso.
            }
        } while (option); // Fin de el ciclo Do-While.
        d.lista_asientos(asientos); // Se llama al metodo lista_asientos y le agregamos un parametro.
    }
}
