/*
Consulta el pdf de la “Librería Estándar de Java” y busca la clase Scanner. Realiza
un programa que abra el archivo “d:/frase.txt” que has creado en el ejercicio anterior y nos
muestre por pantalla las dos frases que hay guardadas en él.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class Ejercicio25 {
    public static void main(String[] args) {
        File ruta = new File("/home/usuario/Escritorio/frases.txt");
        try{
        Scanner frases = new Scanner(ruta);
        System.out.println(frases.nextLine());
        }catch(FileNotFoundException error){
            System.out.println("Hay un error en el archivo");
        }
        
    }
}
