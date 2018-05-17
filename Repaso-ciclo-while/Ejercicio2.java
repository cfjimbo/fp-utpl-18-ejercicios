
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        // TODO code application logic her
    Scanner entrada = new Scanner(System.in);
        String marca;
        String origen;
        int auto;
        double impuesto;
        double costo;
        int argentina=0;
        int colombia=0;
        int chile=0;
        int otros=0;
        double prec_venta;
        double total_imp=0;
        int total_autos=0;
        double total = 0;
        int contador = 1;       
        String cadena_final = String.format("%s\t\t%s\t\t%s\t\t%s\t%s\n", "Marca", "Origen", "Costo", "Impuesto", "Precio Venta");
        
        System.out.println("Ingrese la cantidad total de autos");
        auto = entrada.nextInt();
        
        entrada.nextLine(); //Limpiar.
        while (contador <= auto){
            System.out.println("Ingrese la marca del vehiculo");
            marca = entrada.nextLine();
            System.out.println("Ingrese el lugar de procedencia del vehiculo");
            origen = entrada.nextLine();
            System.out.println("Ingrese el costo del vehiculo ");
            costo = entrada.nextDouble();
            
            switch (origen) {
                case "Argentina":
                    impuesto = costo * 0.2;
                    argentina = argentina + 1;
                    break;
                case "Colombia":
                    impuesto = costo * 0.25;
                    colombia = colombia + 1;
                    break;
                case "Chile":
                    impuesto = costo * 0.3;
                    chile = chile + 1;
                    break;
                default:
                    impuesto = costo * 0.4;
                    otros = otros + 1;
                    break;
            }
            contador = contador + 1;
            prec_venta = costo + impuesto;
            total_autos = total_autos + 1;
            total_imp = total_imp + impuesto;
            total = total + prec_venta;
            cadena_final = String.format("%s%-10s\t%-10s\t%.0f\t\t%.0f\t\t%.0f\n", cadena_final, marca, origen, costo, impuesto, prec_venta);
            
            entrada.nextLine(); 
            
        }
        System.out.println("\t\tReporte de Autos Importados");
        System.out.println("  ");
        System.out.printf("%s", cadena_final);  
        System.out.printf("Total Autos: %d\t   Tot.  Imp.:  %-10.0f\tTot.  PV:       %-10.0f\n", total_autos, total_imp, total);
        System.out.println("   ");
        System.out.printf("Argentina:\t        %d\n",argentina);
        System.out.printf("Chile:\t                %d\n",chile);
        System.out.printf("Colombia:\t        %d\n",colombia);
        System.out.printf("Resto de paises:\t%d\n",otros);
    }
}