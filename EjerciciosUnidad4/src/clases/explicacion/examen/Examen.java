package clases.explicacion.examen;

import java.util.*;

public class Examen {
    private List<String> alumnos;
    private List<Double> notas;
    
    public Examen(){
        alumnos = new ArrayList<>();
        notas = new ArrayList<>();
    }
    public void añadirNota(String alumno, double nota){
        if(nota>=0){
            alumnos.add(alumno);
            notas.add(nota);
        }else{
            throw new IllegalArgumentException("Número negativo");
        }
        
    }
    public double getNota(String alumno){
        return notas.get(alumnos.indexOf(alumno));
    }
    
    public double getNotaMedia(){
        if(alumnos.isEmpty()){
            throw new IllegalStateException("Lista vacia.");
        }        
        double suma = 0;
        for(Double n : notas){
            suma += n;
        }
        return suma/notas.size();
    }
    
    public boolean mediaAprobado(){
        return getNotaMedia()>=5;
    }
    
    public List<String> getAprobados(){
        List<String> aprobados = new ArrayList<>();
                
        /*for(int i = 0; i<alumnos.size();i++){
            if(getNota(alumnos.get(i))>=5){
                aprobados.add(alumnos.get(i));
            }
            
        }*/
        
        for(String a : alumnos){
            if(getNota(a)>=5){
                aprobados.add(a);
            }
        }
        
        return aprobados;
    }
    
    
    
}
