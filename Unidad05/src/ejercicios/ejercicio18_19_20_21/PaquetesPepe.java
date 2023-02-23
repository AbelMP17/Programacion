package ejercicios.ejercicio18_19_20_21;

import java.util.Collections;
import java.util.List;

public class PaquetesPepe implements EmpresaPaquetería{
    private TransportistaOrdenado pepe;
    
    public PaquetesPepe(){
        Collections.sort(pepe.paquetes);
        pepe = new TransportistaOrdenado(30); 
    }

    @Override
    public void registrarPedido(Paquete p) {
        this.pepe.subirCamión(p);
    }

    @Override
    public List<Transportista> getTransportistas() {
        return List.of(this.pepe);
    }
    
}
