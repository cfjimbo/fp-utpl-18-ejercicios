/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasenlazadas;
import java.util.Scanner;

public class Nodo {
    int valor;
    Nodo sig;
    Scanner leer = new Scanner(System.in);
    
    public Nodo(int valor){
        this.valor= valor;
        this.sig = null;
    }
}
