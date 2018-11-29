
package listasenlazadas;
import java.util.Scanner;

public class ListasEnlazadas {
    
    private Nodo head, tail;
    Scanner leer = new Scanner(System.in);
    public ListasEnlazadas() {
        this.head = null;
    }
    
    public void addNodo(int valor){
        Nodo nuevo = new Nodo(valor);
        nuevo.sig = head;
        head = nuevo;
    }
    
    public void showLista(){
        Nodo actual = head;
        while(actual != null){
            System.out.println(actual.valor+" ");
            actual = actual.sig;
        }
    }
    
    public void AddInicio(){
        Nodo actual = null;
        int valor;
        System.out.println("Ingrese valor");
        valor = leer.nextInt();
        if(listaVacia()){
            actual = new Nodo(valor);
            head = tail = actual;
        } else{
            actual.sig = head;
            head = actual;
        }
    }
    
    public void AddFinal(Nodo head, Nodo tail){
        Nodo actual;
        int dato;
        System.out.println("Ingrese el dato");
        dato = leer.nextInt();
        actual = new Nodo(dato);
        if(listaVacia()){
            head = tail = actual;
        } else{
            tail.sig = actual;
            tail = actual;
        }
    }
    
    public boolean listaVacia(){
        if(head==null){
            return true;    
        }else{
            return false;
        }
    }
    
    public void eliminar(){
        
        System.out.println("Ingrese el dato a eliminar");
        int elem = leer.nextInt();
        if(listaVacia()){
            System.out.println("Lo siento mijin no se encontró el dato");
        } else{
            Nodo actual=head;
            if(head.sig == null){
                if(elem==head.valor){
                    head=tail=null;
                } else{
                    if(actual.valor==elem){
                        head=actual.sig;
                    } else{
                        while(actual.sig!=null){
                            if(actual.sig.valor==elem){
                                actual.sig= actual.sig.sig;
                            }
                            actual=actual.sig;
                        }
                    }
                }
            }
        }
    }
    
    public static void main(String[] args) {
        ListasEnlazadas miLista= new ListasEnlazadas();
        miLista.addNodo(22);
        miLista.addNodo(12);
        miLista.addNodo(17);
        miLista.addNodo(25);
        miLista.showLista();
        Scanner leer = new Scanner(System.in);
        int op;
        do{
            System.out.println("********MENÚ**********");
            System.out.println("Ingresar Dato Inicio[1] ");
            System.out.println("Ingresar Dato Final[2] ");
            System.out.println("Eliminar elementos [3] ");
            System.out.println("Reservar[4] ");
            System.out.println("Salir[0] ");
            op = leer.nextInt();
        }
        while(op!=0);
            switch(op){
                case 1: 
                    miLista.AddInicio();
        }
    }
}
