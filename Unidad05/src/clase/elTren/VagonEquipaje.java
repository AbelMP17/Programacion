package clase.elTren;

import java.util.ArrayList;
import java.util.List;

public class VagonEquipaje extends VagonPesoLimitado{
    private List<Maleta> almacen;
    
    public VagonEquipaje(int pm){
        super(pm);
        almacen = new ArrayList<>();
    }
    
    @Override
    public void enganchar(Vagon v){
        if(v instanceof VagonEquipaje ve){
            super.enganchar(ve);
        }
    }
    
    public void añadir(Maleta m){
        if(super.comprobarPesoMaximoExcedido()){
            almacen.add(m);
        }
    }
    public void retirar(Maleta m){
        almacen.remove(m);
    }
    @Override
    public int getPeso() {
        int i = 0;
        for(Maleta j : almacen){
            i += j.peso();
        }
        return i;
    }
}
