/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

public class Defensores  extends Jugadores {
      

     int [] gol1 = new int [4];
     int [] pase1 = new int [4];
     int [] recuperar1 = new int [4];

    public Defensores() {
    }
    
    public Defensores(int goles, int pases, int balonesRecuperados, int aux) {
        super(goles, pases, balonesRecuperados, aux);
        setGol1(goles,aux);
        setPase1(pases, aux);
        setRecuperar1(aux, aux);
       
    }

    public int valoracion() {
        int sumagol=0;
        int sumapase=0;
        int sumarecuperar=0;
        
        for(int i=0 ;i < 4;i++){
            sumagol= sumagol+ gol1[i];
            sumapase=sumapase+pase1[i];
            sumarecuperar=sumarecuperar+recuperar1[i];
        }
        int valoracionTotal = sumagol + sumapase +sumarecuperar*4;
        
        return valoracionTotal;
 
    }
    

    public int[] getGol() {
        return gol1;
    }

    public  void setGol1(int gol,int aux) {
        
        int valorgol=gol*30;
        this.gol1[aux-2] = valorgol;
    }

    public int[] getPase1() {
        return pase1;
    }

    public  void setPase1(int pase,int aux) {
        this.pase1[aux-2] = pase;
    }

    public int[] getRecuperar1() {
        return recuperar1;
    }

    public void setRecuperar1(int recuperar,int aux) {
        this.recuperar1[aux-2] = recuperar;
    }
}

