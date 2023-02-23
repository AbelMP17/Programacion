/*
En la librería ObjetosSencillos.jar se encuentra la clase Caja. Haz un programa que
cree una caja que contenga el mensaje “Bienvenidos al instituto”. Consultar el mensaje con la
caja cerrada y mostrar el resultado. Abrir la caja y consultar el mensaje. Mostrar el resultado.
 */
import bpc.daw.objetos.*;
public class Ejercicio09 {
    public static void main(String[] a){
        Caja box = new Caja("Bienvenidos al instituto.");
        System.out.println("Comprobamos el mensaje con la caja cerrada.");
        String mensajeCerrada = box.getMensaje();
        System.out.println("- "+mensajeCerrada+"\n---------------------------------------");
        System.out.println("Ahora abrimos la caja y miramos el mensaje.");
        
        box.abrirCaja();
        String mensajeAbierta = box.getMensaje();
        System.out.println("- "+mensajeAbierta+"\n---------------------------------------");
    }
}
