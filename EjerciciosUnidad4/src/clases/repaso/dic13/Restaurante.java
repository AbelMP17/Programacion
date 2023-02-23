
package clases.repaso.dic13;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.*;

public class Restaurante {
  private String nombre;
  private Map<String, Integer> carta;

  // constructor principal
  public Restaurante(String n, Map<String, Integer> p) {
    nombre = n;
    carta = p;
  }


  public Restaurante(String n) {
    this(n, Map.of("Bocadillo", 5, "Sopa", 8, "Filete", 10));

  }
   
  public void añadir(String plato, int precio){
      carta.put(plato, precio);
  }
  
  public String getNombre() {
    return this.nombre;

  }

  public int getPrecio(String plato) {
    if(!carta.containsKey(plato)){
        throw new IllegalArgumentException("El plato no se encuentra en la carta.");
    }
    return carta.get(plato);

  }

  public boolean estaDisponible(String plato) {
    boolean respuesta = false;
    if (carta.containsKey(plato)) {
        respuesta = true;
    }
    return respuesta;
  }

  public List<String> getPlatosCaros() {
    List<String> platosCaros = new ArrayList<>();
     
    for(Map.Entry<String,Integer> i : carta.entrySet()){
        if(i.getValue() > 12){
            platosCaros.add(i.getKey());
        }
    }
    
    return platosCaros;
  }

  public int getCuenta(String[] platos) {
    int cuenta = 0;
    for(String plato : platos){
        if(carta.containsKey(plato)){
            for(Map.Entry<String,Integer> i : carta.entrySet()){
                cuenta+=i.getValue();
            } 
        }else{
            throw new IllegalArgumentException("El plato no se ofrece.");
        }
    }
    
    return cuenta;
    
  }
  
  public void guardar()throws IOException{
        PrintWriter pr = new PrintWriter("menu.txt");
        for(Map.Entry<String,Integer> i : carta.entrySet()){
            pr.println("Plato: "+i.getKey()+" / Precio: "+i.getValue());
        }
        pr.close();
  }

}
