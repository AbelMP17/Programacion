package clase.abstracta;

import java.awt.Color;

public abstract class Vehiculo {
    private String[] pasajeros;
    private int velocidadMaximaReglamentaria;
    private Color color;
    
    public Vehiculo(int numeroPlazas, int vm, Color c){
        this.pasajeros = new String[numeroPlazas];
        this.velocidadMaximaReglamentaria = vm;
        this.color = c;
    }
    public void añadirPasajero(String nombre, int sitio){
        this.pasajeros[sitio] = nombre;
    }
    public int getNumeroPasajeros(){
        int i = 0;
        for(String p : pasajeros){
            if(p!=null){
                i++;
            }
        }
        return i;
    }
    
    public abstract void mover(int x, int y);
}
