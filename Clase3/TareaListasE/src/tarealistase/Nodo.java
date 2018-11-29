
package tarealistase;
import java.util.Scanner;

public class Nodo {
    int valor;
    Nodo sig;
    Scanner leer = new Scanner(System.in);
    
    public Nodo(int dato){
        this.valor= dato;
        this.sig = null;
    }
}