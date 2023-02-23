
import java.io.*;
import java.util.*;

/*
Realiza un programa que pida por teclado la ruta de un directorio. En caso de que
la ruta introducida no sea un directorio, el programa mostrará un mensaje de error. En caso
contrario, el programa mostrará el número total de archivos y carpetas que contiene.
 */
public class Ejercicio21 {
    public static void main(String[] args) {
        System.out.print("Introduce la ruta de un archivo: ");
        String ruta = new Scanner (System.in).nextLine();
        File ruta1 = new File(ruta);
        File[] subdirectorio = ruta1.listFiles();
        
        if (ruta1.exists() && ruta1.isDirectory()){
            System.out.println(subdirectorio.length);
        }else {
            System.out.println("Error");
            
        }
    }
}
