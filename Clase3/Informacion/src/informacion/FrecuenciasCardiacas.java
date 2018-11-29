/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package informacion;

public class FrecuenciasCardiacas {
    String primerNombre;
    String apellido;
    int dia, mes, año;

    public FrecuenciasCardiacas(String primerNombre, String apellido, int dia, int mes, int año) {
        this.primerNombre = primerNombre;
        this.apellido = apellido;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    public int getEdad() {
        int edad;
        edad = 2018 - this.año;
        return edad;
    }

    public int getFrecuenciaCardiacaMax() {
        int edad;
        int frecuencia;
        edad = 2018 - this.año;
        frecuencia = 220 - edad;
        return frecuencia;
    }

    public double getFrecuenciaCardiacaEsper() {
        int edad;
        int frecuencia;
        double frecuenciaEsper;
        edad = 2018 - this.año;
        frecuencia = 220 - edad;
        frecuenciaEsper = frecuencia * 0.5;
        return frecuenciaEsper;
    }

    public double getFrecuenciaCardiacaEsper2() {
        int edad;
        int frecuencia;
        double frecuenciaEsper;
        edad = 2018 - this.año;
        frecuencia = 220 - edad;
        frecuenciaEsper = frecuencia * 0.85;
        return frecuenciaEsper;
    }

    public String toString() {
        return (getPrimerNombre() + " " + getApellido() + " " + getDia() + " " + getMes() + " " + getAño() + " " 
                + getEdad()+" "+getFrecuenciaCardiacaMax()+" "+getFrecuenciaCardiacaEsper()+
                getFrecuenciaCardiacaEsper2() );
    }

    public void Mensaje(){
        System.out.println("***Calculadora de la Frecuencia Cardiaca Esperada***\n");
        System.out.println("Nombre del paciente: "+getPrimerNombre());
        System.out.println("Apellido del paciente: "+getApellido());
        System.out.print("Fecha de Nacimiento: "+getDia()+"/"+getMes()+"/"+getAño());
        System.out.println("\nLa frecuencia Cardiaca máxima es: "+getFrecuenciaCardiacaMax());
        System.out.println("La frecuencia esperada del 50% es: "+getFrecuenciaCardiacaEsper());
        System.out.println("La frecuencia esperada del 80% es: "+getFrecuenciaCardiacaEsper2());
    }
}
