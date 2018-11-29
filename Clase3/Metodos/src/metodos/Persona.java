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
public class Persona {
    public boolean acceder_estadio(int edad){
        boolean valor = false;
        if(edad >=18){
            valor = true;
        }
        return valor;
    }
}
