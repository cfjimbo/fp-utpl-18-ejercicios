/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package christianjimbo1;

/**
 *
 * @author Usuario
 */
public class Principal {
    public static void main(String[] args) {
        EquipoFutbol [] lista_equipos = new EquipoFutbol [5];
        //Declaracion Arreglo
        EquipoFutbol n = new EquipoFutbol(); // Llamo a la clase Estudiante con la nueva variable asignada m.
        n.agregar_nombres("Liga de Quito"); // Llamo al método agregar_nombres de la clase Estudiante y le añado la cadena Christian.
        int codigo = 1; // Lista con notas double.
        n.agregar_codigos(codigo); // Llamo al método agregar_notas de la clase Estudiante.
        int puntajefinal = 10; // Lista con notas double.
        n.puntaje_final(puntajefinal);
        
        EquipoFutbol m = new EquipoFutbol(); // Llamo a la clase Estudiante con la nueva variable asignada m.
        m.agregar_nombres("Barcelona"); // Llamo al método agregar_nombres de la clase Estudiante y le añado la cadena Christian.
        int codigo1 = 2; // Lista con notas double.
        m.agregar_codigos(codigo1); // Llamo al método agregar_notas de la clase Estudiante.
        int puntajefinal1 = 7; // Lista con notas double.
        m.puntaje_final(puntajefinal1);
    
        EquipoFutbol a = new EquipoFutbol(); // Llamo a la clase Estudiante con la nueva variable asignada m.
        a.agregar_nombres("Emelec"); // Llamo al método agregar_nombres de la clase Estudiante y le añado la cadena Christian.
        int codigo2 = 3; // Lista con notas double.
        a.agregar_codigos(codigo2); // Llamo al método agregar_notas de la clase Estudiante.
        int puntajefinal2 = 5; // Lista con notas double.
        a.puntaje_final(puntajefinal2);
        
        EquipoFutbol b = new EquipoFutbol(); // Llamo a la clase Estudiante con la nueva variable asignada m.
        b.agregar_nombres("U. Catolica"); // Llamo al método agregar_nombres de la clase Estudiante y le añado la cadena Christian.
        int codigo3 = 4; // Lista con notas double.
        b.agregar_codigos(codigo3); // Llamo al método agregar_notas de la clase Estudiante.
        int puntajefinal3 = 9; // Lista con notas double.
        b.puntaje_final(puntajefinal3);
        
        EquipoFutbol c = new EquipoFutbol(); // Llamo a la clase Estudiante con la nueva variable asignada m.
        c.agregar_nombres("Aucas"); // Llamo al método agregar_nombres de la clase Estudiante y le añado la cadena Christian.
        int codigo4 = 5; // Lista con notas double.
        c.agregar_codigos(codigo4); // Llamo al método agregar_notas de la clase Estudiante.
        int puntajefinal4 = 8; // Lista con notas double.
        c.puntaje_final(puntajefinal4);
        
        lista_equipos[0] = n; // lista_estudiantes en la posición 0 asignada a m.
        lista_equipos[1] = m; // lista_estudiantes en la posición 0 asignada a n.
        lista_equipos[2] = a;
        lista_equipos[3] = b;
        lista_equipos[4] = c;
        
        Operador operador = new Operador(); // Llamo a la clase Paralelo con la nueva variable asignada paralelo.
        operador.agregar_equipos(lista_equipos); // Llamo al método agregar_estudiantes de la clase Paralelo y le añado la lista_estudiantes.
        operador.presentar_datos();
    }
}
