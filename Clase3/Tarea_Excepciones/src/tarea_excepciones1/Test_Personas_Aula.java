package tarea_excepciones1;

import java.util.Scanner;

public class Test_Personas_Aula {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Paralelo o = new Paralelo();
        Personas_Aula p1 = new Personas_Aula();
        Estudiantes o1 = new Estudiantes();
        Profesores p2 = new Profesores();
        int op = 1, op1, op2;
        int cont = 1, cont1 = 0;

        try {
            while (op != 0) {
                System.out.println("1. Ingresar estudiante");
                System.out.println("2. Ingresar profesores");
                System.out.println("3. Crear horario de los profesores");
                System.out.println("4. Crear dia de clases");
                System.out.println("5. Ingresar notas");
                System.out.println("6. Presentar resultados");
                System.out.println("0. Terminar");
                op = leer.nextInt();
                switch (op) {
                    case 1:
                        for (int i = 0; i < 15; i++) {
                            p1.ingresarDatos(i);
                        }
                        break;
                    case 2:
                        for (int x = 0; x < 3; x++) {
                            p1.ingresarDatos1(x);
                        }
                        break;
                    case 3:
                        p1.horario();
                        break;
                    case 4:

                        cont1++;
                        System.out.println("Paralelo 1");
                        System.out.println("Paralelo 2");
                        System.out.println("Paralelo 3");
                        op1 = leer.nextInt();
                        switch (op1) {
                            case 1:
                                System.out.println("Hora 1");
                                System.out.println("Hora 2");
                                System.out.println("Hora 3");
                                op2 = leer.nextInt();
                                switch (op2) {
                                    case 1:
                                        o.paralelo(p1.paralelos[0][0]);
                                        p2.disponibilidad();
                                        Aula(cont1, op2, p1.paralelos[0][0]);
                                        break;
                                    case 2:
                                        o.paralelo1(p1.paralelos[0][1]);
                                        p2.disponibilidad();
                                        Aula(cont1, op2, p1.paralelos[0][1]);
                                        break;
                                    case 3:
                                        o.paralelo2(p1.paralelos[0][2]);
                                        p2.disponibilidad();
                                        Aula(cont1, op2, p1.paralelos[0][2]);
                                        break;
                                }
                                break;
                            case 2:
                                System.out.println("Hora 1");
                                System.out.println("Hora 2");
                                System.out.println("Hora 3");
                                op2 = leer.nextInt();
                                switch (op2) {
                                    case 1:
                                        o.paralelo(p1.paralelos[1][0]);
                                        p2.disponibilidad();
                                        Aula(cont1, op2, p1.paralelos[1][0]);
                                        break;
                                    case 2:
                                        o.paralelo(p1.paralelos[1][1]);
                                        p2.disponibilidad();
                                        Aula(cont1, op2, p1.paralelos[1][1]);
                                        break;
                                    case 3:

                                        o.paralelo(p1.paralelos[1][2]);
                                        p2.disponibilidad();
                                        Aula(cont1, op2, p1.paralelos[1][2]);
                                        break;
                                }
                                break;
                            case 3:
                                System.out.println("Hora 1");
                                System.out.println("Hora 2");
                                System.out.println("Hora 3");
                                op2 = leer.nextInt();
                                switch (op2) {
                                    case 1:
                                        o.paralelo(p1.paralelos[2][0]);
                                        p2.disponibilidad();
                                        Aula(cont1, op2, p1.paralelos[2][0]);
                                        break;
                                    case 2:
                                        o.paralelo(p1.paralelos[2][1]);
                                        p2.disponibilidad();
                                        Aula(cont1, op2, p1.paralelos[2][1]);
                                        break;
                                    case 3:
                                        o.paralelo(p1.paralelos[2][2]);
                                        p2.disponibilidad();
                                        Aula(cont1, op2, p1.paralelos[2][2]);
                                        break;
                                }
                        }
                        break;
                    case 5:
                        o1.notas();
                        break;
                    case 6:
                        o1.promedio();
                        o1.presentarResultasdos();
                        break;
                }
            }

        } catch (Exception exception) {
            System.out.println("Valor incorrecto");
        }
    }

    public static void Aula(int cont, int op, String materia) {
        System.out.println("Clase #" + cont);
        Paralelo o = new Paralelo();
        System.out.println("Materia: " + materia);
        o.presentar(op);
    }
}
