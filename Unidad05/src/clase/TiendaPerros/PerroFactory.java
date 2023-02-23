package clase.TiendaPerros;
import java.util.*;
public class PerroFactory {
    
    public static Perro generarPerroAleaorio(){
        Perro p = null;
        Random r = new Random();
        double num = r.nextDouble(0,1);
        String[] nombres = {"boby","max","luna","eros"};
        String[] razas = {"pitbull","haski siberiano","chiwawa","setter"};
        
        if(num<0.5){
            int precio = r.nextInt(200, 1000);
            p = new Perro(nombres[r.nextInt(nombres.length)],precio, razas[r.nextInt(razas.length)]);
        }else{
            int precio = r.nextInt(100, 300);
            p = new PerroAbandonado(nombres[r.nextInt(nombres.length)],precio, razas[r.nextInt(razas.length)]);
        }
        return p;
    }
}
