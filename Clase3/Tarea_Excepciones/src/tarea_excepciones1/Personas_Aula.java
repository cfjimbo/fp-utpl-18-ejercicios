package tarea_excepciones1;

import java.util.Scanner;

public class Personas_Aula {

    Scanner entrada = new Scanner(System.in);
    int numEstu = 20;
    String[] nombreEstu = new String[numEstu];
    String[] nombreProfe = new String[3];
    String[] sexoEstu = new String[numEstu];
    String[] sexoProfe = new String[3];
    int[] edadEstu = new int[numEstu];
    int[] edadProfe = new int[3];
    String[][] paralelos = new String[3][3];
    String nota;

    public void ingresarDatos(int num) {
        int puesto = num;
        int sex = 0;
        System.out.println("-----DATOS ESTUDIANTES----");
        System.out.println("Ingrese nombre " + puesto);
        nombreEstu[puesto] = entrada.next();
        System.out.println("Ingrese edad " + puesto);
        edadEstu[puesto] = entrada.nextInt();
        System.out.println("Selecione el sexo" + puesto);
        System.out.println("1. Masculino \n2. Femenino");
        sex = entrada.nextInt();
        if (sex == 1) {
            sexoEstu[puesto] = "MASCULINO";
        } else if (sex == 2) {
            sexoEstu[puesto] = "FEMENINO";
        }
    }

    public void ingresarDatos1(int num) {
        int puesto = num;
        int sex = 0;
        System.out.println("-----DATOS PROFESORES-----");
        System.out.println("0...MATEMATICA\n1..FISICA\n2..FILOSOFIA");
        System.out.println("Ingrese el nombre " + puesto);
        nombreProfe[puesto] = entrada.next();
        System.out.println("Ingrese la edad " + puesto);
        edadProfe[puesto] = entrada.nextInt();
        System.out.println("Seleccione el sexo" + puesto);
        System.out.println("1...masculino \n2...femenino");
        sex = entrada.nextInt();
        if (sex == 1) {
            sexoProfe[puesto] = "MASCULINO";
        } else if (sex == 2) {
            sexoProfe[puesto] = "FEMENINO";
        }
    }

    public void horario() {
        int op;
        System.out.println("---CREAR EL HORARIO---");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Materia a la hora " + i + " paralelo" + j);
                System.out.println("Ingrese el numero de la materia a ingresar");
                System.out.println("1..MATEMATICA\n2...FISICA\n3...FILOSOFIA");
                op = entrada.nextInt();
                switch (op) {
                    case 1:
                        paralelos[i][j] = "MATEMATICA";
                    case 2:
                        paralelos[i][j] = "FISICA";
                        break;
                    case 3:
                        paralelos[i][j] = "FILOSOFIA";
                        break;
                }
            }
        }

    }
}

class Estudiantes extends Personas_Aula {

    Scanner esca = new Scanner(System.in);
    int[] notasMate = new int[numEstu];
    int[] notasFisica = new int[numEstu];
    int[] notasFilo = new int[numEstu];
    int[] promedio = new int[numEstu];

    public void notas() {

        for (int i = 0; i < 20; i++) {
            System.out.println("Notas de Matemàtica");
            System.out.println("Ingrese la nota del estudiante" + nombreEstu[i]);
            notasMate[i] = esca.nextInt();
        }
        for (int i = 0; i < 20; i++) {
            System.out.println("Notas de fisica");
            System.out.println("ingrese la nota del estudiante" + nombreEstu[i]);
            notasMate[i] = esca.nextInt();
        }
        for (int i = 0; i < 20; i++) {
            System.out.println("notas de filosofia");
            System.out.println("ingrese la nota del estudiante" + nombreEstu[i]);
            notasMate[i] = esca.nextInt();
        }
    }

    public void promedio() {
        for (int i = 0; i < 20; i++) {
            promedio[i] = (notasMate[i] + notasFilo[i] + notasFisica[i]) / 3;
        }
    }

    public void presentarResultasdos() {
        for (int i = 1; i <= 20; i++) {
            if (promedio[i] > 6) {
                System.out.println("el alumno " + nombreEstu[i] + " esta aprobado");
            } else {
                System.out.println("el alumno " + nombreEstu[i] + " no aprueba");
            }
        }
    }
}

class Profesores extends Personas_Aula {

    Scanner sc1 = new Scanner(System.in);

    public boolean disponibilidad() {
        int aux;
        System.out.println("¿El profesor asistira a la clase?");
        System.out.println("1...SI\n2...NO");
        aux = entrada.nextInt();
        switch (aux) {
            case 1:
                return true;

            case 2:
                motivo();
                return false;
        }
        return false;
    }

    public void motivo() {
        int op = 0;
        System.out.println("seleccionar el motivo de la inasistencia");
        System.out.println("1...reuniones \n2...salud\n3...nota");
        op = entrada.nextInt();
        switch (op) {
            case 1:
                nota = "POR EL MOTIVO DE TENER REUNION";
                break;
            case 2:
                nota = "POR EL MOTIVO DE SALUC";
                break;
            case 3:
                nota = entrada.next();
                break;
        }
    }
}

class Paralelo extends Estudiantes {

    Scanner sc2 = new Scanner(System.in);
    int[] asis_Mate = new int[numEstu];
    int[] asis_Fisica = new int[numEstu];
    int[] asis_Filosofia = new int[numEstu];

    public void paralelo(String materia) {
        int aux;
        for (int i = 0; i < 5; i++) {
            System.out.println(nombreEstu[i] + " esta presente\n1...si\n2...no");
            aux = sc2.nextInt();
            switch (aux) {
                case 1:
                    Asistencia(materia, i);
                    break;
                case 2:
                    break;
            }
        }
    }

    public void paralelo1(String materia) {
        int aux;
        for (int i = 5; i < 10; i++) {
            System.out.println(nombreEstu[i] + " esta presente\n1...si\n2...no");
            aux = sc2.nextInt();
            switch (aux) {
                case 1:
                    Asistencia(materia, i);
                    break;
                case 2:
                    break;
            }
        }
    }

    public void paralelo2(String materia) {
        int aux;
        for (int i = 10; i < 20; i++) {
            System.out.println(nombreEstu[i] + " esta presente\n1...si\n2...no");
            aux = sc2.nextInt();
            switch (aux) {
                case 1:
                    Asistencia(materia, i);
                    break;
                case 2:
                    break;
            }
        }
    }

    public void Asistencia(String materia, int num) {
        System.out.println(materia);
        switch (materia) {
            case "MATEMATICA":
                asis_Mate[num] = asis_Mate[num] + 1;
                System.out.println("asistencia registrada");
                break;
            case "FISICA":
                asis_Fisica[num] = asis_Fisica[num] + 1;
                System.out.println("asistencia registrada");
                break;
            case "FILOSOFIA":
                asis_Filosofia[num] = asis_Filosofia[num] + 1;
                System.out.println("asistencia registrada");
                break;
        }
    }

    public void presentar(int num) {
        int op = num;
        switch (op) {
            case 1:
                for (int i = 0; i < 5; i++) {
                    System.out.println(nombreEstu[i]);

                }
                break;
            case 2:
                for (int i = 5; i < 10; i++) {
                    System.out.println(nombreEstu[i]);
                }
                break;
            case 3:
                for (int i = 10; i < 20; i++) {
                    System.out.println(nombreEstu[i]);

                }
                break;
        }
    }
}
