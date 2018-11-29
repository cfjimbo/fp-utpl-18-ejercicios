/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejecutor {

    public static void main(String[] args) {
        Operaciones op = new Operaciones();
        int valor = 2;
        int limite = 10;
        Scanner entrada = new Scanner (System.in);
        String opt;
        System.out.println("Seleccione la tabla que desea ejecutar  (sum/multiplicacion)");
        opt = entrada.nextLine();
        
        if (opt == suma) {
            op.obtener_tablas_sumar(valor, limite);
        } else {
            op.obtener_tablas_mult(valor, limite);
        }
    }
}
