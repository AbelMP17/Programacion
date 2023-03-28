package clase.abstracta;

import java.awt.Color;

public abstract class Vehiculo {
    private String[] pasajeros;
    private int velocidadMaximaReglamentaria;
    private Color color;
    
    public Vehiculo(VehiculoParameter parameterObject){
        this.pasajeros = new String[parameterObject.numeroPlazas];
        this.velocidadMaximaReglamentaria = parameterObject.vm;
        this.color = parameterObject.c;
    }
    public void añadirPasajero(String nombre, int sitio){
        this.pasajeros[sitio] = nombre;
    }
    public int getNumeroPasajeros(){
        int i = 0;
        for(String p : pasajeros){
            if(p!=null){
                i++;
                String frase = "holaaa";
				System.out.println(frase);
            }
        }
        return i;
    }
    
    public abstract void mover(Point point);
}
