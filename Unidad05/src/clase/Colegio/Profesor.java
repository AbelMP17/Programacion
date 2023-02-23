package clase.Colegio;

import java.util.*;

public class Profesor{
    private String nombre;
    private String asignatura;
    private List<CalificacionListener> interesados;
    private Map<Alumno,Double> notas;    
    
    public Profesor(String nombre, String asignatura){
        this.nombre = nombre;
        this.asignatura = asignatura;
        this.interesados = new ArrayList<>();
        this.notas = new HashMap<>();
    }
    public void addCalificacionLsitener(CalificacionListener interesado){
        interesados.add(interesado);
    }
    public void calificar(Alumno a, double n){
        notas.put(a, n);
    }
    
    public String getAsignatura(){
        return asignatura;
    }
}
