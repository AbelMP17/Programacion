package clase.TiendaPerros;

import java.util.*;

public class Carrito {
    private List<Perro> compra;
    
    public Carrito(){
        this.compra = new ArrayList<>();
    }
    
    public void comprar(Perro p){
        this.compra.add(p);
    }
    
    public int getPrecio(){
        int precio = 0;
        for(Perro p : compra){
            if(p instanceof PerroAbandonado a){
                if(!a.estaSano()){
                    precio+=(a.getPrecio()*0.005);
                }
                precio += a.getPrecio();
            }else{
                precio += p.getPrecio();
            }
        }
        return precio;
    }
}
