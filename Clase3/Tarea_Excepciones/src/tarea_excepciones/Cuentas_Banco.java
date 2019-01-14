package tarea_excepciones;
import tarea_excepciones.Tarea_A_Exception;

public class Cuentas_Banco {
    String nombre;
    String num_cuenta;
    public double interes;
    public Cuentas_Banco(String nombre, String num_cuenta) {
        this.nombre = nombre;
        this.num_cuenta = num_cuenta;
    } 
    public Cuentas_Banco() {
    }
}
class Cuenta_Ahorros extends Cuentas_Banco{
    double retiro;
    public Cuenta_Ahorros(String nombre, String num_cuenta) {
        super(nombre, num_cuenta);
    }
    public Cuenta_Ahorros() {
    }
    public double retiro(double saldo, double retiro, double interes) throws tarea_excepciones.Tarea_A_Exception{
        if (saldo > retiro) {
                    saldo -= retiro;
                    interes = (saldo * interes);
                } else {
                    try {
                        throw new tarea_excepciones.Tarea_A_Exception();
                    } catch (tarea_excepciones.Tarea_A_Exception tarea_excepciones_tarea_A_Exception) {
                        System.err.println(tarea_excepciones_tarea_A_Exception);
                    }
                }
        return (saldo +interes);
    }
}
class Cuenta_Cheques extends Cuentas_Banco {
    double saldo;
    double retiro;
    public Cuenta_Cheques(String nombre, String num_cuenta) {
        super(nombre, num_cuenta);
    }
    public Cuenta_Cheques() {
    }
    public double retiro(double saldo, double retiro, double interes) throws tarea_excepciones.Tarea_A_Exception{
        if (saldo > retiro) {
                    saldo -= retiro;
                    interes = (saldo * interes);
                } else {
                    saldo -= retiro;
                    interes = (saldo * interes);
                }
        return (saldo +interes)*-1;
    }
}
class Cuenta_Platino extends Cuentas_Banco {
    double saldo;
    double retiro;
    public Cuenta_Platino(String nombre, String num_cuenta) {
        super(nombre, num_cuenta);
    }
    public Cuenta_Platino() {
    }
    public double retiro(double saldo, double retiro, double interes) throws tarea_excepciones.Tarea_A_Exception{
        interes =0.10;
        if (saldo > retiro) {
                    saldo -= retiro;
                    interes = (saldo * interes);
                } else {
                    saldo -= retiro;
                    interes = (saldo * interes);
                }
        return (saldo +interes)*-1;
    }
}