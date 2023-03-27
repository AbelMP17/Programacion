package clase.Transformacion;

import java.util.*;

public class EjemplosProgramacionFuncional {
    public static void main(String[] args) {
        ArrayList<String> frases = new ArrayList<>();
        frases.add("hola");
        frases.add("adios");
        frases.add("mano");
        frases.add("pie");
        frases.add("cabeza");
        
        /*
        //Muestra por pantalla los reglones de la lista
            //Como lo hariamos antes
            for(String i : frases){
                System.out.println(i);
            }
            
            //Programacion Funcional
            frases.forEach(f->System.out.println(f));
        */    
        // Programa que borra de la lista las palabras que llevan la letra a
        for(int i = frases.size()-1;i>=0;i--){
            if(frases.get(i).contains("a")){
                frases.remove(i);
            }
        }
        
        //Programacion Funcional
        frases.removeIf(s->s.contains("a"));
        
        frases.forEach(f->System.out.println(f));
        
        //Creamos una lista de personas con 3 personal y filtramos que solamente se quede con los menores de edad
        List<Persona> lista = List.of(new Persona("Maria", 50),new Persona("Jose", 10), new Persona("Abel", 12));
        lista.removeIf(p->p.getEdad()>=18);
        
        //Pasamos a mayusculas las palabras de la lista frases
        for(int i = 0;i<frases.size();i++){
            String palabra = frases.get(i);
            String mayus = palabra.toUpperCase();
            
            frases.set(i, mayus);
        }
        
        frases.replaceAll(s->s.toUpperCase());
        
        
    }
}
