package ejercicios.ejercicio18_19_20_21;

import java.util.*;

public interface EmpresaPaquetería {
    public void registrarPedido(Paquete p);
    public List<Transportista> getTransportistas();
    public default void enviarPaquetes(){
        for(Transportista t : getTransportistas()){
            t.enviar();
        }
    }
}
