
import java.io.*;
import java.util.*;

/*
Utiliza las clases y métodos de la librería de entrada y salida que se indican a
continuación para hacer un programa que pregunte por teclado la ruta de un archivo de texto
(.txt) y a continuación, use un BufferedReader para leer una por una todas sus líneas y
mostrarlas por pantalla a la vez.
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        System.out.println("Escribe la ruta de un archivo: ");
        String ruta = new Scanner(System.in).nextLine();
        
        File archivo = new File(ruta);
        
        boolean repetir = true;
       
        int i = 0;
                
        while(repetir){
            try{
                FileInputStream archivo2 = new FileInputStream(archivo);
                InputStreamReader lector = new InputStreamReader(archivo2);
                BufferedReader leer = new BufferedReader(lector);
                String contenido = leer.readLine();
                System.out.println("Contenido del archivo: \n"+contenido);
            }catch(IOException error){
                System.out.println("Error");
                repetir=false;
            }
            i++;
            
            if (i>0){
                repetir=false;
            }
        }
    }
}
