package daw.zoo;

import java.util.*;

public abstract class ContenedorAnimales {
    protected Set<Animal> animales;
    
    public ContenedorAnimales(){
        animales = new HashSet<>();
    }
    
    public boolean anadir(Animal a){
        boolean si = false;
        if(this.comprobarDisponibilidadPlaza(a)){
            si = true;
            animales.add(a);
        }
        return si;
    }
    
    public boolean retirar(Animal a){
        boolean si = false;
        if(animales.contains(a)){
            si = true;
            animales.remove(a);
        }
        return si;
    }
    
    public int getPesoActual(){
        int p = 0;
        for(Animal a : animales){
            p+=a.getPeso();
        }
        return p;
    }
    
    public int getNumeroAnimales(){
        return animales.size();
    }
    
    protected abstract boolean comprobarDisponibilidadPlaza(Animal a);
    
}
