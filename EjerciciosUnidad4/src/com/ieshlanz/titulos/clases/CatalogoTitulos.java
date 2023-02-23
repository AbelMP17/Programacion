package com.ieshlanz.titulos.clases;

import java.util.*;

public interface CatalogoTitulos {

    public List<Titulo> getTitulos();
    public boolean guardar();
    public boolean añadirTitulo(String dni, String nombre, String estudio, Estado estado);
    public default Titulo getTitulo(String dni){
        Titulo tituloEncontrado = null;
        
        List<Titulo> titulos = this.getTitulos();
        for(int i = 0; i<= titulos.size();i++){
            Titulo ti = titulos.get(i);
            if(dni.equals(ti.getDNI())){
               tituloEncontrado = ti; 
            }
        }
        if(tituloEncontrado==null){
            throw new NoSuchElementException("No se ha encontrado un Titulo con ese dni");
        }
        return tituloEncontrado;
    }
}
