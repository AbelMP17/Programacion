package clases.ejercicios.ejercicio33;

import java.util.*;

public class Notas {
    private List<Double> notas;
    
    public Notas(){
        notas = new ArrayList<>();
    }
    
    public void añadirNota(double n){
        notas.add(n);
    }
    
    public int getTotalNotas(){
        return notas.size();
    }
    
    public double calcularNotaMedia(){
        if(notas.isEmpty()){
            throw new IllegalStateException( "no hay notas para calcular la nota media");
        }
        double suma = 0;
        for(double n : notas){
            suma+=n;
        }
        return suma/notas.size();
    }
    
    public double calcularNotaMaxima(){
        if(notas.isEmpty()){
            throw new IllegalStateException( "no hay notas para calcular la nota máxima");
        }
        return Collections.max(notas);
    }
}
