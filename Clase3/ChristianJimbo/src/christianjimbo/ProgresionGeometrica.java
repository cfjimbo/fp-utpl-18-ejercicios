/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package christianjimbo;

/**
 *
 * @author Usuario
 */
public class ProgresionGeometrica {

    private int m = 2;
    private int n = 4; 
    public int pro = 1;

    public void Generarprogresion() {
        for (int i = 0; i < 10; i++) {
            int term = m;
            for (int k = 0; k < 10; k++) {
                term = term * m;
            }
            System.out.println(term);
            pro = pro + term;
            System.out.printf("suma = %d\n", pro);
        }
        System.out.printf("La suma de la progresion geometrica con m = %d y n = %d es: %d\n", m, n, pro);
    }

}
