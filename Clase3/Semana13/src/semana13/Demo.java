/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana13;

/**
 *
 * @author Usuario
 */
public class Demo {

    int x;

    public void presentar_variable() {
        System.out.println(x);
    }
    public void presentar_variable_local(int x){
        System.out.println(x);
    }
    public void presentar_variable_dos(int x){
        System.out.println(this.x);
    }
}
