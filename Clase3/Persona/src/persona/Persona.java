/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

public class Persona {
    
    public static void main(String[] args) {
        String nombre;
        int edad;
        String sexo;
        Persona1[] persona = new Persona1[5];
        
        for (int i=0; i<5;i++){
            persona[i] = new Persona1("Adriana, ", 19, ", Femenino");
        }
        for (int j=0; j<5;j++){
            System.out.println(persona[j].getNombre()+persona[j].getEdad()+persona[j].getSexo());
        }
    }   
}
