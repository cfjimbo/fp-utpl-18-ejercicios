package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Files {

    public static void main(String[] args) {
        Formatter fileOut;
        Scanner fileIn;
        String num, linea;
        try {
            // Crear el archivo con Formatter
            // Con Formatter  deben ser rutas absolutas, no pueden ser rutas relativas.
            //Crear un archivo en excel(.csv) pero para mas actualizado es xlsx
            Random aleatorio = new Random(System.currentTimeMillis());
            // Producir nuevo int aleatorio entre 0 y 99
            int intAleatorio = aleatorio.nextInt(20);
            int intAleatorio1 = aleatorio.nextInt(20);
            int intAleatorio2 = aleatorio.nextInt(20);
            fileOut = new Formatter("Files.csv");
            for (int i = 0; i < 10; i++) {
                int suma = intAleatorio+intAleatorio1+intAleatorio2; 
                fileOut.format("%d;%d;%d;%s%d\r\n", intAleatorio, intAleatorio1, intAleatorio2, " La suma es: ",suma);
            }
            //fileOut.format("%d;%d;%d\r\n", 4,3,2);
            //fileOut.format("%d;%d;%d\r\n", 6,1,9);
            fileOut.close();
            // Abrir el archivo con Scanner
            // Con Scanner sean excepciones absolutas y relativas se va a lanzar la excepcion.
            fileIn = new Scanner(new File("Files.csv"));
            // Sentencias que se utilizan para leer archivos en excel
            linea = fileIn.nextLine();
            //System.out.println(linea);
            String[] tokens = linea.split(";");
            System.out.println(tokens[0]);
            System.out.println(tokens[1]);
            System.out.println(tokens[2]);
            int suma = Integer.parseInt(tokens[0]) + Integer.parseInt(tokens[1]) + Integer.parseInt(tokens[2]);
            System.out.println("La suma es: " + suma);
            //num = fileIn.next();
            //System.out.println(num);
            fileIn.close();
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.print("Error de Apertura" + fileNotFoundException);
        }
    }

}
