package ejercicios.ejercicio18_19_20_21;

import java.util.*;

public class EmpresaLowCost implements EmpresaPaquetería{
    private Transportista[] transportistas;
    private int siguienteTransportista;
    
    public EmpresaLowCost(int n){
        transportistas = new Transportista[n];
        for(int i = 0;i<transportistas.length;i++){
            transportistas[i] = new Transportista(new Random().nextInt(40,81));
        }
        this.siguienteTransportista = 0;
    }

    @Override
    public void registrarPedido(Paquete p) {
        this.transportistas[this.siguienteTransportista].subirCamión(p);
        siguienteTransportista++;
        if(siguienteTransportista==transportistas.length){
            siguienteTransportista=0;
        }
    }

    @Override
    public List<Transportista> getTransportistas() {
        List<Transportista> t = new ArrayList<>();
        for (Transportista transportista : transportistas) {
            t.add(transportista);
        }
        return t;
    }
}
