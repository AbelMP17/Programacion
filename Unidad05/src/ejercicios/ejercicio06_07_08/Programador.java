package ejercicios.ejercicio06_07_08;

import java.util.*;

public class Programador extends TrabajadorTecleante{
    private Map<String,String> lenguajes;
    
    public Programador(String n, int s, int ndni, char ldni, int ppm) {
        super(n, s, ndni, ldni, ppm);
        this.lenguajes = new HashMap<>();
    }
    
    public void aprenderLenguaje(String lenguaje, String holaMundo){
        lenguajes.put(lenguaje, holaMundo);
    }
    
    public void programarHolaMundo(String lenguaje){
        for (Map.Entry<String, String> l : lenguajes.entrySet()) {
            if(l.getKey().equals(lenguaje)){
                System.out.println(l.getValue());
            }
        }
    }
    
}
