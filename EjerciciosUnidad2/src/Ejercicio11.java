/*
Haz otro programa que cree dos cajas, cada una con un mensaje diferente. Hacer
un programa que intercambie los mensajes de las dos cajas.
 */
import java.util.*;
import bpc.daw.objetos.*;
public class Ejercicio11 {
    public static void main(String[] a){
        Caja box = new Caja("Frase cualquiera parte 1.");
        Caja box2 = new Caja("Frase cualquiera parte 2.");
       
        box.abrirCaja();
        box2.abrirCaja();
        
        String mensajeAbierta = box.getMensaje();
        String mensajeAbierta2 = box2.getMensaje();
        
        System.out.println("- Caja 1: "+mensajeAbierta);
        System.out.println("- Caja 2: "+mensajeAbierta2+"\n---------------------------------------");
        
        System.out.print("Introduce una frase que quieras para la caja 1: ");
        String cambiarCaja1 = new Scanner (System.in).nextLine();
        
        System.out.print("Introduce una frase que quieras para la caja 2: ");
        String cambiarCaja2 = new Scanner (System.in).nextLine();
        
        box.cambiarMensaje(cambiarCaja1);
        box2.cambiarMensaje(cambiarCaja2);
        
        String mensajeNuevo2 = box.getMensaje();
        String mensajeNuevo3 = box2.getMensaje();
             
        System.out.println("- Caja 1: "+mensajeNuevo2);
        System.out.println("- Caja 2: "+mensajeNuevo3+"\n---------------------------------------");
        
    }
}
