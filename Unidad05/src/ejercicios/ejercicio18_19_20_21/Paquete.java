/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.ejercicio18_19_20_21;

import java.util.Objects;

/**
 *
 * @author usuario
 */
public class Paquete implements Comparable<Paquete>{
    
    public static final int ALTA=1;
    public static final int MEDIA=2;
    public static final int BAJA=3;
    private String producto;
    private String direccionDestino;
    private int prioridad;
    
    public Paquete(String pro, String dd, int pri){
        if(pri!=ALTA || pri!=MEDIA || pri!=BAJA){
            throw new IllegalArgumentException("Nivel de prioridad no válido");
        }
        this.producto = pro;
        this.direccionDestino = dd;
        this.prioridad = pri;
    }
    
    public String getProducto() {
        return producto;
    }

    public String getDireccionDestino() {
        return direccionDestino;
    }

    public int getPrioridad() {
        return prioridad;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.producto);
        hash = 97 * hash + Objects.hashCode(this.direccionDestino);
        hash = 97 * hash + this.prioridad;
        return hash;
    }
    
    @Override
    public boolean equals(Object o){
        boolean es = false;
        if(o instanceof Paquete p){
            if(this.producto.hashCode()==p.producto.hashCode() && this.prioridad==p.prioridad && this.direccionDestino.hashCode()==p.direccionDestino.hashCode()){
                es = true;
            }
        }
        return es;
    }
    @Override
    public int compareTo(Paquete o) {
        return this.prioridad-o.prioridad;
    }
}
