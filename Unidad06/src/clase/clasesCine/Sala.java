package clase.clasesCine;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sala {
    private int numero;
    private int capacidad;
    private Pelicula pelicula;
    private List<Integer> plazasLibres;
    
    public Sala(int n, int c, Pelicula p){
        this.numero = n;
        this.capacidad = c;
        this.pelicula = p;
        this.plazasLibres = new ArrayList<>();
        for(int i = 1;i<=getCapacidad();i++){
            plazasLibres.add(i);
        }
    }

    public int getNumero() {
        return numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public String getPlazasLibres() {
        StringBuilder sB = new StringBuilder();
        for(Integer i : plazasLibres){
            sB.append(i+",");
        }
        return sB.toString();
    }

    public int getNumeroPlazasLibres() {
        return plazasLibres.size();
    }
    
    public int buscarPlazaLibre(){
        if(plazasLibres.isEmpty()){
            new IllegalArgumentException("No hay ninguna plaza libre en la sala");
        }
        int num = new Random().nextInt(plazasLibres.size());
        return plazasLibres.get(num);
    }
    
    public boolean reservar(int n){
        boolean esta = false;
        if(plazasLibres.contains(n)){
            for(Integer i : plazasLibres){
                if(i.equals(n)){
                    plazasLibres.remove(i);
                    esta = true;
                }
            }
        }
        return esta;
    }
    @Override
    public String toString(){
        return "Sala %d - %s".formatted(this.numero,pelicula.titulo());
    }
}
