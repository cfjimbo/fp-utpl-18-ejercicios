/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio1 {
public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        String Cliente;
        String ApeCliente;
        String Articulo;
        int cantidad;
        double precio_art;
        double suma = 0;
        double iva;
        double prectotal;
        double total;
        boolean option = true;
        String cadena_final; 
        cadena_final= String.format("%s\t%s\t%s\t\t%s\n", "Articulo", "Cantidad", "Precio unitario", "Precio total");
        System.out.printf("Factura\n");
        System.out.printf("Supermercado Todo a menor precio\n");
        System.out.println("Ingrese el nombre del cliente");
        Cliente = entrada.nextLine();
        System.out.println("Ingrese el apellido del cliente");
        ApeCliente = entrada.nextLine();
        while (option){
            System.out.println("Ingrese el nombre del artículo a comprar");
            Articulo = entrada.nextLine();
            System.out.println("Ingrese la cantidad a comprar");
            cantidad = entrada.nextInt();
            System.out.println("Ingrese el precio Unitario");
            precio_art = entrada.nextDouble();

            prectotal = precio_art * cantidad;
            suma = suma + prectotal;
            cadena_final = String.format("%s%-10s\t%d\t\t%.1f\t\t\t%.1f\n", cadena_final, Articulo, cantidad, precio_art, prectotal);
            entrada.nextLine();
            System.out.println("¿Desea comprar otro articulo? (no para salir)");
            String bandera = entrada.nextLine();
            if ("no".equals(bandera)) {
                option = false;
            }
        }
        iva = suma * 0.12;
        total = suma + iva;
        System.out.println(" ");
        System.out.println("                      Factura");
        System.out.println("Supermercado: Todo a menor precio");
        System.out.printf("Nombre del Cliente: %s %s\n",Cliente,ApeCliente);
        System.out.println(" ");
        System.out.println(cadena_final);
        System.out.printf("\t\t\t\tSubtotal \t\t%.1f\n",suma);
        System.out.printf("\t\t\t\tIVA 12%% \t\t%.2f\n",iva);
        System.out.printf("\t\t\t\tTotal \t\t\t%.2f\n",total);
}
}