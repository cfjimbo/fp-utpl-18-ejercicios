/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;

import java.util.Scanner;

public class Ejercicio9 {

    Scanner sc = new Scanner(System.in);
    String[] Fumadores = new String[30];
    String[] NoFumadores = new String[70];
    int asiento;

    public void Llenar() {
        for (int i = 0; i < 30; i++) {
            Fumadores[i] = "libre";
        }

        for (int i = 0; i < 70; i++) {
            NoFumadores[i] = "libre";
        }
    }

    public void reservacionFumadores() {

        if (cerrarReservas() == true) {
            System.out.println("Número del asiento");
            asiento = sc.nextInt();
            asiento = asiento - 1;
            if (Fumadores[asiento].equals("Ocupado")) {
                System.out.println("Ya está ocupado");
            } else {
                Fumadores[asiento] = "Ocupado";
                System.out.println("Se ha reservado con éxito");
            }
        } else {
            System.out.println("No hay asientos");
        }

    }

    public void reservacionNoFumadores() {
        if (cerrarReservas1() == true) {
            System.out.println("Número del asiento");
            asiento = sc.nextInt();
            asiento = asiento - 1;
            if (NoFumadores[asiento].equals("Ocupado")) {
                System.out.println("Ya está ocupado");
            } else {
                NoFumadores[asiento] = "Ocupado";
                System.out.println("Se ha reservado con exito");
            }
        } else {
            System.out.println("No hay asientos");
        }
    }

    public void eliminarReserva() {
        int plaza;
        System.out.println("Numero del asiento a eliminar reserva");
        asiento = sc.nextInt();
        System.out.println("plaza a eliminar reserva");
        plaza = sc.nextInt();

        switch (plaza) {
            case 1:
                Fumadores[asiento] = "libre";
                break;
            case 2:
                NoFumadores[asiento] = "libre";
        }
    }

    public boolean cerrarReservas() {
        int contador = 0;
        for (int i = 0; i < Fumadores.length; i++) {
            if (NoFumadores[i].equals("ocupado")) {
                contador += 1;
            }
        }

        if (contador < Fumadores.length) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cerrarReservas1() {
        int contador = 0;
        for (int i = 0; i < NoFumadores.length; i++) {
            if (NoFumadores[i].equals("ocupado")) {
                contador += 1;
            }
        }

        if (contador < NoFumadores.length) {
            return true;
        } else {
            return false;
        }
    }

    public void presentarPlazas() {
        System.out.println("-----PLAZA FUMADORES-----");
        for (int i = 0; i < Fumadores.length; i++) {
            System.out.println("Plaza  # " + i + " # esta :" + Fumadores[i]);
        }
        System.out.println("-----PLAZA NO FUMADORES-----");
        for (int i = 0; i < NoFumadores.length; i++) {
            System.out.println("Plaza  # " + i + " # esta :" + NoFumadores[i]);
        }
    }
}
