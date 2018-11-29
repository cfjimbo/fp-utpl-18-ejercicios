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
public class EquipoFutbol {

    private String nombre;
    private int codigo;
    private int puntajefinal;

    public void agregar_nombres(String n) { // Método agregar_nombres y añado una cadena a ingresar.
        nombre = n; // variable nombres se convierte en mayúsculas todo.
    }

    public void agregar_codigos(int nuevos_codigos){ // Método agregar_notas y añado una lista double a ingresar.
        codigo = nuevos_codigos; // variable notas se le añade a las notas ingresadas en la lista.
    }
    
    public void puntaje_final(int puntaje_final) { // Método agregar_notas y añado una lista double a ingresar.
        puntajefinal = puntaje_final;
    }
    public int obtener_puntaje_final(){ // Método obtener_nombres String (cadena).
        return puntajefinal; // Retorna los nombres.
    }
    public String obtener_nombres(){ // Método obtener_nombres String (cadena).
        return nombre; // Retorna los nombres.
    }
}
