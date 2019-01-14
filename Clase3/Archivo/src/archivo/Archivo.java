package archivo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class Archivo {

    public static void main(String[] args) {
        double for1, chat1, vid1, tra1, pre1, for2, chat2, vid2, tra2, pre2, fin1 = 0, fin2 = 0, total, parcial1 = 0, parcial2 = 0;
        String est, alerta = " ", promocion = "Aprobado";
        try {
            Formatter fileOut = new Formatter("Deber_Archivos_en_Java.csv");
            fileOut.format("%s;%s;%s;%s;%s;%s;%s;%s;%12s", "\t", "\t", "\t", "\t", "\t", "\t", "\t", "\t", "NOTAS");
            fileOut.format("\r\n");

            fileOut.format("%12s;%12s;%12s;%12s;%12s;%12s;%12s;%12s;%12s;%12s;%12s;%12s;%12s;%12s;%12s;%12s", 
                    "NOMBRES", "FOR1", "CHAT1", "VID1", "TRA1", "PRE1", "FOR2", "CHAT2",
                    "VID2", "TRA2", "PRE2", "FIN1", "FIN2", "TOTAL", "ALERTA", "PROMOCION");
            fileOut.format("\r\n");

            for (int i = 0; i < 10; i++) {
                est = "Estudiante " + (i + 1);
                for1 = (Math.random() * (0 - (0 - 1))) + 0;
                chat1 = (Math.random() * (0 - (0 - 1))) + 0;
                vid1 = (Math.random() * (0 - (0 - 1))) + 0;
                tra1 = (Math.random() * (5 - (0 - 1))) + 0;
                pre1 = (Math.random() * (13 - (0 - 1))) + 0;
                for2 = (Math.random() * (0 - (0 - 1))) + 0;
                chat2 = (Math.random() * (0 - (0 - 1))) + 0;
                vid2 = (Math.random() * (0 - (0 - 1))) + 0;
                pre2 = (Math.random() * (13 - (0 - 1))) + 0;
                tra2 = (Math.random() * (5 - (0 - 1))) + 0;
                if (pre1 < 8) {
                    fin1 = (Math.random() * (19 - (0 - 1))) + 0;
                    alerta = "Rendir final 1";
                    parcial1 = fin1;
                } else {
                    parcial1 = for1 + chat1 + vid1 + tra1 + pre1;
                }
                if (pre2 < 8) {
                    fin2 = (Math.random() * (19 - (0 - 1))) + 0;
                    alerta = "Rendir final 2";
                    parcial2 = fin2;
                } else {
                    parcial2 = for2 + chat2 + vid2 + tra2 + pre2;
                }
                if (pre1 < 8 && pre2 < 8) {
                    alerta = "Rendir final 1 y 2";
                }
                total = parcial1 + parcial2;
                if (total < 28) {
                    promocion = "Reprobado";
                }
                fileOut.format("%s;%.2f;%.2f;%.2f;%.2f;%.2f;%.2f;%.2f;%.2f;%.2f;%.2f;%.2f;%.2f;%.2f;%s;%s", est, for1, chat1, vid1, tra1,
                        pre1, for2, chat2, vid2, tra2, pre2, fin1, fin2, total, alerta, promocion);
                fin1 = fin2 = 0;
                alerta = " ";
                promocion = "Aprobado";

                fileOut.format("\r\n");
            }
            fileOut.close();

        } catch (FileNotFoundException fileNotFoundException) {
            System.err.print("Error de Apertura" + fileNotFoundException);
        }
    }
}
