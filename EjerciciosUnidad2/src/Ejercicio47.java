import java.awt.*;
import java.io.*;
import java.util.*;
/*
Consulta el pdf de la “Librería Estándar de Java” y busca la clase Desktop. Haz un
programa que pregunte al usuario la ruta de un archivo. El programa abrirá dicho archivo
usando para ello el programa que esté configurado en el sistema operativo.
 */
public class Ejercicio47 {
    public static void main(String[] args) {
        System.out.print("Escribe la ruta de un archivo: ");
        String ruta = new Scanner(System.in).nextLine();
        
        File archivo = new File(ruta);
                
        try{
            Desktop.getDesktop().open(archivo);
            System.out.println("Archivo abierto.");
        }catch (IOException error){
            System.out.println("Error");
        }
        
    }
}
