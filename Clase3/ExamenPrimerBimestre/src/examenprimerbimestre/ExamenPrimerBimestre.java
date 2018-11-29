/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenprimerbimestre;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ExamenPrimerBimestre {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num;
        int edad;
        String nombre;
        String option;
        int tipo;
        int tipo1 = 340;
        int tipo2 = 460;
        int tipo3 = 580;
        int tipo4 = 600;
        int transporte;
        int hijos;
        double adic;
        double incentivo = 0;
        double bono = 0;
        double desc = 0;
        double total_a_pagar = 0;
        double sumaT = 0;
        double sumaG = 0;
        double promP;
        double promG;
        double STincentivo = 0;
        double sumaPF = 0;
        double sumaPG = 0;
        double totalHijos = 0;
        double sumaTotalT = 0;
        String nivJug = null;
        boolean bandera = true;
        int i = 0;
        String cadena_final = String.format("\n\nReporte de Rol de Pagos por Empleado\n\n%s\t%-10s\t\t%s\t\t%s\t\t%s\t\t%s\t\t%s\n", "Nombres", "Transporte", "Sueldo Mensual", "Incentivo-1", "Hijos", "Descuento SS", "Total a Pagar");

        do {
            System.out.println("Ingrese el nombre del empleado");
            nombre = entrada.nextLine();
            System.out.println("Ingrese la edad");
            edad = entrada.nextInt();
            System.out.println("Ingrese el número de veces que gasta en Transporte al mes");
            num = entrada.nextInt();
            System.out.println("Escoja el tipo de empleado al que pertenece(1,2,3,4)");
            tipo = entrada.nextInt();
            System.out.println("Ingrese el numero de hijos del empleado");
            hijos = entrada.nextInt();

            cadena_final = String.format("%s%-10s\t\t%-10d\t\t%d\t\t\n", cadena_final, nombre, edad, num);
            sumaT = num;
            for (int j = 1; j <= num; j++) {
                entrada.nextLine(); //Limpiar Scanèr
                System.out.printf("Ingrese lo que paga en transporte Tr%d :\n", j);
                transporte = entrada.nextInt();
                cadena_final = String.format("%s\t\t\tTr%d:%d\t\t\t", cadena_final, j, transporte);
                sumaT = sumaT + transporte;

                //Incentivo -1
                switch (tipo) {
                    case 1:
                        incentivo = (tipo1 * 5) / 100;
                        System.out.println(incentivo);
                        break;

                    case 2:
                        incentivo = (tipo2 * 10) / 100;
                        System.out.println(incentivo);
                        break;

                    case 3:
                        incentivo = (tipo3 * 15) / 100;
                        System.out.println(incentivo);
                        break;

                    case 4:
                        incentivo = (tipo4 * 15) / 100;
                        System.out.println(incentivo);
                        break;

                    default:
                        System.out.println("ninguna de las anteriores");
                }
                STincentivo = STincentivo + incentivo;
            }
            if (hijos > 0) {
                bono = hijos * 10;
            }
            totalHijos = totalHijos + hijos;
            //Descuento Seguro Social
            if (edad <= 20) {
                desc = (tipo + incentivo + sumaT + bono) * 15/100;
            } else {
            if (edad > 20 && edad <= 30) {
                desc = (tipo + incentivo + sumaT + bono) * 25/100;
            } else {
            if (edad > 31) {
                desc = (tipo + incentivo + sumaT + bono) * 35/100;
            }
            }
            }
            total_a_pagar = tipo + incentivo + sumaT + bono - desc;
            cadena_final = String.format("%sTotales\n\t\t\t%.2f\t\t%d\t\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f\n", cadena_final, sumaT, tipo, incentivo, bono,desc,total_a_pagar);
            entrada.nextLine();
        
        System.out.println("Desea ingresar algún otro jugador(Si/No): ");
        option = entrada.nextLine();
        if (option.equals("No")) {
            bandera = false;
        }
        i = i + 1;
    }
    while (bandera);
    sumaTotalT = sumaT;
    System.out.println ("Reporte de Rol de Pagos");
    System.out.println (cadena_final);
    cadena_final = String.format("%s\n\nReporte de Rol de Pagos de la Empresa (Totales):\n\nDescuento de Seguro Social\tPago por Transporte\tIncentivo-1\tPago por Hijos\tTotal Pago de la Empresa\n%.2f\t\t\t\t%.2f\t\t\t%.2f\t\t%.2f\t\t%.2f\n", cadena_final, desc, sumaTotalT, STincentivo, totalHijos, totalPagos);
    System.out.println (cadena_final);
    }
}
