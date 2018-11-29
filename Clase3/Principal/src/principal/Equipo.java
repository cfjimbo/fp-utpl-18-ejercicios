/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Scanner;

public class Equipo {
    String [] nombre = new String [11];
    int []numero = new int [11];

    public void listaJugadores( ){
         Scanner sc =new Scanner(System.in);
        for(int i =0; i < 11;i++ ){
            int aux=i+1;
            numero[i]= i+1;
            System.out.println("nombre del jugador del numero dorsal #"+aux+"#");           
            nombre[i]= sc.nextLine();
                       
        }
     } 
    
    public void presentarEquipo(){
        for(int i =0; i < 11;i++ ){
            System.out.println(nombre[i]+"    #"+numero[i]+" #");
                           
        }
    }
}
