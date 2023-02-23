package ejercicios.ejercicio18_19_20_21;

import java.util.*;

public class TransportistaOrdenado extends Transportista{
    
    public TransportistaOrdenado(long te) {
        super(te);
    }
    
    @Override
    public void enviar(){
        Collections.sort(paquetes);
        super.enviar();
    }
}
