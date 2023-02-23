
import java.io.*;
import java.util.*;

/*
Utiliza las clases PrintWriter y BufferedReader de la librería de entrada y salida
para realizar un programa que muestre al usuario este menú de opciones que se repite
continuamente hasta que se pulsa la opción de salir:
    1. Añadir nuevo alumno
    2. Ver los datos de un alumno
    3. Salir
Al pulsar cada opción, sucede esto:
 Opción 1: El programa preguntará el dni, nombre, dirección y teléfono de un alumno y
guardará estos tres últimos datos en líneas diferentes en un archivo de texto llamado
(poner el dni).txt
 Opción 2: El programa pregunta un dni y recupera del archivo (poner el dni).txt el
nombre, dirección y teléfono del alumno, mostrándolos por pantalla.
 Opción 3: El programa finalizará. 

 */
public class Ejercicio13 {
    public static void main(String[] args) {
        
        boolean repetir = true;
        while(repetir){
            System.out.print("""
                             Elige una opcion: 
                                 - 1. Añadir nuevo alumno.
                                 - 2. Ver los datos de un alumno.
                                 - 3. Salir
                                 Opcion elegida: """);
            int opcion = new Scanner (System.in).nextInt();
            
            switch (opcion){
                
                case 1 -> {
                    System.out.print("Dni: ");
                    String dni = new Scanner (System.in).nextLine();
                    
                    System.out.print("Nombre: ");
                    String nom = new Scanner (System.in).nextLine();
                    
                    System.out.print("Direccion: ");
                    String dir = new Scanner (System.in).nextLine();
                    
                    System.out.print("Telefono: ");
                    String tlf = new Scanner (System.in).nextLine();
                    
                    try{
                        PrintWriter archivo = new PrintWriter(dni+".txt");
                        archivo.print(dni+", ");
                        archivo.println(nom);
                        archivo.println(dir);
                        archivo.println(tlf);
                        archivo.close();
                        
                        System.out.println("Su documento ha sido creado con éxito.");
                    }catch(FileNotFoundException error){
                        System.out.println("Error");
                    }
                }
                
                case 2 ->{
                    System.out.println("Dime tu DNI: ");
                    String dni2 = new Scanner (System.in).nextLine();
                              
                    try{
                        File fil = new File(dni2+".txt");
                        FileReader lector = new FileReader(fil);
                        BufferedReader lector2 = new BufferedReader(lector);
                        String linea1 = lector2.readLine();
                        String linea2 = lector2.readLine();
                        String linea3 = lector2.readLine();
                        System.out.println(linea1+"\n"+linea2+"\n"+linea3);
                    }catch (IOException error){
                        System.out.println("Error");
                    }
                    
                }
                
                case 3 -> {
                    repetir = false;
                }
                default->{
                    System.out.println("""
                                       Ha habido un error con la opcion seleccionada.
                                       Por favor introduzca una de estas tres opciones: """);
                }
            }
                    
          
        }
    }
}
