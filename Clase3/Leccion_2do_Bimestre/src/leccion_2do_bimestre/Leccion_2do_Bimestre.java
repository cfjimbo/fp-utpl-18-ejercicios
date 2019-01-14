package leccion_2do_bimestre;

import java.io.FileNotFoundException;
import java.util.Formatter;

public class Leccion_2do_Bimestre {

    public static void main(String[] args) {
        int loja, zamora, machala, total=0, sumaL1 = 0, sumaL2 = 0, sumaL3 = 0, sumaZ1 = 0, sumaZ2 = 0, sumaZ3 = 0, sumaM1 = 0, sumaM2 = 0, sumaM3 = 0;
        int candidato = 0;
        try {
            Formatter fileIn = new Formatter("FileINPUT.csv");
            fileIn.format("%s;%s;%12s", "\t", "\t", "DATOS DE ENTRADA");
            fileIn.format("\r\n");
            fileIn.format("%12s;%12s;%12s;%12s;%12s", "CANDIDATO", "LOJA", "ZAMORA", "MACHALA", "TOTAL");

            for (int i = 0; i < 1000000; i++) {
                for(int j = 0; j <= 3; j++){
                    candidato = (int) (Math.random() *3 ) + 1;
                }
                loja = (int)Math.floor(Math.random() * (0 - (0 - 11))) + 0;
                zamora = (int)Math.floor(Math.random() * (0 - (0 - 11))) + 0;
                machala = (int)Math.floor(Math.random() * (0 - (0 - 11))) + 0;
                total = loja + zamora + machala;
                
                fileIn.format("\r\n");
                switch (candidato) {
                    case 1:
                        sumaL1= sumaL1+loja;
                        sumaZ1=sumaZ1+zamora;
                        sumaM1=sumaM1+machala;
                        break;
                    case 2:
                        sumaL2= sumaL2+loja;
                        sumaZ2=sumaZ2+zamora;
                        sumaM2=sumaM2+machala;
                        break;
                    case 3:
                        sumaL3= sumaL3+loja;
                        sumaZ3=sumaZ3+zamora;
                        sumaM3=sumaM3+machala;
                        break;
                    default:
                        break;
                }
               
                fileIn.format("%s%d;%d;%d;%d;%d", "CANDIDATO ", candidato, loja, zamora, machala, total);
            }
            fileIn.close();
            
            Formatter fileOut = new Formatter("FileOUTPUT.csv");
            
            int total1=sumaL1+sumaZ1+sumaM1;
            int total2=sumaL2+sumaZ2+sumaM2;
            int total3=sumaL3+sumaZ3+sumaM3;
            String ganador = null;
            if (total1>total2&&total1>total3) {
                ganador="CANDIDATO 1";                    
            }else if (total2>total1&&total2>total3) {
                ganador="CANDIDATO 2";
            }else if (total3>total1&&total3>total2) {
                ganador="CANDIDATO 3";
            }
            fileOut.format("%12s;%12s;%12s;%12s;%12s","CANDIDATO","LOJA","ZAMORA","MACHALA", "TOTAL");
            fileOut.format("\r\n");
            fileOut.format("%12s;%d;%d;%d;%d\n","CANDIDATO 1",sumaL1,sumaZ1,sumaM1,total1);
            fileOut.format("%12s;%d;%d;%d;%d\n","CANDIDATO 2",sumaL2,sumaZ2,sumaM2,total2);
            fileOut.format("%12s;%d;%d;%d;%d\n\n\n","CANDIDATO 3",sumaL3,sumaZ3,sumaM3,total3);
            fileOut.format("%10s;%s","GANO: ",ganador);
            fileOut.close();

        } catch (FileNotFoundException fileNotFoundException) {
            System.err.print("Error de Apertura" + fileNotFoundException);
        }
    }
}
