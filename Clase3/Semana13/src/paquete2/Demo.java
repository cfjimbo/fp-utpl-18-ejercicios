/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
/**
 *
 * @author Usuario
 */
public class Demo {

    int x;

    public void presentar_variable() {
        System.out.println(x);
    }
    public void agregar_valor(int x){
        this.x = this.x + x;
    }
    public void agregar_valor(int x, int y){
        this.x = this.x + x + y;
    }
    public void agregar_valor(){
        this.x = this.x + 1000;
    }
}
