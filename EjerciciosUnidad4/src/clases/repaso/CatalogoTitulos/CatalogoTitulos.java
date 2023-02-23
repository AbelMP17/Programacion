
package clases.repaso.CatalogoTitulos;

import java.util.List;
import java.util.NoSuchElementException;

public interface CatalogoTitulos {
    public List<Titulo> getTitulos();
    public boolean guardar();
    public boolean anadirTitulo(String dni, String nombre, String estudios, Estado estado);
    public default Titulo getTitulo(String dni){
        Titulo t = null;
        
        for(Titulo t1 : getTitulos()){
            if(t1.getDNI().equals(dni)){
                t = t1;
            }
        }
        if(t==null){
            throw new NoSuchElementException("No se ha encontrado un Titulo con ese dni");
        }
        return t;
    }
}
