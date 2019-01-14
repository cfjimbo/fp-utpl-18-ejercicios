package arboles_binarios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Nodo {

    int info;
    Nodo izq;
    Nodo der;
    Nodo actual;

    public Nodo(int _info) {
        this.info = _info;
        this.izq = null;
        this.der = null;
    }

    public static void main(String[] args) {
        ABB abb = new ABB();
        Scanner leer = new Scanner(System.in);
        boolean salir = false;
        int op, num;
        while (!salir) {
            System.out.printf("%80s\n%70s\n", "Escuela 18 de Noviembre", "MENÚ");
            System.out.println("¿Desea saber las horas de su asistencia?.\nSeleccione a que parte de la escuela corresponde");
            System.out.println("Alumno [1]");
            System.out.println("Profesores [2]");
            System.out.println("Personal de Limpieza [3]");
            System.out.println("Director de Área [4]");
            System.out.println("Salir[5] ");
            try {
                op = leer.nextInt();
                switch (op) {
                    case 1:
                        abb.Insertar(5);
                        //personal.get(0).Registrar();
                        break;
                    case 2:
                        abb.Eliminar(8);
                        break;
                    case 3:
                        servicio.Registrar();
                        break;
                    case 5:
                        salir = true;
                    default:
                        System.out.println("Salió del Menú.\nFINALIZADO");
                        break;
                }
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Debes ingresar un número");
                leer.next();
            }
        }
    }
}
