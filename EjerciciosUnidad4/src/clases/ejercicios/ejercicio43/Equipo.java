package clases.ejercicios.ejercicio43;

import clases.ejercicios.ejercicio41.*;

public record Equipo(String nombre, int puntos){
    public Equipo{
        if(nombre.isBlank() || puntos<0){
            throw new IllegalArgumentException("Credeniciales incorrectas");
        }   
    }
    
    public Equipo(String nombre){
        this(nombre, 0);
    }
    
    public Equipo añadirCanasta(TipoCanasta t){
        return new Equipo(nombre, t.getValor());
    }
}
