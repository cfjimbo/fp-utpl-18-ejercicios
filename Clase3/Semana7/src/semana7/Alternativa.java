/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana7;

/**
 *
 * @author Usuario
 */
public class Alternativa {
    
    public static void main(String[] args) {
        // El encabezado de la instruccion for incluye la inicializacion.
        // La condicion de continuacion de ciclo y el incremento.
        int suma=0;
        for (int contador = 1; contador <= 20; contador++){
            if (contador%2==0){
            suma = suma + contador ;
            System.out.printf("%d ", contador);
            }
            else{
            System.out.println("No es numero par");
            }
        }
        System.out.println(); //Imprime una nueva linea
    } // Fin de la clase contadorFor
}
