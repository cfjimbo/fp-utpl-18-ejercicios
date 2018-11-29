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
public class DeberDoWhile {
    /*public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num;
        String nombreJug;
        String opt;
        int jugador;
        int pases;
        int goles;
        double sumaP = 0;
        double sumaG = 0;
        double promP = 0;
        double sumaE = 0;
        double promE = 0;
        double sumaf = 0;
        double promf = 0;
        double promFP = 0;
        boolean bandera = true;
        String cadena_final;
        cadena_final = "";
        System.out.println("Reporte de Jugadores del Equipo UTPL");
        
        do {
            System.out.println("Ingrese el nombre del Jugador");
            nombreJug = entrada.nextLine();
            System.out.println("Ingrese el número de partidos que ya ha jugado");
            num = entrada.nextInt();
            if (num >= 1) {
                System.out.println("**\tDATOS DEL PARTIDO #1\t**");
                System.out.println("Ingrese el número de Pases por partido");
                pases = entrada.nextInt();
                System.out.println("Ingrese el número de goles por partido");
                goles = entrada.nextInt();
                cadena_final = String.format("%s%-10s\t\t%.2f\t\t%.2f\t\t\n", cadena_final, nombreJug, pases, goles);
                sumaP = sumaP + pases;
                sumaG = sumaG + goles;
            for (int j = 1; j <= num; j++) {
                promf = 0;
                sumaf = 0;
                
                System.out.println("Ingrese el número de asignaturas");
                asig = entrada.nextInt();
                cadena_final = String.format("%s\n\n%s\n\n%s\t\t%s\t\t%s\t\t", cadena_final, "Nombre del Jugador", "Total de Pases", "Total Goles", "Nivel del Jugador");

                for (int contador = 1; contador <= asig; contador++) {
                    entrada.nextLine(); //Limpiar ScanÃ©r.

                    System.out.println("Ingrese el nombre y apellido del Jugador");
                    nombreJug = entrada.nextLine();
                    System.out.println("Ingrese el número de Pases por partido");
                    pases = entrada.nextInt();
                    System.out.println("Ingrese el número de goles por partido");
                    goles = entrada.nextInt();

                    sumaP = sumaP + pases;
                    sumaG = sumaG + goles;
                    promP = sumaP / num;
                    sumaf = sumaf + promP;

                    cadena_final = String.format("%s%-10s\t\t%.2f\t\t%.2f\t\t\n", cadena_final, nombreJug, pases, goles);
                }
                promf = (sumaf) / asig;
                cadena_final = String.format("%s%s\t%.2f\t\n", cadena_final, "\t\t\t\t\tPromedio", promf);

                System.out.println(); //Imprime una nueva linea
                if (promf >= 100) {
                    cadena_final = String.format("%s%s tiene el promedio Excelente\n", cadena_final, nombreJug);
                }
                if (promf >= 80 && promP <= 99) {
                    cadena_final = String.format("%s%s tiene el promedio Muy Bueno\n", cadena_final, nombreJug);
                }
                if (promf >= 60 && promP <= 79) {
                    cadena_final = String.format("%s%s tiene el promedio Bueno\n", cadena_final, nombreJug);
                }
                if (promf <= 59) {
                    cadena_final = String.format("%s%s tiene el promedio Regular\n", cadena_final, nombreEst);
                }
                promFP = (sumaP) / num;
            }
            promE = sumaE / num;

            System.out.println(cadena_final);
            System.out.println("\nINFORMACION GLOBAL DE LOS ESTUDIANTES: ");
            System.out.printf("%s%.2f", "Promedio de Pases del Equipo: ", promFP);
            System.out.printf("\nPromedio de Goles del equipo es: %.2f\n", prom);
        }
        while (false);*/
        
        public static void main(String[] args) {
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
        System.out.printf("Promedio de Goles del equipo es: %.2f\n", promG);
    }

}
