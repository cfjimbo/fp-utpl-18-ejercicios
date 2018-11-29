/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

public abstract class Jugadores extends Equipo{
    
    protected int  goles;
    protected int pases;
    protected int balonesRecuperados;
    protected int atajadas;
    protected int aux;
    public abstract int valoracion();

    public Jugadores() {
    }
    
    public Jugadores(int atajadas) {
        this.atajadas = atajadas;
    }

    public Jugadores(int goles, int pases, int balonesRecuperados, int aux) {
        this.goles = goles;
        this.pases = pases;
        this.balonesRecuperados = balonesRecuperados;
        this.aux = aux;
    }
}