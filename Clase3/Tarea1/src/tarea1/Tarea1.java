/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Tarea1 {

    public static void main(String[] args) {
        Ejercicio1(5);
        Ejercicio2(1);
        Ejercicio3(2);
        Ejercicio4(3, 2);
        Ejercicio5(3);
    }

    public static void Ejercicio4(int cantidad, double precio) {
        /*En una empresa dedicada a la venta de balones, si se compra uno se 
        hace un descuento de 50%, si se compra 2 descuento de 70%, se compra 3 
        o más se descuenta 80%. Generar la solución que permita leer el número
        de balones a comprar, el precio de cada balón y el valor final a 
        cancelar.*/
        double valor_a_pagar = cantidad * precio;
        if (cantidad == 1) {
            valor_a_pagar = valor_a_pagar - (valor_a_pagar * 50) / 100;
        }
        if (cantidad == 2) {
            valor_a_pagar = valor_a_pagar - (valor_a_pagar * 70) / 100;
        }
        if (cantidad >= 3) {
            valor_a_pagar = valor_a_pagar - (valor_a_pagar * 80) / 100;
        }
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.DOWN);
        System.out.println("Su valor final a cancelar es :" + df.format(valor_a_pagar));
    }

    public static void Ejercicio1(int contador) {
        /*Una solución que permita leer el número de día (un valor entre 1 y 7) 
        e imprima Lunes si es 1, Martes si es 2, ... , Domingo si es 7.*/

        switch(contador){
            case 1:
                System.out.printf("1 entonces %s\n", "Lunes");
                break;
            
            case 2:
                System.out.printf("2 entonces %s\n", "Martes");
                break;    
            
            case 3:
                System.out.printf("3 entonces %s\n", "Miercóles");
                break;
                
            case 4:
                System.out.printf("4 entonces %s\n", "Jueves");
                break;
                
            case 5:
                System.out.printf("5 entonces %s\n", "Viernes");
                break;
                
            case 6:
                System.out.printf("6 entonces %s\n", "Sabado");
                break;
                
            case 7:
                System.out.printf("7 entonces %s\n", "Domingo");
                break;
                
            default:
                System.out.println("ninguna de las anteriores");

    }
    }

    public static void Ejercicio2(int tipo) {
        /*Una empresa dedicada a vender teléfonos celulares, en base a las 
        siguientes consideraciones:

	- Si el cliente es de tipo 1 se le descuenta 10%

	- Si el cliente es de tipo 2 se le descuenta 20%

	- Si el cliente es de tipo 3 se le descuenta 30%
        
        La solución debe imprimir el siguiente reporte:

	Nombre: Luis Alvarez

	Tipo de Cliente: 1

	Cantidad de Celulares: 20

	Precio por cada celular: 300

	Subtotal a pagar: cantidad de celulares * precio c/celular

	Descuento: (se debe obtener el descuento)

	Valor final a pagar: Subtotal - Descuento.*/
        
        Scanner entrada = new Scanner(System.in);
        String nombre;
        System.out.println("Nombre: ");
        nombre = entrada.nextLine();
        int cliente;
        System.out.println("Tipo de Cliente: ");
        cliente = entrada.nextInt();
        int cantidad;
        System.out.println("Cantidad de Celulares: ");
        cantidad = entrada.nextInt();
        double precio;
        System.out.println("Precio por cada celular: ");
        precio = entrada.nextDouble();
        double subtotal;
        subtotal=cantidad*precio;
        System.out.println("Subtotal a pagar: " +subtotal);
        /*double descuento;
        switch(tipo){
            case 1:
                descuento=(subtotal*10)/100;
                break;
            
            case 2:
                descuento=(subtotal*20)/100;
                break;    
            
            case 3:
                descuento=(subtotal*30)/100;
                break;
            default:
                System.out.println("ninguna de las anteriores");

    }*/
            
        double valor_a_pagar = 0;
        
        int tipo1=1, tipo2=2, tipo3=3;
        double descuento1=10, descuento2=20,descuento3=30;
        if (cliente == tipo1) {
            valor_a_pagar = subtotal - (subtotal * descuento1) / 100;
        }
        if (cliente == tipo2) {
            valor_a_pagar = subtotal - (subtotal * descuento2) / 100;
        }
        if (cliente == tipo3) {
            valor_a_pagar = subtotal - (subtotal * descuento3) / 100;
        }
        double descuento;
        switch(tipo){
            case 1:
                descuento=(subtotal*10)/100;
                break;
            
            case 2:
                descuento=(subtotal*20)/100;
                break;    
            
            case 3:
                descuento=(subtotal*30)/100;
                break;
            default:
                System.out.println("ninguna de las anteriores");

    }
        descuento=tipo;
        System.out.println("Descuento: " +descuento);
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.DOWN);
        System.out.println("Valor final a pagar :" + df.format(valor_a_pagar));
    }

    public static void Ejercicio3(int x) {
        /*- Solución que permita calcular y presentar los valores de X y Y, 
        teniendo como dato de entrada el valor de X y obtener el de Y en base a 
        las siguientes restricciones:

            Si X<0 entonces Y=3*X+10

            Si X>0 entonces Y=X**2+6

            Si X==0 entonces Y=1*/
        Scanner entrada = new Scanner(System.in);
        System.out.println("X: ");
        x = entrada.nextInt();
        int y=0;
        if (x<0){
            y=3*x+10;
        }
        if (x>0){
            y=x*2+6;
        }
        if (x==0){
            y=1;
        }
        System.out.println("Y vale: " +y);
    }

    public static void Ejercicio5(int tipo) {
        /*- La conversión de grados Celcius (C) a Fahrenheit (F) se realiza con
            la siguiente expresión matemática:
                F = (9/5)*C+32
            La conversión de Fahrenheit (F) a grados Celcius (C) se realiza con la siguiente expresión matemática:
                F = (F-32)5/9
            Generar la solución que permita obtener por parte de usuario el tipo
            de conversión que desea realizar y posterior presentación del
            resultado requerido.*/
        Scanner entrada = new Scanner(System.in);
        double cantidad;
        System.out.println("Cantidad de Grados: ");
        cantidad = entrada.nextDouble();
        System.out.println("1. Convertir de grados Celcius (C) a Fahrenheit (F)");
        System.out.println("2. Convertir de grados Fahrenheit (F) a grados Celcius (C)");
        int opcion;
        System.out.println("Escoja una Opcion:");
        entrada.nextLine(); //Limpiando Scanner
        opcion = entrada.nextInt();
        
        double f=0,c=0;
        switch(opcion){
            case 1:
                f = (9/5)*cantidad+32;
                System.out.println("Su conversion resultante es: "+cantidad+"° Celcius son iguales a "+f+"° Fahrenheit");
                break;
            
            case 2:
                c = (cantidad-32)*5/9;
                System.out.println("Su conversion resultante es: "+cantidad+"° Fahrenheit son iguales a "+c+"° Celcius");
                break;    
            
        }       
    }
}
