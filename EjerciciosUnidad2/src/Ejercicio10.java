/*
Haz otro programa que cree una caja con un mensaje cualquiera. Abrir la caja,
consultar el mensaje y mostrarlo por pantalla. Sustituir el mensaje por otro. Volver a
consultarlo y mostrar el resultado.
 */
import bpc.daw.objetos.*;
public class Ejercicio10 {
    public static void main(String[] a){
        Caja box = new Caja("Un mensaje cualquiera.");        
        
        box.abrirCaja();
        
        String mensajeAbierta = box.getMensaje();
       
        System.out.println("- "+mensajeAbierta+"\n---------------------------------------");
        System.out.println("Cambiamos el mensaje: ");
        
        box.cambiarMensaje("Cualquier otro mensaje pero cambiado.");
        
        String mensajeAbierta2 = box.getMensaje();
        System.out.println("- "+mensajeAbierta2+"\n---------------------------------------");
    }
}
