/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosejercicios;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese número de alumnos de la asignatura");
        int n_alumnos = entrada.nextInt();
        
        double [] valores_notas = new double[n_alumnos];
        
        Estadistica est = new Estadistica();
        
        for (int i=0; i< valores_notas.length; i++){ // obtener el promedio de las notas
            System.out.printf("Ingrese las nota del alumno %d: ", i+1); // Ingresar las notas de los alumnos de la asignatura
            valores_notas[i] = entrada.nextDouble();
        }
            double  promedio = est.obtener_promedio(valores_notas); // Extraigo de Estadística el promedio, el máximo y el mínimo calculado de las notas
            double  mayor = est.obtener_mayor_nota(valores_notas);
            double  menor = est.obtener_menor_nota(valores_notas);
            System.out.printf("El promedio de las notas es: %.2f\n", promedio); // Presento el promedio de las notas ingresadas
            System.out.printf("El maximo de las notas es: %.2f\n", mayor); // Presento la máxima de las notas ingresadas
            System.out.printf("El minimo de las notas es: %.2f\n", menor); // Presento la minima de las notas ingresadas
        }
}
