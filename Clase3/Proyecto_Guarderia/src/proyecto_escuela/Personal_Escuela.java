package proyecto_escuela;

public abstract class Personal_Escuela {

    public String nombre;
    public int edad;
    public abstract void Registrar();
}

class Profesores extends Personal_Escuela {

    int hora_entrada,hora_salida;
    String materia;

    public Profesores(String nombre, String materia, int edad, int hora_entrada, int hora_salida) {
        this.nombre = nombre;
        this.materia = materia;
        this.edad = edad;
        this.hora_entrada = hora_entrada;
        this.hora_salida = hora_salida;
    }

    @Override
    public void Registrar() {
        int horas_asistidas;
        String aviso="";
        if (this.hora_entrada < 7 || this.hora_salida > 15) {
            aviso = "Los valores ingresados no corresponden al horario asignado al docente.";
        } else {
            if (this.hora_entrada == 7 || this.hora_salida == 15) {
                horas_asistidas = 6;
                aviso = "\nEl profesor se presentó a todas sus clases cumpliendo sus " + horas_asistidas +
                        " horas de enseñanzas de aprendizajes diarias.";
            } else {
                if (this.hora_entrada > 7 && this.hora_salida < 15) {
                    horas_asistidas = this.hora_salida - hora_entrada;
                    aviso = "\nNo se presentó a dar todas las horas de clase y desde su entrada solo trabajó " + horas_asistidas + 
                            " horas. Por ello será sancionado con suspensión de 3 días a la escuela.";
                }
            }
        }System.out.println(aviso);
    }
}

class Estudiantes extends Personal_Escuela {

   int hora_entrada=7, hora_salida=13;

    public Estudiantes(String nombre, int edad, int hora_entrada, int hora_salida) {
        this.nombre = nombre;
        this.edad = edad;
        this.hora_entrada = hora_entrada;
        this.hora_salida = hora_salida;
    }

    @Override
    public void Registrar() {
        int horas_asistidas;
        String aviso="";
        if (hora_entrada < 7 || hora_salida > 13) {
            aviso = "Los valores ingresados no corresponden al horario asignado al estudiante.";
        } else {
            if (hora_entrada == 7 || hora_salida == 13) {
                horas_asistidas = 6;
                aviso = "\nEl niño se presentó a todas sus clases cumpliendo sus " + horas_asistidas + " horas de enseñanza diarias.";
            } else {
                if (hora_entrada > 7 && hora_salida < 13) {
                    horas_asistidas = hora_salida - hora_entrada;
                    aviso = "\nNo se presentó a todas las horas de clase y desde su entrada estuvo en clases solo " + horas_asistidas + 
                            " horas. Por ello será sancionado con suspensión de 10 días a la escuela.";
                }
            }
        }System.out.println(aviso);
    }
}

class Servicio extends Personal_Escuela {
int hora_entrada=6, hora_salida=14;
    
    public Servicio(String nombre, int hora_entrada, int hora_salida) {
        
        this.nombre = nombre;
        this.hora_entrada = hora_entrada;
        this.hora_salida = hora_salida;
    }

    @Override
    public void Registrar() {
        int horas_asistidas;
        String aviso="";
        if (hora_entrada < 6 || hora_salida > 14) {
            aviso = "Los valores ingresados no corresponden al horario asignado al estudiante.";
        } else {
            if (hora_entrada == 6 || hora_salida == 14) {
                horas_asistidas = 8;
                aviso = "\nEl personal de servicio se presentó a trabajar cumpliendo sus " + horas_asistidas + " horas diarias.";
            } else {
                if (hora_entrada > 6 && hora_salida < 14) {
                    horas_asistidas = hora_salida - hora_entrada;
                    aviso = "\nNo se presentó a todas las horas laborables y desde su entrada estuvo en la escuela solo " + horas_asistidas + 
                            " horas. Por ello será sancionado con suspensión de 2 semanas a la escuela.";
                }
            }
        }System.out.println(aviso);
    }
}

class Director_Area extends Personal_Escuela{

    String seccion, servicio, estudiantes;
    int hora_entrada = 7, hora_salida = 16;

    public Director_Area(String nombre, String seccion, int edad, int hora_entrada, int hora_salida) {
        this.nombre = nombre;
        this.seccion = seccion;
        this.edad = edad;
        this.hora_entrada = hora_entrada;
        this.hora_salida = hora_salida;
    }

    @Override
    public void Registrar() {
        int horas_asistidas;
        String aviso="";
        if (hora_entrada < 7 || hora_salida > 13) {
            aviso = "Los valores ingresados no corresponden al horario asignado al estudiante.";
        } else {
            if (hora_entrada == 7 || hora_salida == 13) {
                horas_asistidas = 6;
                aviso = "\nEl Director de Área se presentó a trabajar cumpliendo sus " + horas_asistidas + " horas de trabajo diario.";
            } else {
                if (hora_entrada > 7 && hora_salida < 13) {
                    horas_asistidas = hora_salida - hora_entrada;
                    aviso = "\nNo se presentó a todas las horas de trabajo y desde su entrada estuvo en la escuela solo " + horas_asistidas + 
                            " horas. Por ello será sancionado con suspensión de 5 días a la escuela.";
                }
            }
        }System.out.println(aviso);
    }
}