/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebafactura;

public class Factura {
    String numPieza;
    String descPieza;
    int cantArticulos;
    double precioxArt;
    
    public Factura() {}
    public Factura(String numPieza, String descPieza, int cantArticulos, double precioxArt) {
        this.numPieza = numPieza;
        this.descPieza = descPieza;
        this.cantArticulos = cantArticulos;
        this.precioxArt = precioxArt;
    }

    public String getNumPieza() {
        return numPieza;
    }

    public void setNumPieza(String numPieza) {
        this.numPieza = numPieza;
    }

    public String getDescPieza() {
        return descPieza;
    }

    public void setDescPieza(String descPieza) {
        this.descPieza = descPieza;
    }

    public int getCantArticulos() {
        return cantArticulos;
    }

    public void setCantArticulos(int cantArticulos) {
        this.cantArticulos = cantArticulos;
    }

    public double getPrecioxArt() {
        return precioxArt;
    }

    public void setPrecioxArt(double precioxArt) {
        this.precioxArt = precioxArt;
    }
    
    public double obtenerMontoFactura(){
        double monto = cantArticulos * precioxArt;
        return monto;
    }
}
