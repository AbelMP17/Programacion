package ejercicios.ejercicio04_05;

import java.util.*;

public class Hotel extends Edificio{
    private List<String> clientes;
    private int maximo;

    public Hotel(String d, int np, int m) {
        super(d, np);
        if(m<=0){
            throw new IllegalArgumentException("El numero máximo de personas no puede ser negativo");
        }
        this.clientes = new ArrayList<>();
        this.maximo = m;
    }
    
    public void añadirCliente(String c){
        if(clientes.size()>=maximo){
            throw new IllegalArgumentException("El cupo maximo de clientes ha llegado a su cupo");
        }
        clientes.add(c);
    }
    public void retirarCliente(String c){
        if(!clientes.contains(c)){
            throw new NoSuchElementException("Cliente no encontrado o ya fue eliminado");
        }
        clientes.remove(c);
    }
}
