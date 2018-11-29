/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testhablador;

public abstract class Hablador {
    
    public abstract String hablar();
    
}

class Loro extends Hablador {
    
    String nombre,tipo, mes;
    int dia, año;
    
    public Loro (String nombre, String tipo, int dia, String mes, int año){
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

class Niño extends Hablador {
    
    String nombre,tipo, mes;
    int edad, dia, año;
    
    public Niño (String nombre, String tipo, int edad, int dia, String mes, int año){
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = edad;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
    
    public String hablar() {
        return "*****SEGUNDO REPORTE*****\n\n"+"Hola, me llamo "+nombre+" y se hablar\nSoy racional\nTengo "+edad+" años\nNací el "+dia+"/"+mes+"/"+año+"\nSoy un "+tipo+"\n";
    }
}

class Adulto extends Hablador {
    
    String nombre,tipo, mes;
    int edad, dia, año;
    
    public Adulto (String nombre, String tipo, int dia, String mes, int año){
        this.nombre = nombre;
        this.tipo = tipo;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
    
    public int getEdad() {
        int edad;
        edad = 2018 - this.año;
        return edad;
    }
    
    public String hablar() {
        return "*****TERCER REPORTE*****\n\n"+"Hola, me llamo "+nombre+" y se hablar\nSoy racional\nTengo "+getEdad()+" años\nNací el "+dia+"/"+mes+"/"+año+"\nSoy un "+tipo+"\n";
    }
}
