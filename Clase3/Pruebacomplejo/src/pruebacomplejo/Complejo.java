/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacomplejo;

public class Complejo {
    private double numReal;
    private double numImag;
  
    public Complejo() {}
    
    public Complejo(double numReal, double numImag) {
        this.numReal = numReal;
        this.numImag = numImag;
    }

    public double getNumReal() {
        return numReal;
    }

    public void setNumReal(double numReal) {
        this.numReal = numReal;
    }

    public double getNumImag() {
        return numImag;
    }

    public void setNumImag(double numImag) {
        this.numImag = numImag;
    }
   
    public Complejo sumar(Complejo a){
        Complejo aux = new Complejo();
        aux.numReal = numReal + a.numReal;
        aux.numImag = numImag + a.numImag;
        return aux;
    }
   
    public Complejo restar(Complejo c){
        Complejo aux = new Complejo();
        aux.numReal = numReal - c.numReal;
        aux.numImag = numImag - c.numImag;
        return aux;
    }

    public String toString() {
        return "(" + numReal + ", " + numImag + ")";
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Complejo other = (Complejo) obj;
        if (this.numReal != other.numReal) {
            return false;
        }
        if (this.numImag != other.numImag) {
            return false;
        }
        return true;
    } 
}

