package clase.Colegio;

import java.util.*;

public class JefeEstudios extends EmpleadoColegio{
    private Map<String, Integer> notasAsignaturas;
    
    public JefeEstudios(String nombre, String colegio){
        super(nombre, colegio);
        notasAsignaturas = new HashMap<>();
    }
    public String getNombreColegio(){
        return super.getColegio();
    }
    @Override
    public void recibirCalificacion(Profesor p, Alumno a, Nota nota) {
        int contador = 0;
        if(nota.getValoracion().esSuspenso()){
            contador++;
            notasAsignaturas.put(p.getAsignatura(), contador);
        }
    }
    
    public int getNumeroSuspensos(String asignatura){
        if(!notasAsignaturas.containsKey(asignatura)){
            throw new IllegalArgumentException("No se encuentra en la lista.");
        }
        return notasAsignaturas.get(asignatura);
    }
}
