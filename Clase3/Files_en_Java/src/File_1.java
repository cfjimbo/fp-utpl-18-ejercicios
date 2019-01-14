
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class File_1 {

    public static void main(String[] args) {
        String nom = "Daniel", ape ="Jimenez", username = "cfjimbo";
        try {
            Formatter archivo = new Formatter("Archivo.txt");
            archivo.format("%s %d\r\n", "hola", 4);
            archivo.format("Nombre: %s\r\nApellidos: %s\r\nUsuario: %s\r\n", nom, ape, username);
            archivo.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(File_1.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Este try chatch es para escribir con Scanner.
        try {
            Scanner archivo = new Scanner(new File("Archivo.txt"));
            // File objFiles = new File("Archi.txt");
            // Scanner archivo = new Scanner(objFiles);
            // System.out.println(archivo.nextLine());
            while (archivo.hasNext()){
               System.out.println(archivo.nextLine()); 
            }
        } catch (Exception exception) {
        }
    }
}
