package tarea_excepciones;
import tarea_excepciones.Tarea_A_Exception;
import java.util.ArrayList;

public class Banco{
    public static ArrayList <Cuenta_Ahorros> cuentas = new ArrayList<>();
    public static ArrayList <Cuenta_Cheques> cuenta1 = new ArrayList<>();
    public static ArrayList <Cuenta_Platino> cuenta2 = new ArrayList<>();
    static Cuenta_Ahorros cuentaAhorro = new Cuenta_Ahorros("Adriana", "1105");
    static Cuenta_Cheques cuentaCheques = new Cuenta_Cheques("Christian", "hola");
    static Cuenta_Platino cuentaPlatino = new Cuenta_Platino("Josè", "Hi");
    public static void main(String[] args) throws tarea_excepciones.Tarea_A_Exception {
            System.out.println("Saldo de la cuenta: "+cuentaAhorro.retiro(100, 300, 0.10));
            System.out.println("Saldo de la cuenta: "+cuentaCheques.retiro(250, 270, 0.10));
            System.out.println("Saldo de la cuenta: "+cuentaPlatino.retiro(250, 270, 0.10));
    }
}
