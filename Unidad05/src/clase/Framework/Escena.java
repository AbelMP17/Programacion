package clase.Framework;

import bpc.daw.consola.*;
import java.util.*;
public abstract class Escena implements ElementoJuego{
    protected Juego juego;
    protected Consola consola;
    private List<GameObject> juegos;
    
    protected abstract void añadirObjetosIniciales();
    
    protected void añadir(GameObject obj){
        obj.consola = this.consola;
        obj.juego = this.juego;
        obj.escena = this;
        obj.inicializar();
    }
    
    protected void retirar(GameObject obj){
        obj.finalizar();
        juegos.remove(obj);
        obj.consola = null;
        obj.juego = null;
        obj.escena = null;
    }
    
    @Override
    public void inicializar() {
        if(juego==null || consola==null){
            throw new IllegalStateException("Hay que añadir la escena al juego para poder inicializarla");
        }
        juegos = new ArrayList<>();
        this.añadirObjetosIniciales();
    }

    @Override
    public void ejecutarFrame() {
        for (int i = 0; i < this.juegos.size(); i++) {
            this.juegos.get(i).ejecutarFrame();
        }
    }

    @Override
    public void finalizar() {
        for(int i = 0 ; i<juegos.size() ; i++){
            juegos.remove(i);
        }
    }
}
