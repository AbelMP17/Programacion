package clase.TiendaPerros;

import java.util.Random;
import java.util.Set;
import java.util.HashSet;
public class PerroAbandonado extends Perro{
    private Set<String> enfermedades;
    
    public PerroAbandonado(String n,int p, String r){
        super(n,p,r);
        this.enfermedades = new HashSet<>();
        rellenarEnfermedades();
    }
    private void rellenarEnfermedades(){
        String[] e = {"rabia","sarna","pulgas","covid"};
        Random random = new Random();
        int numeroEnfermedades = random.nextInt(e.length);
        for(int i = 0;i<numeroEnfermedades;i++){
            int enfermedad = random.nextInt(e.length);
            enfermedades.add(e[enfermedad]);
        }
    }
    
    public Set<String> getEnfermedades(){
        return enfermedades;
    }
    
    public boolean estaSano(){
        return enfermedades.isEmpty();
    }
}
