package clase.Persona;

import java.util.*;

public class Paciente {
    private int numeroSeguridadSocial;
    private String nombre;
    private List<String> enfermedades;
    
    public Paciente(int ns, String n){
        numeroSeguridadSocial = ns;
        nombre = n;
        enfermedades = new ArrayList<>();
    }
    
    
    
    @Override
    public String toString(){
        return numeroSeguridadSocial+" : "+nombre+" : "+enfermedades.toString();
    }
    
    @Override
    public boolean equals(Object o){
        boolean resultado = false;
        if(o instanceof Paciente p){
            resultado = this.nombre.equals(p.nombre) && this.enfermedades.equals(p.enfermedades) && this.numeroSeguridadSocial==p.numeroSeguridadSocial;
        }
        return resultado;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + this.numeroSeguridadSocial;
        hash = 17 * hash + Objects.hashCode(this.nombre);
        hash = 17 * hash + Objects.hashCode(this.enfermedades);
        return hash;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public List<String> getEnfermedades() {
        return enfermedades;
    }
}
