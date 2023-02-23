package clase.Colegio;

import java.util.*;

public class DirectorColegio extends EmpleadoColegio{
    private List<Nota> notasColegio;
    public DirectorColegio(String nombre, String colegio){
       super(nombre, colegio);
       notasColegio = new ArrayList<>();
    }
    
    @Override
    public void recibirCalificacion(Profesor p, Alumno a, Nota nota) {
        notasColegio.add(nota);
    }
    
    public double getNotaMediaColegio(){
        double suma = 0;
        for(Nota n : notasColegio){
            suma += n.valorNumerico();
        }
        return suma/notasColegio.size();
    }
}
