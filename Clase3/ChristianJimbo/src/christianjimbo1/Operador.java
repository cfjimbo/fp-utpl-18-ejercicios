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
public class Operador {

    private EquipoFutbol[] equipos; // Lista unidimensional String de uso privado a variable estudiantes.

    public void agregar_equipos(EquipoFutbol[] lista) { // Void método agregar_estudiantes y añado la lista a ingresar de la clase Estudiante.
        equipos = lista; // Variable estudiantes ingresa la lista.
    }

    public int calcular_mejor_equipo() {
        int mayor = 10;
        for (int i = 0; i < equipos.length; i++) {
            if (equipos[i].obtener_puntaje_final() > mayor) {
                mayor = equipos[i].obtener_puntaje_final();
            }
        }
        return mayor;
    }

    public int calcular_peor_equipo() {
        int menor = 0;
        for (int i = 0; i < equipos.length; i++) {
            if (equipos[i].obtener_puntaje_final() < menor) {
                menor = equipos[i].obtener_puntaje_final();
            }
        }
        return menor;
    }

    public void presentar_datos() { // Void método presentar_datos.
        System.out.printf("En el campeonato barrial Loja es fútbol el puntaje del equipo ganador es:\n"); // Imprimo el reporte.
        System.out.printf("%d",calcular_mejor_equipo());
        System.out.printf("\nY;\n");
        System.out.printf("El equipo que debe superarse para la próxima edición con el puntaje menor es:\n");
        System.out.printf("%d",calcular_peor_equipo());
    }
}
