/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testhablador;

import java.util.ArrayList;

public class TestHablador {
    
    public static ArrayList<Hablador> habla = new ArrayList<Hablador>();

    public static void main(String[] args) {
        
        Hablador loro = new Loro("Pedro", "loro", 4, "Abril", 1953);
        Hablador niño = new Niño("Juan", "niño", 21, 11, "Octubre", 1855);
        Hablador adulto = new Adulto("Adriana", "adulto", 24, "Septiembre", 1997);
        
        habla.add(loro);
        habla.add(niño);
        habla.add(adulto);
        
        for (Hablador platica : habla) {
            System.out.println(platica.hablar());
        }
    }
}
