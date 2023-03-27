/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.Transformacion;

import java.io.IOException;
import java.util.*;

/**
 *
 * @author usuario
 */
public class EjemploPFNull {
    private static void trabajar(Persona p){
        try{
            p.trabajar();
        }catch(IOException error){
            System.out.println(error.getMessage());
        }     
    }
    public static void main(String[] args) {
//        Persona p = new Persona("Antonio", 30,new Persona("Cain",9));
//        System.out.println(p.getHijo().getNombre());
//
//        Optional<Persona> h = p.getHijo();
//        if(h.isEmpty()){
//            System.out.println("No tiene hijos.");
//        }else{
//           Persona hijo = h.get();
//            System.out.println(hijo.getNombre());
//        }
//
//        
//        p.getHijo().ifPresentOrElse(
//                hijo -> System.out.println(hijo.getNombre()),
//                () -> System.out.println("No tiene hijos")
//        );
    
        List<Persona> personas = List.of(
                new Persona("Antonio",40),
                new Persona("Luis",15),
                new Persona("Manuel",60),
                new Persona("María",12)
        );
        personas.forEach(p -> trabajar(p));
        personas.forEach(EjemploPFNull::trabajar);
        
    }
}
