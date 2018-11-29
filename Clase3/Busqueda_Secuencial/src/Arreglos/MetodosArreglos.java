/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class MetodosArreglos {

    Scanner entrada = new Scanner(System.in);

    public void leerArreglo(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("nDato ][" + i + "]: ");
            arr[i] = entrada.nextInt();
        }
    }

    public void presentarArreglo(int arr[]) { ////////////////////////////////////////////////////////
        for (int i = 0; i< arr.length;i++){}
            System.out.println();
    }

    public int Secuencial(int[] x, int elemento) {
        
        for (int i = 0; i < x.length; i++) {
            if (x[i] == elemento) {
                return i;
            }
        }
        return -1;
    }
    public int eliminar(int arre[], int elemento, int n) {
        System.out.print("Dígite el elemento a eliminar: ");
        int elim = entrada.nextInt();
        int pos = Secuencial(arre, elemento);
        if(pos!=-1){
            desplazarIzquierda(arre, pos, n);
            n=n-1;
        }
        return n;
    }

    private void desplazarIzquierda(int[] arre, int pos, int n) {
        
        for(int i = pos; i<n;i++){
            arre[pos] = arre[pos+1];
        }
    }
    
    public int Insertar(int arre[], int elemento, int n){
        int pos = Secuencial(arre, elemento);
        int elementos;
        System.out.println("Dígite el elemento a insertar: ");
        elementos = entrada.nextInt();
        /* Primer Caso.
        Public void Insertar1(int arre[], int elemento, pos){
            if(ev<arre.length){
                x[ev]=elem;
                ev++;
            }
        }
        Segundo Caso. Nos da la posición a la que quiera insertar.
        Public void Insertar2(int arre[], int elemento, pos){
            if(ev<arre.length){
                desplazarDerecha(x,pos, n.ev);        
                x[pos]=elemento;
                ev++;
            }
        }
        private void desplazarDerecha(int[] arre, int pos, int v) {
        
            for(int i = v-1; i >= pos;i--){
                arre[pos+1] = arre[pos];
            }
        }
        Tercer Caso. Insertar ordenadamente un valor en el arreglo.
        Public void Insertar3(int arre[], int elemento){
            int i = 0;
            while (arre[i] < elemento){
                i++;
            }
            Public void Insertar2(int arre[], int elemento, i){
            if(ev<arre.length){
                desplazarDerecha(x,i, n.ev);        
                x[i]=elemento;
                ev++;
                }
            }
            private void desplazarDerecha(int[] arre, int i, int v) {
        
                for(int i = v-1; i >= pos;i--){
                    arre[pos+1] = arre[pos];
                }
            }
        }
        */
        
        
        if(pos==-1){
            
        }
        return n;
    }
    /*public void Burbuja(int [] x){
            int aux;
            for(int i=x.length-1;i>0;i--){
                for(int j=0; j < i; j++){
                    if(x[j]>x[j+1]){
                        aux = x[j];
                        x[j] = x[j+1];
                        x[j+1] = aux;
                    }
                }
            }
        }
    */
}