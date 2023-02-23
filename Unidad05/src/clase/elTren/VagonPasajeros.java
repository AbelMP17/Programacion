package clase.elTren;

import java.util.*;

public class VagonPasajeros extends VagonPesoLimitado{
    private List<Persona> personas;
    
    public VagonPasajeros(int pm){
        super(pm);
        personas = new ArrayList<>();
    }

    public void subir(Persona p){
        if(p.getEquipaje()!=null){
            while(getVagonSiguiente() instanceof Vagon){
                if(getVagonSiguiente() instanceof VagonEquipaje ve){
                    ve.añadir(p.getEquipaje());
                }else{
                    throw new IllegalArgumentException("No se puede guardar la maleta del pasajero.");
                }
            }
        }
        personas.add(p);
        if(comprobarPesoMaximoExcedido()){
            System.out.println("Vagon excedido: "+comprobarPesoMaximoExcedido());
        }
    }
    
    public void bajar(Persona p){
        if(p.getEquipaje()!=null){
            while(getVagonSiguiente() instanceof Vagon){
                if(getVagonSiguiente() instanceof VagonEquipaje ve){
                    ve.retirar(p.getEquipaje());
                }else{
                    throw new IllegalArgumentException("No se puede guardar la maleta del pasajero.");
                }
            }
        }
        personas.remove(p);
    }
    @Override
    public int getPeso() {
        int i = 0;
        for(Persona j : personas){
            i+=j.getPeso();
        }
        return i;
    }
}
