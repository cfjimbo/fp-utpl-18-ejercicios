/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_escuela;

public abstract class Escuela {
    public abstract String hablar();
}

class Estudiante extends Escuela {
    
    String nombre,tipo, mes;
    int dia, año;
    
    public Estudiante (String nombre, String tipo, int dia, String mes, int año){
        this.nombre = nombre;
        this.tipo = tipo;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
    
    public String hablar() {
        return "*****PRIMER REPORTE*****\n\n"+"Hola, su nombre es "+nombre+" y no sabe hablar\nÉl no sabe su edad\nSin embargo nació el "+dia+"/"+mes+"/"+año+"\nY es un "+tipo+"\n";
    }
}