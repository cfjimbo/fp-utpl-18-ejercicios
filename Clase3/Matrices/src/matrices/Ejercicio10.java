/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;
import java.util.Scanner;


public class Ejercicio10 {
    Scanner teclado = new Scanner(System.in);
    float notas[][]=new float [20][5];   
    float mediaAlumnos[]=new float [20]; 
    float mediaMateria[]=new float [5];
    
    public void Notas(){
        for(int i =0;i<20;i++){
            for(int j=0;j<5;j++){
                System.out.println("Ingrese las notas para los estudiantes "+i);
                notas[i][j]=teclado.nextFloat();
            }
        }
    }
    
    public void mediaAlumno(){
        float suma=0;
        float media;
        for(int i =0;i<20;i++){
            for(int j=0;j<5;j++){
                suma += notas[i][j];
            }
            media=suma/5; 
            suma=0;
            mediaAlumnos[i]=media;
            System.out.println("Media del alumno "+i+" es de: "+media);
        }   
    }
    
    public void mediaGeneral(){
        float suma=0,media;
        for (int i =0;i< 20;i++){
           suma += mediaAlumnos[i]; 
        }
        media = suma/20;
        System.out.println("La media general de la clase es de: "+media);
    }
    public void mediaMateria (){
        float suma=0,media ;
        for(int i =0;i<5;i++){
            for(int j=0;j<20;j++){                
                suma=suma+notas[j][i];
            }
            media = suma/20;
            mediaMateria[i]=media;
            suma=0;
            System.out.println("La media de la asignatura "+i+" es de "+media);
        }
    }
    public void porcentageFaltas(){
        float faltas,dias,porcentaje;
        System.out.println("Ingrese las faltas del alumno");
        faltas = teclado.nextFloat();
        System.out.println("Ingrese los dias de asistencia");
        dias = teclado.nextFloat();
        porcentaje= (faltas*100.0f)/dias;
        System.out.println("El porcentaje en faltas del alumno es del "+porcentaje);    
    }
}

