package clase.Colegio;

import java.util.ArrayList;
import java.util.List;
public record Alumno(String nombre, List<Nota> notas) implements CalificacionListener{
    public double getNotaMedia(){
        double suma = 0;
        for(Nota n : notas){
            suma += n.valorNumerico();
        }
        return suma/notas.size();
    }
    
    public Alumno(String nombre){
        this(nombre, new ArrayList<>());
    }

    @Override
    public void recibirCalificacion(Profesor p, Alumno a, Nota nota) {
        if(a.equals(this)){
            notas.add(nota);
        }
    }
}
