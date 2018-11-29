/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdowhile;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Tareadowhile {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num;
        String nombreJug;
        String option;
        int pases;
        int goles;
        double sumaP = 0;
        double sumaG = 0;
        double promP;
        double promG;
        double sumaPF = 0;
        double sumaPG = 0;
        String nivJug = null;
        boolean bandera = true;
        int i = 0;
        String cadena_final = String.format("\n\nReporte de Jugadores del Equipo UTPL\n\n%s\t%s\t\t%s\t\t%s\n", "Nombre del Jugador", "Total de Pases", "Total de Goles", "Nivel del Jugador");

        do {
            System.out.println("Ingrese el nombre del Jugador");
            nombreJug = entrada.nextLine();
            System.out.println("Ingrese el número de partidos que ya ha jugado");
            num = entrada.nextInt();
            if (num >= 1) {
                System.out.println("Ingrese el número de Pases por partido P1:");
                pases = entrada.nextInt();
                System.out.println("Ingrese el número de goles por partido G1:");
                goles = entrada.nextInt();
                cadena_final = String.format("%s%-10s\t\t%-10d\t\t%d\t\t\n", cadena_final, nombreJug, pases, goles);
                sumaP = pases;
                sumaG = goles;
            }
                for (int j = 2; j <= num; j++) {
                    System.out.printf("Ingrese el total de Pases P%d :\n", j);
                    pases = entrada.nextInt();
                    System.out.printf("Ingrese el total de Goles G%d :\n", j);
                    goles = entrada.nextInt();
                    cadena_final = String.format("%s\t\t\tP%d:%d\t\t\tG%d:%d\n", cadena_final, j, pases, j, goles);
                    sumaP = sumaP + pases;
                    sumaG = sumaG + goles;
                }
                sumaPF = sumaPF + sumaP;
                sumaPG = sumaPG + sumaG;

                if (sumaP >= 100) {
                    nivJug = "Excelente";
                }
                if (sumaP >= 80 && sumaP <= 99) {
                    nivJug = "Muy Bueno";
                }
                if (sumaP >= 60 && sumaP <= 79) {
                    nivJug = "Bueno";
                }
                if (sumaP <= 59) {
                    nivJug = "Regular";
                }
                cadena_final = String.format("%s\n\t\t\tTotal:%.2f\t\tTotal:%.2f\t\t%s\n", cadena_final, sumaP, sumaG, nivJug);
                entrada.nextLine();
                System.out.println("Desea ingresar algún otro jugador(Si/No): ");
                option = entrada.nextLine();
                if (option.equals("No")) {
                    bandera = false;
                }
                i = i + 1;
            }
            while (bandera);
            
            promP = sumaPF / i;
            promG = sumaPG / i;

            System.out.println(cadena_final);
            System.out.println("Datos Finales");
            System.out.printf("%d Jugadores Analizados.\n", i);
            System.out.printf("%s%.2f", "Promedio de Pases del Equipo: ", promP);
            System.out.printf("\nPromedio de Goles del equipo es: %.2f\n", promG);

        /*public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean opt = true;
        String nom;
        String nivel;
        String op;
        int part;
        double sumaTP = 0;
        double sumaTG = 0;
        int jugador = 0;
        int pases, goles;
        double promP, promG;
        int lim;
        int sumaP = 0;
        int sumaG = 0;
        String Cadena = String.format("\n%s\t%s\t%s\t\t%s\n", "Nombre del Jugador", "Total de Pases", "Total de Goles", "Nivel del Jugador");
        do {
            System.out.println("Ingrese el Nombre de Jugador: ");
            nom = entrada.nextLine();
            System.out.println("Ingrese el numero de Partidos Jugados:");
            lim = entrada.nextInt();
            if (lim > 0) {
                System.out.println("**\tDATOS DEL PARTIDO #1\t**");
                System.out.printf("Ingrese el total de Pases P1 :");
                pases = entrada.nextInt();
                System.out.printf("Ingrese el Total de Goles G1 : ");
                goles = entrada.nextInt();
                Cadena = String.format("%s\n%10.10s.\t\tP1:%d\t\t\tG1:%d\n", Cadena, nom, pases, goles);
                sumaP = pases;
                sumaG = goles;
            }
            for (int i = 2; i <= lim; i++) {
                System.out.printf("**\tDATOS DEL PARTIDO #%d\t**\n",i);
                System.out.printf("Ingrese el total de Pases P%d :", i);
                pases = entrada.nextInt();
                System.out.printf("Ingrese el Total de Goles G%d :", i);
                goles = entrada.nextInt();
                Cadena = String.format("%s\t\t\tP%d:%d\t\t\tG%d:%d\n", Cadena, i, pases, i, goles);
                sumaP = sumaP + pases;
                sumaG = sumaG + goles;
            }
            sumaTP = sumaTP + sumaP;
            sumaTG = sumaTG + sumaG;
            if (sumaP >= 100) {
                nivel = "Excelente";
            } else {
                if (sumaP >= 80 && sumaP <= 99) {
                    nivel = "Muy Bueno";
                } else {
                    if (sumaP >= 60 && sumaP <= 79) {
                        nivel = "Bueno";
                    } else {
                        nivel = "Regular";
                    }
                }
            }
            Cadena = String.format("%s\n\t\t\tTotal:%d\t\tTotal:%d\t\t%s\n", Cadena, sumaP, sumaG, nivel);
            entrada.nextLine();
            System.out.println("Desea Ingresar otro Jugador(S/N): ");
            op = entrada.nextLine();
            if (op.equals("N")) {
                opt = false;
            }
            jugador = jugador + 1;
        } while (opt);

        promP = sumaTP / jugador;
        promG = sumaTG / jugador;
        System.out.println("\nREPORTE DE JUGADORES DEL EQUIPO UTPL");
        System.out.printf("%s\n", Cadena);
        System.out.println("Datos Finales");
        System.out.printf("%d Jugadores Analizados.\n", jugador);
        System.out.printf("Promedio de Pases del equipo es: %.2f\n", promP);
        System.out.printf("Promedio de Goles del equipo es: %.2f\n", promG);*/
    }
}
