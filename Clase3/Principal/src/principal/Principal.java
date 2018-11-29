/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Equipo equipo = new Equipo();

        equipo.listaJugadores();

        int goles;
        int pases;
        int balonesRecuperados;
        int atajadas;
        int valor1, valor2 = 0, valor3 = 0;

        System.out.println("Escribir el numero de atajadas del portero ");
        atajadas = teclado.nextInt();

        Jugadores per2 = new Porteros(atajadas);
        valor1 = per2.valoracion();

        System.out.println("\n*****RESULTADOS DEL EQUIPO*****\n");

        int cont = 0;
        do {

            System.out.println("Número de dorsal de jugador");
            int aux = teclado.nextInt();

            if (aux >= 2 && aux <= 11) {
                System.out.println("Escribir el numero de goles ");
                goles = teclado.nextInt();
                System.out.println("Número de pases ");
                pases = teclado.nextInt();
                System.out.println("Número de recuperacion ");
                balonesRecuperados = teclado.nextInt();

                if (aux >= 6 && aux <= 11) {
                    Jugadores per = new Atacantes(goles, pases, balonesRecuperados, aux);
                    valor2 = per.valoracion();
                } else if (aux >= 2 && aux <= 5) {
                    Jugadores per1 = new Defensores(goles, pases, balonesRecuperados, aux);
                    valor3 = per1.valoracion();
                }

            } else {
                System.out.println("Número incorrecto ");
            }
            System.out.println("Opción 0 para terminar ");
            System.out.println("Opción 1 para continuar ");
            cont = teclado.nextInt();
        } while (cont == 1);

        equipo.presentarEquipo();

        System.out.println("Valor porteros " + valor1);
        System.out.println("Valor defensa " + valor2);
        System.out.println("Valor atacantes " + valor3);
    }
}
