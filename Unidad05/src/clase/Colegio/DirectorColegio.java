package clase.Colegio;

import java.util.*;

public class DirectorColegio extends EmpleadoColegio{
    public static class DirectorColegioData {
		public List<Nota> notasColegio;

		public DirectorColegioData() {
		}
	}

	private DirectorColegioData data = new DirectorColegioData();
	@Override
    public void recibirCalificacion(Profesor p, Alumno a, Nota nota) {
        data.notasColegio.add(nota);
    }
    
    public double getNotaMediaColegio(){
        double suma = 0;
        for(Nota n : data.notasColegio){
            suma += n.valorNumerico();
        }
        return suma/data.notasColegio.size();
    }
}
