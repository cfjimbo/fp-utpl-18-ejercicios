/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenprimerparcial;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ExamenPrimerParcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ejercicio1(1);
        //Ejercicio2(1);
        //Ejercicio3(1);
        //Ejercicio4(1);
        //Ejercicio5(4);
        //Ejercicio6(12);
        //Ejercicio7(1);
        //Ejercicio8(1);
        //Ejercicio9(1);
    }

    public static void Ejercicio1(int i) {
        /*Realizar un programa en Java que permita ingresar por teclado la longitud y la anchura de una
        habitación, realizar los procesos respectivos que permita obtener la superficie de la misma, además
        se debe presentar en pantalla el valor de la superficie, finalmente tomar en consideración que se
        debe presentar el valor con 3 decimales.*/

        Scanner entrada = new Scanner(System.in);
        double longitud;
        System.out.println("Longitud de la habitacion: ");
        longitud = entrada.nextDouble();
        double ancho;
        System.out.println("Ancho de la habitacion: ");
        ancho = entrada.nextDouble();
        double superficie;
        superficie = longitud * ancho;
        System.out.printf("La superficie de la habitacion es: %.3f\n", +superficie);
    }

    public static void Ejercicio2(int i) {
        /*Ingresar por teclado la variables: x,y,z.
        En base a las mismas realizar la siguiente operación:
        m=(x+(y/z))/(x-(y/z))
        y finalmente presentar en pantalla el siguiente reporte:
        El valor de m, en base a las variables:
        x = 10.2
        y = 9.2
        z = 8.2
        da como resultado:
        m = ? */
        Scanner entrada = new Scanner(System.in);
        double x;
        System.out.println("x vale: ");
        x = entrada.nextDouble();
        double y;
        System.out.println("y vale: ");
        y = entrada.nextDouble();
        double z;
        System.out.println("z vale: ");
        z = entrada.nextDouble();
        double m;
        m = (x + (y / z)) / (x - (y / z));
        System.out.printf("m es igual: %.3f\n", +m);
    }

    public static void Ejercicio3(int i) {
        /*Realizar un programa que permita ingresar un valor en segundos, luego realizar un proceso que
        permita presentar el valor en minutos y segundos del valor dado. Ejemplo:
        100 segundos es igual a 1 minuto y 40 segundos*/
        Scanner entrada = new Scanner(System.in);
        double x;
        System.out.println("Ingrese los segundos: ");
        x = entrada.nextDouble();
        double y;
        y = x / 60;
        double tminutos;
        tminutos = y % 60;
        System.out.printf("Los segundos a minutos son: %.2f\n", +tminutos);
    }

    public static void Ejercicio4(int i) {
        /*Dado el siguiente sistema de ecuaciones:
        ax + by = c
        dx + ey = f
        resolverlo aplicando las siguientes formulas:
        x=(ce−bf)/(ae−bd) 
        y=(ce−bf)/(ae−bd)
        Presentar en pantalla los valores de x y y*/
        Scanner entrada = new Scanner(System.in);
        double a;
        System.out.println("a vale: ");
        a = entrada.nextDouble();
        double b;
        System.out.println("b vale: ");
        b = entrada.nextDouble();
        double c;
        System.out.println("c vale: ");
        c = entrada.nextDouble();
        double d;
        System.out.println("d vale: ");
        d = entrada.nextDouble();
        double e;
        System.out.println("e vale: ");
        e = entrada.nextDouble();
        double f;
        System.out.println("f vale: ");
        f = entrada.nextDouble();
        double x, y;
        x = (c * e) - (b * f) / (a * e) - (b * d);
        y = (c * e) - (b * f) / (a * e) - (b * d);
        System.out.printf("x es igual a: %.2f\n", +x);
        System.out.printf("y es igual a: %.2f\n", +y);
    }

    public static void Ejercicio5(int contador) {
        /*Ingresar por teclados 4 calificaciones de un estudiante, encontrar el promedio de las
        calificaciones ingresadas. Presentar la puntuación del estudiante en base a la siguiente información:
        Media   Puntuación
        90-100      A
        80-89       B
        70-79       C
        0-69        D
        El reporte sería por ejemplo así:
        El estudiante con el promedio de calificaciones 70, tiene una puntuación de C.*/
        Scanner entrada = new Scanner(System.in);
        int calificacion1;
        System.out.println("calificacion1 es igual a: ");
        calificacion1 = entrada.nextInt();
        int calificacion2;
        System.out.println("calificacion2 es igual a: ");
        calificacion2 = entrada.nextInt();
        int calificacion3;
        System.out.println("calificacion3 es igual a: ");
        calificacion3 = entrada.nextInt();
        int calificacion4;
        System.out.println("calificacion4 es igual a: ");
        calificacion4 = entrada.nextInt();
        int promedio;
        promedio = (calificacion1 + calificacion2 + calificacion3 + calificacion4) / 4;
        switch (contador) {
            case 1:
                if (promedio >= 90 && promedio <= 100) {
                    System.out.println("Su puntuacion es A");
                    break;
                }
            case 2:
                if (promedio >= 80 && promedio < 90) {
                    System.out.println("Su puntuacion es B");
                    break;
                }
            case 3:
                if (promedio >= 70 && promedio < 80) {
                    System.out.println("Su puntuacion es C");
                    break;
                }
            case 4:
                if (promedio >= 0 && promedio < 70) {
                    System.out.println("Su puntuacion es D");
                    break;
                }
        }
        System.out.printf("El promedio es: " + promedio);
    }

    public static void Ejercicio6(int contador) {
        /*Realizar un programa que permita ingresar el número de mes de un año (1,…,12), en base al
         valor ingresado presenta el número de días que tiene ese mes.*/
        switch (contador) {
            case 1:
                System.out.printf("1 entonces %s\n", "31 dias");
                break;

            case 2:
                System.out.printf("2 entonces %s\n", "28 dias");
                break;

            case 3:
                System.out.printf("3 entonces %s\n", "31 dias");
                break;

            case 4:
                System.out.printf("4 entonces %s\n", "30 dias");
                break;

            case 5:
                System.out.printf("5 entonces %s\n", "31 dias");
                break;

            case 6:
                System.out.printf("6 entonces %s\n", "30 dias");
                break;

            case 7:
                System.out.printf("7 entonces %s\n", "31 dias");
                break;

            case 8:
                System.out.printf("5 entonces %s\n", "31 dias");
                break;

            case 9:
                System.out.printf("6 entonces %s\n", "30 dias");
                break;

            case 10:
                System.out.printf("7 entonces %s\n", "31 dias");
                break;

            case 11:
                System.out.printf("5 entonces %s\n", "30 dias");
                break;

            case 12:
                System.out.printf("6 entonces %s\n", "31 dias");
                break;

            default:
                System.out.println("ninguna de las anteriores");

        }
    }

    public static void Ejercicio7(int i) {
        /*Un empresa paga a sus vendedores de la siguiente manera:
        Sueldo fijo $ 360.40 más un porcentaje de las ventas realizadas en el mes.
        Si las ventas fueron menores o iguales a $ 500, el porcentaje es de 5%
        Si las ventas fueron mayores a $ 500 y menores o iguales a $1000, el porcentaje es de 8%
        Si las ventas fueron mayores a $ 1000 y menores o iguales a $5000, el porcentaje es de 10%
        Si las ventas fueron mayores a $ 5000, el porcentaje es de 15%
        Ingresar el valor de las ventas de un empleado y calcular su sueldo en base la información dada.*/
        double sueldo = 360.40, aumento, sueldoTotal;

        Scanner entrada = new Scanner(System.in);
        double ventas;
        System.out.println("Ingrese el valor de las ventas: ");
        ventas = entrada.nextDouble();

        if (ventas <= 500) {
            aumento = sueldo * 0.05;
            sueldoTotal = sueldo + aumento;

        } else if (ventas > 500 && ventas <= 1000) {
            aumento = sueldo * 0.08;
            sueldoTotal = sueldo + aumento;

        } else if (ventas > 1000 && ventas <= 5000) {
            aumento = sueldo * 0.10;
            sueldoTotal = sueldo + aumento;

        } else {
            aumento = sueldo * 0.15;
            sueldoTotal = sueldo + aumento;
        }
        System.out.printf("El sueldo del empleado asciende a: %.2f USD\n", sueldoTotal);
    }

    private static void Ejercicio8(int i) {
        /*Ingresar por teclado tres variables, dichas variables siempre tendrán como valores letras
        mayúsculas de abecedario. 
        Sabiendo que por ejemplo la letra “E” es menor que la letra “P”; establezca una solución que
        permita determinar ¿Cuál de las tres letras ingresadas, aparece primero en el abecedario ?
        Ejemplo: Si el usuario ingresa:
        v1 = “Z”
        v2 = “B”
        v3 = “C”
        La primera letra que aparece en el abecedario es B*/
    }

    private static void Ejercicio9(int i) {
        /*Dos triángulos son congruentes si tienen la misma forma y tamaño, es decir, su ángulos y lados
        correspondientes son iguales. Elaborar un algoritmo que lea los tres ángulos y tres lados de dos
        triángulos e imprima si son congruentes, caso contrario que imprima que no son congruentes.*/
        Scanner triangulo = new Scanner(System.in);

        boolean lado1, lado2, lado3;

        System.out.println("Escriba el lado 1");
        lado1 = triangulo.nextBoolean();

        System.out.println("Escriba el lado 2");
        lado2 = triangulo.nextBoolean();

        System.out.println("Escriba el lado 3");
        lado3 = triangulo.nextBoolean();

        if (lado1 == lado2 == lado3) {
            System.out.println("Triangulo 1");
        } 
        if (lado1 == lado2 == lado3) {
            System.out.println("Triangulo 2");
        } 
            }
        }
    

