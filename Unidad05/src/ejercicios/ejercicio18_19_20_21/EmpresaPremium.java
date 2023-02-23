/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.ejercicio18_19_20_21;

import java.util.List;
import java.util.Map;

/**
 *
 * @author usuario
 */
public class EmpresaPremium implements EmpresaPaquetería{
    private Transportista rapido;
    private Transportista medio;
    private Transportista lento;
    
    public EmpresaPremium(){
        rapido = new Transportista(10);
        medio = new Transportista(25);
        lento = new Transportista(50);
    }

    @Override
    public void registrarPedido(Paquete p) {
        Map.of(
                Paquete.BAJA, lento,
                Paquete.MEDIA, medio,
                Paquete.ALTA, rapido
        ).get(p.getPrioridad()).subirCamión(p);
        
    }
    
    @Override
    public List<Transportista> getTransportistas() {
        return List.of(this.rapido,this.medio, this.lento);
    }
}
