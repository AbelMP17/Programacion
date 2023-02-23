package ejercicios.ejercicio18_19_20_21;

import java.util.*;

public class Transportista {
    protected List<Paquete> paquetes;
    private long tiempoEntrega;
    
    public Transportista(long te){
        this.paquetes = new ArrayList<>();
        this.tiempoEntrega = te;
    }
    public void subirCamión(Paquete p){
        paquetes.add(p);
    }
    
    public void enviar(){
        for(Paquete p : paquetes){
            try{
                Thread.sleep(tiempoEntrega*60*1000);
                System.out.println("El paquete %s con prioridad %d ha llegado a: %s".formatted(p.getProducto(),p.getPrioridad(),p.getDireccionDestino()));
            }catch(InterruptedException error){
                System.out.println(error);
            }
        }
        paquetes.clear();
    }
}
