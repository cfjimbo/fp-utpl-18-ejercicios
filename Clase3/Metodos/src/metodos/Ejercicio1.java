/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author Usuario
 */
public class Ejercicio1 {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    public static void main(String[] args) {
        Persona p1 = new Persona();
        int e = 10;
        boolean bandera = p1.acceder_estadio(e);
        if(bandera==true){
            System.out.println("Puedes entrar al estadio");
        }else{
            System.out.println("No puedes entrar al estadio");
        }
    }
}