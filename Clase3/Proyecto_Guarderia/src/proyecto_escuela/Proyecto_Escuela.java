
package proyecto_escuela;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Proyecto_Escuela {

    public static ArrayList<Personal_Escuela> personal = new ArrayList<Personal_Escuela>();

    public static void main(String[] args) {
        Personal_Escuela alumno = new Estudiantes("Christian", 10, 7, 12);
        Personal_Escuela profesores = new Profesores("José", "Matemáticas", 38, 8, 13);
        Personal_Escuela servicio = new Servicio("Mario", 6, 12);
        Personal_Escuela directorA = new Director_Area("Adriana", "Inicial", 40, 8, 13);

        personal.add(alumno);
        personal.add(profesores);
        personal.add(servicio);
        personal.add(directorA);

        Scanner leer = new Scanner(System.in);
        boolean salir = false;
        int op;
        while (!salir) {
            System.out.println("********REGISTRO ESCUELA 18 DE NOVIEMBRE*********");
            System.out.println("********MENÚ**********");
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
                        alumno.Registrar();
                        break;
                    case 2:
                        profesores.Registrar();
                        break;
                    case 3:
                        servicio.Registrar();
                        break;
                    case 4:
                        directorA.Registrar();
                        break;
                    case 5:
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
