/*
Consulta el pdf de la librería “java io” y busca la clase PrintWriter. Realiza un
programa que pregunte por teclado al usuario dos frases. El ordenador creará un archivo
llamado “d:/frases.txt” (asegúrate de tener permisos de escritura, si no, pon otra carpeta) y
escribirá las dos frases en él.
 */
import java.util.*;
import java.io.*;
public class Ejercicio24 {
    public static void main(String[] a){
        System.out.println("Escribe una frase: ");
        String frase1 = new Scanner (System.in).nextLine();
        
        System.out.println("Escribe otra frase: ");
        String frase2 = new Scanner (System.in).nextLine();
        
        String ruta = "/home/usuario/Escritorio/frases.txt";
        
        
        //1ª forma de cerrar esta acción (Try-With-resources)
        try (PrintWriter archivo = new PrintWriter(ruta)){
            archivo.print(frase1+" "+frase2);
            //2ª forma de cerrar la acción
            //archivo.close();
            System.out.println("El archivo se ha creado con éxito. "+archivo);
        }catch(FileNotFoundException error){
            System.out.println("El archivo no se ha podido crear.");
        }
        
    }
}
