/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarealistase;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TareaListasE {

    private Nodo head, tail;
    Scanner leer = new Scanner(System.in);

    public TareaListasE() {
        this.head = null;
        this.tail = null;
    }

    public void Insertar(int v) { 
        Nodo nuevo = new Nodo(v);
        Nodo ejem;
        if (listaVacia()) {
            head = nuevo;
            nuevo.sig=tail;
        }else {//Si no esta vacia
            ejem = head;
            while (ejem != null) {//Recorrer lista enlazada 
                tail = ejem.sig;
                if (nuevo.valor <= ejem.valor) {
                    nuevo.sig = head;
                    head = nuevo;
                    break;
                } else {
                    if (nuevo.valor > ejem.valor && tail == null) {
                        ejem.sig = nuevo; 
                        nuevo.sig = null;
                        break;
                    } else {
                        if (ejem.valor < nuevo.valor && tail.valor >= nuevo.valor) { 
                            ejem.sig = nuevo;
                            nuevo.sig = tail;
                            break;
                        }
                        ejem = ejem.sig; //Para que ejem vuelva a ser el siguiente numero de la lista y vuelva al ciclo.
                    }
                }
            }
        }
    }

    
    public boolean listaVacia() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public void Eliminar() {

        System.out.println("Ingrese el dato a eliminar");
        int elem = leer.nextInt();
        if (listaVacia()) {
            System.out.println("Lo siento mijin la lista se encuentra vacía");
        } else {
            Nodo actual = head;
            if (head.sig == null) {
                if (elem == head.valor) {
                    head = tail = null;
                } else {
                    if (actual.valor == elem) {
                        head = actual.sig;
                    } else {
                        while (actual.sig != null) {
                            if (actual.sig.valor == elem) {
                                actual.sig = actual.sig.sig;
                            }
                            actual = actual.sig;
                        } 
                    }
                }
            }
        }
    }
    
    public void Recorrer() {
        Nodo recorrer = head;
        while (recorrer != null) {
            System.out.println("[" + recorrer.valor + "]");
            recorrer = recorrer.sig;
        }
    }

    public static void main(String[] args) {
        TareaListasE miLista = new TareaListasE();
        Scanner leer = new Scanner(System.in);
        boolean salir = false;
        int op;
        while (!salir) {
            System.out.println("********MENÚ**********");
            System.out.println("Ingresar dato a Insertar [1] ");
            System.out.println("Recorrer lista [2] ");
            System.out.println("Eliminar dato de la lista [3] ");
            System.out.println("Salir[4] ");
            try {
                System.out.println("Escribe una de las opciones");
                op = leer.nextInt();
                switch (op) {
                    case 1:
                        miLista.Insertar(5);
                        break;
                    case 2:
                        miLista.Recorrer();
                        break;
                    case 3:
                        miLista.Eliminar();
                        break;
                    case 4:
                        salir = true;
                    default:
                        System.out.println("Salió del Menú.\nFINALIZADO");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                leer.next();
            }
        }
    }
}
